package com.requestpage.blogapp.dto;

import lombok.*;

import java.util.Date;

@Data @ToString @Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthorViewDto {
    private Long id;
    private String nameSurname;
    private String nickName;
    private Date joinDate;
}
