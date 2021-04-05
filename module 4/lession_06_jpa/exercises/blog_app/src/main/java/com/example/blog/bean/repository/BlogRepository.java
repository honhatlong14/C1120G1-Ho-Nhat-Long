package com.example.blog.bean.repository;

import com.example.blog.bean.model.Blog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends CrudRepository<Blog,Integer> {
}
