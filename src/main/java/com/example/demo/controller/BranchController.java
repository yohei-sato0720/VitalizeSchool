package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.services.AccountFeatureService;

@Controller
@RequiredArgsConstructor
public class BranchController {

	/** to 支店機能 一覧画面表示*/
    @RequestMapping(value = "branch/list", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("message", "sum");
        return "branch/list";
    }

	/** to 支店機能 詳細画面表示*/
    @RequestMapping(value = "branch/view", method = RequestMethod.GET)
    public String view(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "branch/view";
    }

    /** to 支店機能 削除*/

	/** to 支店機能 登録画面表示*/
    @RequestMapping(value = "branch/add", method = RequestMethod.GET)
    public String add(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "branch/add";
    }

	/** to 支店機能 編集画面表示*/
    @RequestMapping(value = "branch/edit", method = RequestMethod.GET)
    public String edit(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "branch/edit";
    }

}