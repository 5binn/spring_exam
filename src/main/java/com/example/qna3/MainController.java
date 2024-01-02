package com.example.qna3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/aaa")
    @ResponseBody
    public String aaa() {
        return "aaaaaa";
    }
    @GetMapping("/")
    public String root() {
        return "redirect:/article/list";
    }
}
