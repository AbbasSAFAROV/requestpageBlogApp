package com.requestpage.blogapp.service;


import com.requestpage.blogapp.config.Converter;
import com.requestpage.blogapp.dto.AuthorCreateDto;
import com.requestpage.blogapp.dto.AuthorViewDto;
import com.requestpage.blogapp.entity.Author;
import com.requestpage.blogapp.exception.AuthorNotFoundException;
import com.requestpage.blogapp.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class AuthorService {

    private final AuthorRepository authorRepository;
    private final Converter converter;

    public AuthorService(AuthorRepository authorRepository, Converter converter) {
        this.authorRepository = authorRepository;
        this.converter = converter;
    }

    public List<AuthorViewDto> authorList(){
        return authorRepository.findAll().stream().map(converter::toAuthorViewDto).collect(Collectors.toList());
    }

    public AuthorViewDto getAuthorById(Long id){
        return converter.toAuthorViewDto(findAuthorById(id));
    }

    public AuthorViewDto createAuthor(AuthorCreateDto createDto){
        return converter.toAuthorViewDto(authorRepository.save(converter.fromAuthorCreateDtoToAuthorEntity(createDto)));
    }

    public Author findAuthorById(Long id){
        return authorRepository.findById(id).orElseThrow(()->new AuthorNotFoundException("Author Not Found id: "+id));
    }

}
