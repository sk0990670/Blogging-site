package com.blog.blog_project.Model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CommentId")
    private Integer commentId;
    @Column(name = "Fullcomment", length = 400)
    private String commnetDetail;

}
