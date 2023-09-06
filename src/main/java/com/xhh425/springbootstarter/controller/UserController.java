package com.xhh425.springbootstarter.controller;

import com.xhh425.springbootstarter.entity.User;
import com.xhh425.springbootstarter.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// 该文件夹用于放置XXXController
// 该文件为示例文件
@RestController
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/user/{id}")
    @ResponseBody
    public String queryUserDataById(@PathVariable("id") Integer id) {
        return userService.queryUserDataById(id);
    }
}
