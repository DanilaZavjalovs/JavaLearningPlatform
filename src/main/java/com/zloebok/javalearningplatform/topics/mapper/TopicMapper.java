package com.zloebok.javalearningplatform.topics.mapper;

import com.zloebok.javalearningplatform.topics.dto.TopicDto;
import com.zloebok.javalearningplatform.topics.entity.TopicEntity;
import org.springframework.stereotype.Component;

@Component
public class TopicMapper {

    public TopicEntity DtoToEntity(TopicDto dto) {
        TopicEntity entity = new TopicEntity();
        entity.setName(dto.getName());
        entity.setAuthor(dto.getAuthor());
        entity.setContent(dto.getContent());
        entity.setCreationDate(dto.getCreationDate());

        return entity;
    }

    public TopicDto EntityToDto(TopicEntity entity) {
        TopicDto dto = new TopicDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setAuthor(entity.getAuthor());
        dto.setContent(entity.getContent());
        dto.setCreationDate(entity.getCreationDate());

        return dto;
    }

}
