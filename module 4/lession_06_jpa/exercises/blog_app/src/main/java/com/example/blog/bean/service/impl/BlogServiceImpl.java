package com.example.blog.bean.service.impl;

import com.example.blog.bean.model.Blog;
import com.example.blog.bean.repository.BlogRepository;
import com.example.blog.bean.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogRepository blogRepository;

    @Override
    public void create(Blog blog) {
        blog.setModifiedDate(new Date());
        blogRepository.save(blog);
    }

    @Override
    public Iterable<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public void delete(int id) {
        blogRepository.deleteById(id);
    }

    @Override
    public Blog findById(int id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public void update(Blog blog) {
        blog.setModifiedDate(new Date());
        blogRepository.save(blog);
    }
}