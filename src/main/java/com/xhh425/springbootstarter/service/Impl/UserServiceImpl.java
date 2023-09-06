package com.xhh425.springbootstarter.service.Impl;

import com.xhh425.springbootstarter.entity.User;
import com.xhh425.springbootstarter.service.UserService;
import org.springframework.stereotype.Service;

// 该文件夹用于放置实现类
// 该文件为示例文件
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String queryUserDataById(Integer id) {
        return "已找到id=" + id.toString() + "的用户";
    }
}
