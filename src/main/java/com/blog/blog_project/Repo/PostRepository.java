package com.blog.blog_project.Repo;

import org.springframework.data.repository.CrudRepository;

import com.blog.blog_project.Model.Post;

public interface PostRepository extends CrudRepository<Post, Integer> {

}
