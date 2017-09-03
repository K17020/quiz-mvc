package com.quiz.mvc.quizmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class QuizController {

    @RequestMapping(value="") // The main page
    public String index(){
        return "index";
    }
}
