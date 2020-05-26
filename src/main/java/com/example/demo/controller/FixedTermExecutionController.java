package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequiredArgsConstructor
public class FixedTermExecutionController {

	/** to 定期実行機能 一覧画面表示*/
    @RequestMapping(value = "fixed_term_execution/list", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("message", "sum");
        return "fixed_term_execution/list";
    }

	/** to 定期実行機能 詳細画面表示*/
    @RequestMapping(value = "fixed_term_execution/view", method = RequestMethod.GET)
    public String view(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "fixed_term_execution/view";
    }

    /** to 定期実行機能 削除*/

	/** to 定期実行機能 登録画面表示*/
    @RequestMapping(value = "fixed_term_execution/add", method = RequestMethod.GET)
    public String add(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "fixed_term_execution/add";
    }

	/** to 定期実行機能 編集画面表示*/
    @RequestMapping(value = "fixed_term_execution/edit", method = RequestMethod.GET)
    public String edit(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "fixed_term_execution/edit";
    }

}