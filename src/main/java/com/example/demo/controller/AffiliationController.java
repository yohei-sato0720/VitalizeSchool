package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.services.AccountFeatureService;

@Controller
@RequiredArgsConstructor
public class AffiliationController {

	/** to 所属機能 一覧画面表示*/
    @RequestMapping(value = "affiliation/list", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("message", "sum");
        return "affiliation/list";
    }

	/** to 所属機能 詳細画面表示*/
    @RequestMapping(value = "affiliation/view", method = RequestMethod.GET)
    public String view(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "affiliation/view";
    }

    /** to 所属機能 削除*/

	/** to 所属機能 登録画面表示*/
    @RequestMapping(value = "affiliation/add", method = RequestMethod.GET)
    public String add(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "affiliation/add";
    }

	/** to 所属機能 編集画面表示*/
    @RequestMapping(value = "affiliation/edit", method = RequestMethod.GET)
    public String edit(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "affiliation/edit";
    }

}