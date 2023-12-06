package com.zloebok.javalearningplatform.Controllers.pages.interview;

import com.zloebok.javalearningplatform.interview.dto.InterviewDto;
import com.zloebok.javalearningplatform.interview.service.InterviewService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/interview")
@AllArgsConstructor
public class InterviewController {

    private final InterviewService interviewService;

    @GetMapping("/create")
    public String getCreateView(Model model) {

        model.addAttribute("interviewDto", new InterviewDto());

        return "createInterview";
    }

    @PostMapping("/submit-interview")
    public String submitInterviewForm(@ModelAttribute InterviewDto interviewDto) {
        interviewService.saveInterview(interviewDto);

        return "redirect:/";
    }

    @GetMapping("/allInterview")
    public String getAllInterview(Model model) {
        model.addAttribute("interviews", interviewService.getAllInterview());

        return "interviews";
    }
}
