package com.example.blog.repository;

import com.example.blog.model.Blog;
import com.example.blog.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;


public interface BlogRepository extends PagingAndSortingRepository<Blog,Integer> {
    List<Blog> findAll();

    Page<Blog> findByTitle(String title, Pageable pageable);

    Page<Blog> findAllByTitleAndCategory(Pageable pageable, String title, Category category);

    Page<Blog> findAllByTitle(Pageable pageable, String title);

    Page<Blog> findAllByCategory(Pageable pageable, Category category);
}
