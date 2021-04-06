package com.example.blog.service;

import com.example.blog.model.Blog;


public interface BlogService {
    void create(Blog blog);

    Iterable<Blog> findAll();

    void delete(int id);

    Blog findById(int id);

    void update(Blog blog);
}
