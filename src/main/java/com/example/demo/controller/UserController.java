package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequiredArgsConstructor
public class UserController {

	/** to 社員機能 一覧画面表示*/
    @RequestMapping(value = "user/list", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("message", "sum");
        return "user/list";
    }

	/** to 社員機能 詳細画面表示*/
    @RequestMapping(value = "user/view", method = RequestMethod.GET)
    public String view(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "user/view";
    }

    /** to 社員機能 削除*/

	/** to 社員機能 登録画面表示*/
    @RequestMapping(value = "user/add", method = RequestMethod.GET)
    public String add(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "user/add";
    }

	/** to 社員機能 編集画面表示*/
    @RequestMapping(value = "user/edit", method = RequestMethod.GET)
    public String edit(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "user/edit";
    }

}