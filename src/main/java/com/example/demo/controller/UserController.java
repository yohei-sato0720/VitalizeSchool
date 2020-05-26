package com.example.demo.controller;


import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class UserController {

  /**
   * ユーザー情報 Service
   */
  @Autowired
  private UserService userService;

      /** to 権限機能 一覧*/
      @GetMapping(value = "/user/list")
      public String displayList(Model model) {
        List<User> userlist = userService.searchAll();
        model.addAttribute("userlist", userlist);
        return "user/list";
      }
      /** to 権限機能 詳細画面表示*/
      @RequestMapping(value = "user/view", method = RequestMethod.GET)
      public String view(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "user/view";
      }

}