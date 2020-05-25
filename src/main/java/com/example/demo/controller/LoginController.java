package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequiredArgsConstructor
public class LoginController {

	/** to 社員機能 一覧画面表示*/
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("message", "sum");
        return "login";
    }

}