package com.requestpage.blogapp.entity;


import lombok.*;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data @ToString @Builder
@AllArgsConstructor @NoArgsConstructor
public class Author {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nameSurname;
    private String nickName;

    @OneToMany
    private List<Post> posts;

    private Date joinDate;


}
