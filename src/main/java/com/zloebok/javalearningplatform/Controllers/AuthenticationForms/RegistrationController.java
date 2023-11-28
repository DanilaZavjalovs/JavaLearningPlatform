package com.zloebok.javalearningplatform.Controllers.AuthenticationForms;

import com.zloebok.javalearningplatform.user.Dto.UserDto;
import com.zloebok.javalearningplatform.user.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
@AllArgsConstructor
public class RegistrationController {

    private final UserService userService;

    @GetMapping()
    public String registrationForm(Model model) {
        model.addAttribute("user", new UserDto());
        return "registration";
    }

    @PostMapping()
    public String registerUser(@ModelAttribute("user") UserDto user) {

        userService.registerUser(user);

        return "login";
    }

}
