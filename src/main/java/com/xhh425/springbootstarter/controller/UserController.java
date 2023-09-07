package com.xhh425.springbootstarter.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.xhh425.springbootstarter.common.Result;
import com.xhh425.springbootstarter.common.ResultUtil;
import com.xhh425.springbootstarter.entity.User;
import com.xhh425.springbootstarter.mapper.UserMapper;
import com.xhh425.springbootstarter.service.Impl.UserServiceImpl;
import com.xhh425.springbootstarter.service.UserService;
import jakarta.annotation.Resource;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// 该文件夹用于放置XXXController
// 该文件为示例文件
@RestController
public class UserController {
    @Resource
    UserServiceImpl userServiceImpl;

    @Resource
    private UserService userService;

    @RequestMapping("/user/{id}")
    @ResponseBody
    public String queryUserDataById(@PathVariable("id") Integer id) {
        return userService.queryUserDataById(id);
    }

    @GetMapping("/user/login")
    @ResponseBody
    public Result<?> login(@RequestParam String uname, @RequestParam String upwd) {
        String msg = userServiceImpl.loginService(uname, upwd);
        if (("SUCCESS").equals(msg)) {
            return ResultUtil.success("登录成功");
        } else {
            return ResultUtil.error(msg);
        }
    }

    @GetMapping("/user/register")
    @ResponseBody
    public Result<?> Register(@RequestParam String uname, @RequestParam String upwd) {
        User user = new User(uname,upwd);
        String msg = userServiceImpl.registerService(user);
        if (("SUCCESS").equals(msg)) {
            return ResultUtil.success("注册成功");
        } else {
            return ResultUtil.error(msg);
        }
    }
}
