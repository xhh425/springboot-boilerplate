package com.xhh425.springbootstarter.service.Impl;

import com.xhh425.springbootstarter.entity.User;
import com.xhh425.springbootstarter.mapper.UserMapper;
import com.xhh425.springbootstarter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// 该文件夹用于放置实现类
// 该文件为示例文件
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public String loginService(String uname, String upwd) {
        if ("".equals(uname)) {
            return "请输入用户名";
        } else if ("".equals(upwd)) {
            return "请输入密码";
        }
        User user = userMapper.searchByUname(uname);
        if (user != null) {
            if (upwd.equals(user.getUpwd())) {
                return "SUCCESS";
            } else {
                return "密码错误";
            }
        }
        return "此用户不存在";
    }

    @Override
    public String registerService(User user) {
        if ("".equals(user.getUname())) {
            return "请输入用户名";
        } else if ("".equals(user.getUpwd())) {
            return "请输入密码";
        }
        User userE = userMapper.searchByUname(user.getUname());
        if (userE == null) {
            userMapper.insert(user);
            return "SUCCESS";
        }
        return "用户已存在";
    }

    @Override
    public String queryUserDataById(Integer id) {
        return "已找到id=" + id.toString() + "的用户";
    }
}
