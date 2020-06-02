package com.example.demo.controller;


import com.example.demo.entity.MstUser;
import com.example.demo.service.MstUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/mst_user")
public class MstUserController {

  @Autowired
  private MstUserService mstUserService;

    /** to 社員 一覧画面表示*/
    @GetMapping(value = "/list")
    public String displayList(Model model) {
      List<MstUser> mstUserlist = mstUserService.findAll();
      model.addAttribute("mstUserlist", mstUserlist);
      return "mst_user/list";
    }

    /** to 社員 登録画面表示*/
    @GetMapping(value = "/add")
    public String add(Model model) {
      return "mst_user/add";
    }

    /** to 権限機能 詳細画面表示*/
    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public String view(Model model) {
      model.addAttribute("mstUser", "mstUser");
      return "mst_user/view";
    }


    /** to ユーザー process 登録*/
    @PostMapping(value = "/add")
    public String create (@ModelAttribute MstUser mstUser) {
      mstUser.setInsertUserId(9001);
      mstUser.setUpdateUserId(9001);
      mstUserService.save(mstUser);
      return "redirect:/mst_user/list";
    }
}