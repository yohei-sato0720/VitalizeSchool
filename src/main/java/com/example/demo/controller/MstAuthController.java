package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MstAuthController {

	/** to 権限機能 一覧*/
    @RequestMapping(value = "mst_auth/list", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "mst_auth/list";
    }

	/** to 権限機能 詳細画面表示*/
    @RequestMapping(value = "mst_auth/view", method = RequestMethod.GET)
    public String view(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "mst_auth/view";
    }

    /** to 権限機能 削除*/

	/** to 権限機能 登録画面表示*/
    @RequestMapping(value = "mst_auth/add", method = RequestMethod.GET)
    public String add(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "mst_auth/add";
    }

	/** to 権限機能 編集画面表示*/
    @RequestMapping(value = "mst_auth/edit", method = RequestMethod.GET)
    public String edit(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "mst_auth/edit";
    }

}