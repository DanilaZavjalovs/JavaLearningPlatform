package com.zloebok.javalearningplatform.user.Dto;

import com.zloebok.javalearningplatform.user.userEnum.Role;
import lombok.Data;

@Data
public class UserDto {

    private String username;
    private String password;
    private String email;
    private Role role;

}
