package com.blog.blog_project.Model;

import java.sql.Blob;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class uploadImage {

    @Id
    @GeneratedValue()
    private Integer imageId;

    @Column(name = "Date")
    private LocalDateTime localDateTime;

    @Column(name = "Image")
    private Blob image;

    @NotBlank(message = "Image description is mandatory")
    private String imageDes;

    private String Imagesource;

}
