package com.zloebok.javalearningplatform.Controllers.pages.topic;

import com.zloebok.javalearningplatform.topics.dto.TopicDto;
import com.zloebok.javalearningplatform.topics.service.TopicService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/topic")
@AllArgsConstructor
public class TopicController {

    private final TopicService topicService;

    @GetMapping("{id}")
    public String TopicById(@PathVariable("id") UUID uuid, Model model) throws Exception {

        TopicDto dto = topicService.findTopicById(uuid);

        model.addAttribute("topicDto", dto);
        return "topic";
    }

    @GetMapping("/list")
    public String TopicList(Model model) {
        List<TopicDto> list = topicService.topicList();

        model.addAttribute("TopicList", list);

        return "topicList";
    }
}
