package com.zloebok.javalearningplatform.topics.service;

import com.zloebok.javalearningplatform.topics.dto.TopicDto;
import com.zloebok.javalearningplatform.topics.entity.TopicEntity;
import com.zloebok.javalearningplatform.topics.mapper.TopicMapper;
import com.zloebok.javalearningplatform.topics.repository.TopicRepository;
import com.zloebok.javalearningplatform.user.entity.UserEntity;
import lombok.AllArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class TopicService {

    private final TopicMapper mapper;
    private final TopicRepository repository;

    public void saveTopic(TopicDto dto) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        UserEntity UserEntity = (UserEntity) auth.getPrincipal();

        dto.setName("Java");
        Date date = new Date();
        dto.setCreationDate(new Timestamp(date.getTime()));
        dto.setAuthor(UserEntity.getUsername());

        TopicEntity entity = mapper.DtoToEntity(dto);

        repository.save(entity);
    }

    public TopicDto findTopicById(UUID uuid) throws Exception {
        TopicEntity entity = repository.findById(uuid)
                .orElseThrow(() -> new Exception("Could not find user by id"));

        return mapper.EntityToDto(entity);
    }

    public List<TopicDto> topicList() {
        return repository.findAll().stream()
                .map(mapper::EntityToDto).toList();
    }
}
