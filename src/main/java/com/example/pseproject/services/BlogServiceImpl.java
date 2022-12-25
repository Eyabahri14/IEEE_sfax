package com.example.pseproject.services;

import com.example.pseproject.entities.Blog;
import com.example.pseproject.entities.Event;
import com.example.pseproject.repositories.BlogRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class BlogServiceImpl implements IBlogService{
    @Autowired
    BlogRepository blogRepository;

    @Override
    public List<Blog> retrieveAllBlogs() {

        return blogRepository.findAll();
    }

    @Override
    public Blog retrieveBlogById(Long id) {
      return   blogRepository.findById(id).orElse(null);
    }

    @Override
    public Blog addBlog(Blog b) {
        return blogRepository.save(b);
    }

    @Override
    public Blog updateBlog(Blog Blog) {
        Blog existingBlog = blogRepository.findById(Blog.getIdBlog()).orElse(null);
        existingBlog.setTitreB(Blog.getTitreB());
        existingBlog.setDescriptionB(Blog.getDescriptionB());
        existingBlog.setDateB(Blog.getDateB());
        existingBlog.setImageB(Blog.getImageB());

        return blogRepository.save(existingBlog);
    }

    @Override
    public String deleteBlog(Long id) {
        blogRepository.deleteById(id);
        return "blog removed !! " + id;
    }
}
