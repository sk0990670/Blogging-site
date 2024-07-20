package com.blog.blog_project.Services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.blog_project.Model.User;
import com.blog.blog_project.Model.UserDto;
import com.blog.blog_project.Repo.UserRepository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Data
@Service
@NoArgsConstructor
@AllArgsConstructor
public class userServiceImp implements userService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User createUser(User user) {
        User user2 = userRepository.save(user);
        return user2;
    }

    @Override
    public User updateUser(Integer id, User user) {
        Optional<User> existingUser = userRepository.findById(id);

        if (existingUser.isPresent()) {
            User updatedUser = existingUser.get();
            updatedUser.setName(user.getName());
            updatedUser.setEmail(user.getEmail());
            updatedUser.setAbout(user.getAbout());
            userRepository.save(updatedUser);
            return updatedUser;
        } else {
            throw new RuntimeException("User not found with id: " + id);
        }
    }

    // Update user logic here
    // return user;

    @Override
    public List<UserDto> getalluser() {
        List<User> users = (List<User>) userRepository.findAll();
        List<UserDto> userdto = users.stream().map(user -> UserMapper.maptoUserDto(user)).collect(Collectors.toList());
        return userdto;
    }

    @Override
    public List<UserDto> getuserById(Integer userid) {
        Optional<User> users = userRepository.findById(userid);
        List<UserDto> userdto = users.stream().map(user -> UserMapper.maptoUserDto(user)).collect(Collectors.toList());
        return userdto;

    }

    @Override
    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<UserDto> findbyfieldName(String namee) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findbyfieldName'");
    }
}
