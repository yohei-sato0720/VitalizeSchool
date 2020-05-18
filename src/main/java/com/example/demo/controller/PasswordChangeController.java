package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.services.AccountFeatureService;

@Controller
@RequiredArgsConstructor
public class PasswordChangeController {

	/** to パスワード変更機能 一覧画面表示*/
    @RequestMapping(value = "password_change/list", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("message", "sum");
        return "password_change/list";
    }

	/** to パスワード変更機能 詳細画面表示*/
    @RequestMapping(value = "password_change/view", method = RequestMethod.GET)
    public String view(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "password_change/view";
    }

    /** to パスワード変更機能 削除*/

	/** to パスワード変更機能 登録画面表示*/
    @RequestMapping(value = "password_change/add", method = RequestMethod.GET)
    public String add(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "password_change/add";
    }

	/** to パスワード変更機能 編集画面表示*/
    @RequestMapping(value = "password_change/edit", method = RequestMethod.GET)
    public String edit(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "password_change/edit";
    }

}