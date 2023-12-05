package com.zloebok.javalearningplatform.topics.dto;

import lombok.Data;

import java.sql.Timestamp;
import java.util.UUID;

@Data
public class TopicDto {
    private UUID id;
    private String name;
    private String content;
    private String author;
    private Timestamp creationDate;
}
