package com.zloebok.javalearningplatform.interview.mapper;

import com.zloebok.javalearningplatform.interview.dto.InterviewDto;
import com.zloebok.javalearningplatform.interview.entity.InterviewEntity;
import org.springframework.stereotype.Component;

@Component
public class InterviewMapper {
    public InterviewDto EntityToDto (InterviewEntity entity) {
        InterviewDto dto = new InterviewDto();
        dto.setName(entity.getName());
        dto.setType(entity.getType());
        dto.setUrl(entity.getUrl());
        dto.setDescription(entity.getDescription());

        return dto;
    }

    public InterviewEntity DtoToEntity (InterviewDto dto) {
        InterviewEntity entity = new InterviewEntity();
        entity.setName(dto.getName());
        entity.setType(dto.getType());
        entity.setUrl(dto.getUrl());
        entity.setDescription(dto.getDescription());

        return entity;
    }
}
