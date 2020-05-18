package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.services.AccountFeatureService;

@Controller
@RequiredArgsConstructor
public class EmployeeController {

	/** to 社員機能 一覧画面表示*/
    @RequestMapping(value = "employee/list", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("message", "sum");
        return "employee/list";
    }

	/** to 社員機能 詳細画面表示*/
    @RequestMapping(value = "employee/view", method = RequestMethod.GET)
    public String view(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "employee/view";
    }

    /** to 社員機能 削除*/

	/** to 社員機能 登録画面表示*/
    @RequestMapping(value = "employee/add", method = RequestMethod.GET)
    public String add(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "employee/add";
    }

	/** to 社員機能 編集画面表示*/
    @RequestMapping(value = "employee/edit", method = RequestMethod.GET)
    public String edit(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "employee/edit";
    }

}