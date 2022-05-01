package com.requestpage.blogapp.repository;

import com.requestpage.blogapp.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Long> {
}
