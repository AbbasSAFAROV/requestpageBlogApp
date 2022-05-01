package com.requestpage.blogapp.dto;

import com.requestpage.blogapp.entity.Author;
import lombok.*;

import java.util.Date;


@Data @ToString @Builder
@AllArgsConstructor
@NoArgsConstructor
public class PostViewDto {

    private Long id;

    private String title;
    private String content;

    private Author author;

    private Date createdDate;
    private Date updatedDate;

}
