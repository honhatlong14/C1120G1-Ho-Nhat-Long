package com.example.blog.controller;

import com.example.blog.model.Blog;
import com.example.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class RestBlogController {

        @Autowired
        BlogService blogService;

        //-------------------Retrieve All BLog--------------------------------------------------------

        @RequestMapping(value = "/blog/", method = RequestMethod.GET)
        public ResponseEntity<List<Blog>> listAllBlog() {
            List<Blog> customers = blogService.findAll();
            if (customers.isEmpty()) {
                return new ResponseEntity<List<Blog>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
            }
            return new ResponseEntity<List<Blog>>(customers, HttpStatus.OK);
        }
    //-------------------Retrieve Single Customer--------------------------------------------------------
    @RequestMapping(value = "/blog/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Blog> getBlog(@PathVariable("id") int id) {
        System.out.println("Fetching Blog with id " + id);
        Blog blog = blogService.findById(id);
        if (blog == null) {
            System.out.println("Customer with id " + id + " not found");
            return new ResponseEntity<Blog>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Blog>(blog, HttpStatus.OK);
    }
//    //-------------------Create a Blog--------------------------------------------------------
//
//    @RequestMapping(value = "/blog/", method = RequestMethod.POST)
//    public ResponseEntity<Void> createBlog(@RequestBody Blog blog, UriComponentsBuilder ucBuilder) {
//        System.out.println("Creating Blog " + blog.getAuthor());
//        blogService.create(blog);
//        HttpHeaders headers = new HttpHeaders();
//        headers.setLocation(ucBuilder.path("/blog/{id}").buildAndExpand(blog.getId()).toUri());
//        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
//    }
//    //------------------- Update a Blog --------------------------------------------------------
//
//    @RequestMapping(value = "/blog/{id}", method = RequestMethod.PUT)
//    public ResponseEntity<Blog> updateBlog(@PathVariable("id") int id, @RequestBody Blog blog) {
//        System.out.println("Updating Blog " + id);
//
//        Blog currentBlog = blogService.findById(id);
//
//        if (currentBlog == null) {
//            System.out.println("Blog with id " + id + " not found");
//            return new ResponseEntity<Blog>(HttpStatus.NOT_FOUND);
//        }
//
//        currentBlog.setId(blog.getId());
//        currentBlog.setAuthor(blog.getAuthor());
//        currentBlog.setCategory(blog.getCategory());
//        currentBlog.setContent(blog.getContent());
//        currentBlog.setTitle(blog.getTitle());
//        currentBlog.setModifiedDate(blog.getModifiedDate());
//
//        blogService.update(currentBlog);
//        return new ResponseEntity<Blog>(currentBlog, HttpStatus.OK);
//    }
//    //------------------- Delete a Blog --------------------------------------------------------
//
//    @RequestMapping(value = "/blog/{id}", method = RequestMethod.DELETE)
//    public ResponseEntity<Blog> deleteBlog(@PathVariable("id") int id) {
//        System.out.println("Fetching & Deleting Blog with id " + id);
//
//        Blog blog = blogService.findById(id);
//        if (blog == null) {
//            System.out.println("Unable to delete. Blog with id " + id + " not found");
//            return new ResponseEntity<Blog>(HttpStatus.NOT_FOUND);
//        }
//
//        blogService.delete(id);
//        return new ResponseEntity<Blog>(HttpStatus.NO_CONTENT);
//    }

}
