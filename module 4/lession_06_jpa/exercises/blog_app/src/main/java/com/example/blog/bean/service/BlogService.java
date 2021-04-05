package com.example.blog.bean.service;

import com.example.blog.bean.model.Blog;


public interface BlogService {
    void create(Blog blog);

    Iterable<Blog> findAll();

    void delete(int id);

    Blog findById(int id);

    void update(Blog blog);
}
