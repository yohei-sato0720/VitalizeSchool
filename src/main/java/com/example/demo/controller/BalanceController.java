package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequiredArgsConstructor
public class BalanceController {

	/** to 残高機能 一覧画面表示*/
    @RequestMapping(value = "balance/list", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("message", "sum");
        return "balance/list";
    }

	/** to 残高機能 詳細画面表示*/
    @RequestMapping(value = "balance/view", method = RequestMethod.GET)
    public String view(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "balance/view";
    }

    /** to 残高機能 削除*/

	/** to 残高機能 登録画面表示*/
    @RequestMapping(value = "balance/add", method = RequestMethod.GET)
    public String add(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "balance/add";
    }

	/** to 残高機能 編集画面表示*/
    @RequestMapping(value = "balance/edit", method = RequestMethod.GET)
    public String edit(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "balance/edit";
    }

}