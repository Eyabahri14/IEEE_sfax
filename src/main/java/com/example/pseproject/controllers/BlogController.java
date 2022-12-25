package com.example.pseproject.controllers;

import com.example.pseproject.entities.Blog;
import com.example.pseproject.services.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BlogController {
    @Autowired
    IBlogService service;

    //the get methods
    @GetMapping("/Blog")
    public List<Blog> retrieveAllBlogs() {
        return service.retrieveAllBlogs();
    }

    @GetMapping("/BlogsById/{id}")
    public Blog retrieveBlogById(@PathVariable Long id)
    {
        return service.retrieveBlogById(id);
    }

    //the push methods

    @PostMapping("/addBlog")
    @ResponseBody
    public Blog addBlog(@RequestBody Blog b) {
        return service.addBlog(b);
    }

    //the update method
    @PutMapping("/updateBlog")
    public Blog updateBlog(@RequestBody Blog blog) {
        return service.updateBlog(blog);
    }

    //the remove method
    @DeleteMapping("/deleteBlog/{id}")
    public String deleteBlog(@PathVariable long id) {
        return service.deleteBlog(id);
    }



}
