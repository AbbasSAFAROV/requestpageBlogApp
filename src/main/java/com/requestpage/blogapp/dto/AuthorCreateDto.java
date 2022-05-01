package com.requestpage.blogapp.dto;


import lombok.*;

@Data @ToString @Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthorCreateDto {
    private String nameSurname;
    private String nickName;
}
