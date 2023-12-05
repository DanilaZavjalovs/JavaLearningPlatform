package com.zloebok.javalearningplatform.interview.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
@Table(name = "Interview")
public class InterviewEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID id;

    private String name;
    private String description;
    private String url;
    @Enumerated(EnumType.STRING)
    private TechnologyType type;

}
