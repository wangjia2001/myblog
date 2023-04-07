package com.example.dbl.controller;

import com.example.dbl.dao.BlogDAO;
import com.example.dbl.elem.Blog;
import com.example.dbl.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BlogController {
    @Autowired
    BlogService blogService;

    @Autowired
    BlogDAO blogDao;


    @CrossOrigin
    @GetMapping("/api/blog")
    public List<Blog> getAll(){
        return blogDao.findAll();
    }

    //添加数据
    @CrossOrigin
    @PostMapping(value = "/api/blog/add", consumes = "application/json",produces = "application/json")
    //提交的数据类型是json,返回的数据类型是json
    public Blog insert(@RequestBody Blog blog){
        return blogService.insert(blog);
    }

    //根据id删除
    @CrossOrigin
    @DeleteMapping("/api/blog/delete/{id}")
    public void delete( @PathVariable int id){
        blogService.deleteById(id);
    }

    //更新
    @CrossOrigin
    @PutMapping(value = "/api/blog/{id}/edit", consumes = "application/json",produces = "application/json")
    public Blog update(@RequestBody Blog blog, @PathVariable int id){
        return blogService.update(blog);
    }

    //根据id查询
    @CrossOrigin
    @ResponseBody
    @GetMapping("/api/blog/{id}")
    public Blog findById(@PathVariable int id){
        return blogService.findById(id);
    }

}
