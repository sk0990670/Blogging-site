package com.blog.blog_project.Repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.blog.blog_project.Model.User;
import com.blog.blog_project.Model.UserDto;

public interface UserRepository extends CrudRepository<User, Integer> {
    List<UserDto> findAllByName(String fieldName);
}
