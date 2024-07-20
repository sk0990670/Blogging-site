package com.blog.blog_project.Model;

import java.sql.Blob;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "UserPost")

public class Post {

    @Id
    private Integer post_id;
    @Column(name = "Posttitle")
    @NotBlank(message = "Title is mandatory")
    private String title;
    @Column(name = "")

    private String content;
    @NotBlank(message = "Title is mandatory")
    private Blob uploadImage;
    private String imageDec;

}