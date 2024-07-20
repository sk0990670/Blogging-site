package com.blog.blog_project.Services.PostService;

import org.springframework.beans.factory.annotation.Autowired;

import com.blog.blog_project.Model.Post;
import com.blog.blog_project.Repo.PostRepository;

public class PostServiceImp implements PostService {
    @Autowired
    PostRepository postRepository;

    @Override
    public Post creatPost(Post post) {

        Post newpost = postRepository.save(post);
        return newpost;

    }

    @Override
    public Post getPost(Post post) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPost'");
    }

    @Override
    public Post getPostById(Post post) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPostById'");
    }

}
