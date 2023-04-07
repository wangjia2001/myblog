package com.example.dbl.dao;

import com.example.dbl.elem.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BlogDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;

    //查询数据库学生信息表
    public List<Blog> findAll() {
        return jdbcTemplate.query("select * from blog",
                new BeanPropertyRowMapper<Blog>(Blog.class));
    }
}
