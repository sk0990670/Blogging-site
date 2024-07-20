package com.blog.blog_project.Mapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.blog.blog_project.Model.User;
import com.blog.blog_project.Model.UserDto;
import com.blog.blog_project.Services.userServiceImp;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@RestController
public class usermapping {

    @Autowired
    userServiceImp userviceImp;

    @PostMapping("/userr")
    public ResponseEntity<User> createuser(@RequestBody User user) {
        userviceImp.createUser(user);
        return ResponseEntity.ok(user);
    }

    @GetMapping("/getuseData")
    public List<UserDto> getMethodName() {
        return userviceImp.getalluser();
    }

    @GetMapping("/user/{student-id}")
    public List<UserDto> getMethodName(
            @PathVariable("student-id") Integer id) {
        return userviceImp.getuserById(id);
    }

    @DeleteMapping("/user/delete/{user-id}")
    public void deleteUserbyid(
            @PathVariable("user-id") Integer id) {
        userviceImp.deleteUser(id);
    }

    @PutMapping("/user/update/{user-id}")
    public User updateuser(
            @PathVariable("user-id") Integer id, @RequestBody User user) {
        return userviceImp.updateUser(id, user);
    }

    // @PostMapping("/addPost")
    // public postMethodName(@RequestBody String entity) {
    // //TODO: process POST request
    // return entity;
    // }

}
