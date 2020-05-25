package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.service.AccountFeatureService;

@Controller
@RequiredArgsConstructor
public class AccountController {

	private AccountFeatureService accountFeatureService;

	/** to 口座機能 一覧画面表示*/
    @RequestMapping(value = "account/list", method = RequestMethod.GET)
    public String list(Model model) {
    	String text = "ABC";
    	String returnText = accountFeatureService.getText(text);
        model.addAttribute("message", returnText);
        return "account/list";
    }

	/** to 口座機能 詳細画面表示*/
    @RequestMapping(value = "account/view", method = RequestMethod.GET)
    public String view(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "account/view";
    }

    /** to 口座機能 削除*/

	/** to 口座機能 登録画面表示*/
    @RequestMapping(value = "account/add", method = RequestMethod.GET)
    public String add(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "account/add";
    }

	/** to 口座機能 編集画面表示*/
    @RequestMapping(value = "account/edit", method = RequestMethod.GET)
    public String edit(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "account/edit";
    }

}