package com.zloebok.javalearningplatform.Controllers.pages.topicCreation;

import com.zloebok.javalearningplatform.topics.dto.TopicDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/createTopic")
public class RestTopicController {

    Logger logger = LoggerFactory.getLogger(RestTopicController.class);


    @PostMapping("/saveTopic")
    public void saveTopic(@RequestBody TopicDto topicDto) {
        logger.info(topicDto.getContent());
    }

}
