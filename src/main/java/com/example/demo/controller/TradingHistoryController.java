package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.services.AccountFeatureService;

@Controller
@RequiredArgsConstructor
public class TradingHistoryController {

	/** to 取引履歴機能 一覧画面表示*/
    @RequestMapping(value = "trading_history/list", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("message", "sum");
        return "trading_history/list";
    }

	/** to 取引履歴機能 詳細画面表示*/
    @RequestMapping(value = "trading_history/view", method = RequestMethod.GET)
    public String view(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "trading_history/view";
    }

    /** to 取引履歴機能 削除*/

	/** to 取引履歴機能 登録画面表示*/
    @RequestMapping(value = "trading_history/add", method = RequestMethod.GET)
    public String add(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "trading_history/add";
    }

	/** to 取引履歴機能 編集画面表示*/
    @RequestMapping(value = "trading_history/edit", method = RequestMethod.GET)
    public String edit(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "trading_history/edit";
    }

}