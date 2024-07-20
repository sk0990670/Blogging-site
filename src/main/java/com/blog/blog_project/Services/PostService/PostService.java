package com.blog.blog_project.Services.PostService;

import com.blog.blog_project.Model.Post;

public interface PostService {

    Post creatPost(Post post);

    Post getPost(Post post);

    Post getPostById(Post post);

}
