package com.example.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello, World!";
    }

    @RequestMapping("/julia")
    public @ResponseBody String greetingJulia() {
        return "Hello, Julia!";
    }
    
    @RequestMapping("/nova")
    public @ResponseBody String greetingNova() {
        return "Hello, Nova!";
    }
    
    @RequestMapping("/hotfix")
    public @ResponseBody String greetingHotfix() {
    return "Hotfix applied successfully!";
    }

    @RequestMapping("/feature")
    public @ResponseBody String greetingFeature() {
    return "New Feature in Main Branch";
    }
}
