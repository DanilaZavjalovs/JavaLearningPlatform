package com.zloebok.javalearningplatform.Controllers.AuthenticationForms;

import com.zloebok.javalearningplatform.user.Dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {

    @GetMapping
    public String loginForm(Model model) {
        model.addAttribute("user", new UserDto());
        return "login";
    }
}
