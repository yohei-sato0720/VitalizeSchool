package com.example.demo.controller;

import java.util.List;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

import com.example.demo.entity.Transaction;
import com.example.demo.service.TransactionService;


@Controller
@RequestMapping("/transaction")
public class TransactionController {

/**
 * 取引履歴機能情報 Service
 */
    @Autowired
    private TransactionService transactionService;

    @RequestMapping(value="/list", method=RequestMethod.GET)
    /** to 取引履歴機能 一覧画面表示*/
    public String displayList(Model model) {
        List<Transaction> transactionlist = transactionService.searchAll();
        model.addAttribute("transactionlist", transactionlist);
        return "transaction/list";
    }
    /** to 取引履歴機能 登録画面表示*/
    @GetMapping(value = "/add")
    public String add(Model model) { return "transaction/add"; }

    /** to 取引履歴機能 process 登録*/
    @PostMapping(value = "/add")
    public String create(@ModelAttribute Transaction transaction) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
    	transaction.setInsertUserId(9001);
        transaction.setUpdateUserId(9001);

        //振込の仕方別
        if(transaction.getType() == 1 || transaction.getType() == 2) {
        	transaction.setAccountNumber(transaction.getPayAccountNumber());
        }

        //最短日付か指定の日付か
        if(transaction.getStringTradingDate() == "") {
        	Date date = new Date();
        	sdf.format(date);
            transaction.setTradingDate(date);
        }
        try {
            Date date = sdf.parse(transaction.getStringTradingDate());
            transaction.setTradingDate(date);
          } catch (ParseException e) {
            e.printStackTrace();
          }

        transactionService.save(transaction);
        return "redirect:/transaction/list";
    }

}

