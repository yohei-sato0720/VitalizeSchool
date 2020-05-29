package com.example.demo.controller;


import com.example.demo.entity.MstUser;
import com.example.demo.service.MstUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class MstUserController {

/**
 * ユーザー情報 Service
 */
@Autowired
private MstUserService mstUserService;

    /** to 権限機能 一覧*/
    @GetMapping(value = "/mst_user/list")
    public String displayList(Model model) {
      List<MstUser> mstUserlist = mstUserService.searchAll();
      model.addAttribute("mstUserlist", mstUserlist);
      return "mst_user/list";
    }
    /** to 権限機能 詳細画面表示*/
    @RequestMapping(value = "mst_user/view", method = RequestMethod.GET)
    public String view(Model model) {
      model.addAttribute("mstUser", "mstUser");
      return "mst_user/view";
    }

}