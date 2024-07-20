package com.blog.blog_project.Services;

import com.blog.blog_project.Model.User;
import com.blog.blog_project.Model.UserDto;

public class UserMapper {

    // ! convert User jpa to user dto

    public static UserDto maptoUserDto(User user) {

        UserDto dto = new UserDto();
        dto.setUserid(user.getUserid());
        dto.setName(user.getName());
        dto.setEmail(user.getEmail());
        dto.setAbout(user.getAbout());
        return dto;

    }

    // ! convert use dto to dto

    public static User maptoUser(UserDto userDto) {
        User user = new User();
        user.setUserid(userDto.getUserid());
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        user.setAbout(userDto.getAbout());
        return user;
    }

}
