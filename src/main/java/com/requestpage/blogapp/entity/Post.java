package com.requestpage.blogapp.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data @ToString
@AllArgsConstructor @NoArgsConstructor
public class Post {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String content;

    @ManyToOne
    private Author author;

    private Date createdDate;
    private Date updatedDate;

    public Post(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
