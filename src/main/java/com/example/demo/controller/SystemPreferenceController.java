package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.services.AccountFeatureService;

@Controller
@RequiredArgsConstructor
public class SystemPreferenceController {

	/** to システム設定機能 一覧画面表示*/
    @RequestMapping(value = "system_preference/list", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("message", "sum");
        return "system_preference/list";
    }

	/** to システム設定機能 詳細画面表示*/
    @RequestMapping(value = "system_preference/view", method = RequestMethod.GET)
    public String view(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "system_preference/view";
    }

    /** to システム設定機能 削除*/

	/** to システム設定機能 登録画面表示*/
    @RequestMapping(value = "system_preference/add", method = RequestMethod.GET)
    public String add(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "system_preference/add";
    }

	/** to システム設定機能 編集画面表示*/
    @RequestMapping(value = "system_preference/edit", method = RequestMethod.GET)
    public String edit(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "system_preference/edit";
    }

}