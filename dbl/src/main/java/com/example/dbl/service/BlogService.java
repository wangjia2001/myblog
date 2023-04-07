package com.example.dbl.service;

import com.example.dbl.dao.BlogDAO;
import com.example.dbl.elem.Blog;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class BlogService {

    @PersistenceContext
    EntityManager entityManager;

      //增
    public Blog insert(Blog blog){
        return entityManager.merge(blog);
    }

    //改
    public Blog update(Blog blog){
        return entityManager.merge(blog);
    }

    //删
    public void deleteById(int id){
        Blog blog = findById(id);
        entityManager.remove(blog);
    }

    //根据id查询博客
    public Blog findById(int id){
        return entityManager.find(Blog.class,id);
    }

//    public List<Blog> findAllByDateOrder(List<Blog> deviceCodes){
//        return (List<Blog>) entityManager.find(Blog.class);
//    }


}
