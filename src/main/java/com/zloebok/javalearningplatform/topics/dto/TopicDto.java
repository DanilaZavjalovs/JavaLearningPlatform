package com.zloebok.javalearningplatform.topics.dto;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class TopicDto {
    private String name;
    private String content;
    private String author;
    private Timestamp creationDate;
}
