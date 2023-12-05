package com.zloebok.javalearningplatform.interview.dto;

import com.zloebok.javalearningplatform.interview.entity.TechnologyType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

@Data
public class InterviewDto {
    private String name;
    private String description;
    private String url;
    @Enumerated(EnumType.STRING)
    private TechnologyType type;
}
