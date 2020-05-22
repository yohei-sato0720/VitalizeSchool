package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.service.AccountFeatureService;

@Controller
@RequiredArgsConstructor
public class LogoutController {

	/** to ログアウト機能 一覧画面表示*/
    @RequestMapping(value = "logout/list", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("message", "sum");
        return "logout/list";
    }

	/** to ログアウト機能 詳細画面表示*/
    @RequestMapping(value = "logout/view", method = RequestMethod.GET)
    public String view(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "logout/view";
    }

    /** to ログアウト機能 削除*/

	/** to ログアウト機能 登録画面表示*/
    @RequestMapping(value = "logout/add", method = RequestMethod.GET)
    public String add(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "logout/add";
    }

	/** to ログアウト機能 編集画面表示*/
    @RequestMapping(value = "logout/edit", method = RequestMethod.GET)
    public String edit(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "logout/edit";
    }

}