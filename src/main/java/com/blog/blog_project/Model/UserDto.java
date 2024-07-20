package com.blog.blog_project.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserDto {

    private Integer userid;
    private String name;

    private String email;
    private String about;

}
