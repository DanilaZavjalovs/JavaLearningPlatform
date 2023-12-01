package com.zloebok.javalearningplatform.Controllers.pages.topic;

import com.zloebok.javalearningplatform.topics.dto.TopicDto;
import com.zloebok.javalearningplatform.topics.service.TopicService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/createTopic")
@AllArgsConstructor
public class RestTopicController {

    private final TopicService topicService;

    @PostMapping("/saveTopic")
    public void saveTopic(@RequestBody TopicDto topicDto) {
        topicService.saveTopic(topicDto);
    }
}
