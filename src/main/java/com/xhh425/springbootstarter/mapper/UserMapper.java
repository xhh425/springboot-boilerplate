package com.xhh425.springbootstarter.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xhh425.springbootstarter.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

// 该文件夹用于放置XXXDao, Data Access Object, 意为用于访问数据的对象
// 该文件为示例文件
@Repository // 表示持久层
@Mapper
public interface UserMapper extends BaseMapper<User> {
    @Select("select * from user where uname = #{uname}")
    User searchByUname(String uname);
}
