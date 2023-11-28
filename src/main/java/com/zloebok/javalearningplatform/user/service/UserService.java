package com.zloebok.javalearningplatform.user.service;

import com.zloebok.javalearningplatform.user.Dto.UserDto;
import com.zloebok.javalearningplatform.user.mapper.UserMapper;
import com.zloebok.javalearningplatform.user.repository.UserRepository;
import com.zloebok.javalearningplatform.user.userEnum.Role;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final PasswordEncoder encoder;

    public void registerUser(UserDto user) {
        user.setPassword(encoder.encode(user.getPassword()));
        user.setRole(Role.USER);

        userRepository.save(
                userMapper.DtoToEntity(user)
        );
    }
}
