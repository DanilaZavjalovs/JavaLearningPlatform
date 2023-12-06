package com.zloebok.javalearningplatform.interview.service;

import com.zloebok.javalearningplatform.interview.dto.InterviewDto;
import com.zloebok.javalearningplatform.interview.mapper.InterviewMapper;
import com.zloebok.javalearningplatform.interview.repository.InterviewRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InterviewService {
    private final InterviewMapper mapper;
    private final InterviewRepository interviewRepository;

    public void saveInterview(InterviewDto interviewDto) {
        interviewRepository.save(mapper.DtoToEntity(interviewDto));
    }

    public List<InterviewDto> getAllInterview() {
       return interviewRepository.findAll().stream()
                .map(mapper::EntityToDto).toList();
    }
}
