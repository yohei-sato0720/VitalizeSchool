package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.service.AccountFeatureService;

@Controller
@RequiredArgsConstructor
public class CustomerController {

	/** to 顧客機能 一覧画面表示*/
    @RequestMapping(value = "customer/list", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("message", "sum");
        return "customer/list";
    }

	/** to 顧客機能 詳細画面表示*/
    @RequestMapping(value = "customer/view", method = RequestMethod.GET)
    public String view(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "customer/view";
    }

    /** to 顧客機能 削除*/

	/** to 顧客機能 登録画面表示*/
    @RequestMapping(value = "customer/add", method = RequestMethod.GET)
    public String add(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "customer/add";
    }

	/** to 顧客機能 編集画面表示*/
    @RequestMapping(value = "customer/edit", method = RequestMethod.GET)
    public String edit(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "customer/edit";
    }

}