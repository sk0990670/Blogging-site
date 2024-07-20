package com.blog.blog_project.Services;

import java.util.List;

import com.blog.blog_project.Model.User;
import com.blog.blog_project.Model.UserDto;

public interface userService {

    User createUser(User user);

    User updateUser(Integer id, User user);

    List<UserDto> getalluser();

    List<UserDto> getuserById(Integer id);

    List<UserDto> findbyfieldName(String namee);

    void deleteUser(Integer Id);

}
