package com.requestpage.blogapp.config;


import com.requestpage.blogapp.dto.AuthorCreateDto;
import com.requestpage.blogapp.dto.AuthorViewDto;
import com.requestpage.blogapp.dto.PostCreateDto;
import com.requestpage.blogapp.dto.PostViewDto;
import com.requestpage.blogapp.entity.Author;
import com.requestpage.blogapp.entity.Post;
import org.springframework.stereotype.Component;

@Component
public class Converter {

    public Author fromAuthorCreateDtoToAuthorEntity(AuthorCreateDto authorCreateDto){
        return new Author(authorCreateDto.getNameSurname(), authorCreateDto.getNickName());
    }

    public AuthorViewDto toAuthorViewDto(Author author){
        return new AuthorViewDto(author.getId(), author.getNameSurname(), author.getNickName(),author.getJoinDate());
    }

    public Post fromPostCreateDtoToPostEntity(PostCreateDto postCreateDto){
        return new Post(postCreateDto.getTitle(), postCreateDto.getContent());
    }

    public PostViewDto toPostViewDto(Post post){
        return new PostViewDto(post.getId(), post.getTitle(), post.getContent(), post.getAuthor());
    }

}
