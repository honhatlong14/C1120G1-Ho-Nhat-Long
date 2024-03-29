package com.example.blog.service;

import com.example.blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {
    void create(Blog blog);


    Page<Blog> findAll(Pageable pageable, String title, int categoryId);

    List<Blog> findAll();

    void delete(int id);

    Blog findById(int id);

    void update(Blog blog);
}
