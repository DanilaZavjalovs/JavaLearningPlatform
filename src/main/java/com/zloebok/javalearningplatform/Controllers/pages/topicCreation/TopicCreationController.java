package com.zloebok.javalearningplatform.Controllers.pages.topicCreation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/createTopic")
public class TopicCreationController {

    @GetMapping
    public String getTopicCreationView() {
        return "createTopic";
    }

}
