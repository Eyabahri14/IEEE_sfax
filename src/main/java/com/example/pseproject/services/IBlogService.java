package com.example.pseproject.services;

import com.example.pseproject.entities.Blog;

import java.util.List;

public interface IBlogService {
    public List<Blog> retrieveAllBlogs();
    public Blog retrieveBlogById(Long id);
    public Blog addBlog(Blog b);
    Blog updateBlog(Blog Blog);
    String deleteBlog(Long id);
}
