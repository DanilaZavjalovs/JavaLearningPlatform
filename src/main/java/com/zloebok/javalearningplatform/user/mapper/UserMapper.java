package com.zloebok.javalearningplatform.user.mapper;

import com.zloebok.javalearningplatform.user.Dto.UserDto;
import com.zloebok.javalearningplatform.user.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserDto EntityToDto(UserEntity entity) {
        UserDto dto = new UserDto();
        dto.setUsername(entity.getUsername());
        dto.setPassword(entity.getPassword());
        dto.setEmail(entity.getEmail());
        dto.setRole(entity.getRole());

        return dto;
    }

    public UserEntity DtoToEntity(UserDto dto) {
        UserEntity entity = new UserEntity();
        entity.setUsername(dto.getUsername());
        entity.setPassword(dto.getPassword());
        entity.setEmail(dto.getEmail());
        entity.setRole(dto.getRole());

        return entity;
    }

}
