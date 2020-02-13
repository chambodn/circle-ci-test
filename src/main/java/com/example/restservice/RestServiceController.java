package com.example.restservice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestServiceController {
    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello bobby";
    }
}