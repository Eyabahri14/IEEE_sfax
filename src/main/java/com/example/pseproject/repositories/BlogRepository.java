package com.example.pseproject.repositories;

import com.example.pseproject.entities.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog,Long> {
}
