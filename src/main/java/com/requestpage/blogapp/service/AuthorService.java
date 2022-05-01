package com.requestpage.blogapp.service;


import com.requestpage.blogapp.entity.Author;
import com.requestpage.blogapp.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<Author> authorList(){

        return null;
    }

}
