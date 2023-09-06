package com.xhh425.springbootstarter.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

// 该文件夹用于放置实体类
// 该文件为示例文件
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    private String uname;
    private String pwd;
}
