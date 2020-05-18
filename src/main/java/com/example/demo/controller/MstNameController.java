package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MstNameController {

	/** to 名称マスタ機能 一覧*/
    @RequestMapping(value = "mst_name/list", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "mst_name/list";
    }

	/** to 名称マスタ機能 詳細画面表示*/
    @RequestMapping(value = "mst_name/view", method = RequestMethod.GET)
    public String view(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "mst_name/view";
    }

    /** to 名称マスタ機能 削除*/

	/** to 名称マスタ機能 登録画面表示*/
    @RequestMapping(value = "mst_name/add", method = RequestMethod.GET)
    public String add(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "mst_name/add";
    }

	/** to 名称マスタ機能 編集画面表示*/
    @RequestMapping(value = "mst_name/edit", method = RequestMethod.GET)
    public String edit(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "mst_name/edit";
    }

}