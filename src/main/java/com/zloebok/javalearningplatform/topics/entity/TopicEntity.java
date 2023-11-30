package com.zloebok.javalearningplatform.topics.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
@Table(name = "topics")
public class TopicEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID id;

    private String name;
    private String content;
    private String author;
    private String creationDate;
}
