package com.requestpage.blogapp.dto;


import lombok.*;

@Data @ToString @Builder
@AllArgsConstructor
@NoArgsConstructor
public class PostCreateDto {

    private String title;
    private String content;

    private Long authorId;

}
