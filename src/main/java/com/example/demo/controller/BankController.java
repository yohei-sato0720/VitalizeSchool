package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.services.AccountFeatureService;

@Controller
@RequiredArgsConstructor
public class BankController {

	/** to 銀行機能 一覧画面表示*/
    @RequestMapping(value = "bank/list", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("message", "sum");
        return "bank/list";
    }

	/** to 銀行機能 詳細画面表示*/
    @RequestMapping(value = "bank/view", method = RequestMethod.GET)
    public String view(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "bank/view";
    }

    /** to 銀行機能 削除*/

	/** to 銀行機能 登録画面表示*/
    @RequestMapping(value = "bank/add", method = RequestMethod.GET)
    public String add(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "bank/add";
    }

	/** to 銀行機能 編集画面表示*/
    @RequestMapping(value = "bank/edit", method = RequestMethod.GET)
    public String edit(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "bank/edit";
    }

}