package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequiredArgsConstructor
public class MstEmployeeController {

	/** to 社員マスタ機能 一覧画面表示*/
    @RequestMapping(value = "mst_employee/list", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("message", "sum");
        return "mst_employee/list";
    }

	/** to 社員マスタ機能 詳細画面表示*/
    @RequestMapping(value = "mst_employee/view", method = RequestMethod.GET)
    public String view(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "mst_employee/view";
    }

    /** to 社員マスタ機能 削除*/

	/** to 社員マスタ機能 登録画面表示*/
    @RequestMapping(value = "mst_employee/add", method = RequestMethod.GET)
    public String add(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "mst_employee/add";
    }

	/** to 社員マスタ機能 編集画面表示*/
    @RequestMapping(value = "mst_employee/edit", method = RequestMethod.GET)
    public String edit(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "mst_employee/edit";
    }

}