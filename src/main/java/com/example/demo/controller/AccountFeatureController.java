package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.services.AccountFeatureService;

@Controller
@RequiredArgsConstructor
public class AccountFeatureController {

	/** to 口座機能 一覧画面表示*/
    @RequestMapping(value = "account_feature/list", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("message", "sum");
        return "account_feature/list";
    }

	/** to 口座機能 詳細画面表示*/
    @RequestMapping(value = "account_feature/view", method = RequestMethod.GET)
    public String view(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "account_feature/view";
    }

    /** to 口座機能 削除*/

	/** to 口座機能 登録画面表示*/
    @RequestMapping(value = "account_feature/add", method = RequestMethod.GET)
    public String add(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "account_feature/add";
    }

	/** to 口座機能 編集画面表示*/
    @RequestMapping(value = "account_feature/edit", method = RequestMethod.GET)
    public String edit(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "account_feature/edit";
    }

}