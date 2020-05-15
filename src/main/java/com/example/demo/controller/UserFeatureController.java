package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserFeatureController {

	/** to 利用者機能 一覧*/
    @RequestMapping(value = "user_feature/list", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "user_feature/list";
    }

	/** to 利用者機能 詳細画面表示*/
    @RequestMapping(value = "user_feature/view", method = RequestMethod.GET)
    public String view(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "user_feature/view";
    }

    /** to 利用者機能 削除*/

	/** to 利用者機能 登録画面表示*/
    @RequestMapping(value = "user_feature/add", method = RequestMethod.GET)
    public String add(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "user_feature/add";
    }

	/** to 利用者機能 編集画面表示*/
    @RequestMapping(value = "user_feature/edit", method = RequestMethod.GET)
    public String edit(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "user_feature/edit";
    }

}