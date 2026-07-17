package com.example.practice.practice.controller;

import com.example.practice.practice.entity.PracticeResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/practice")
public class PracticeController {

    @GetMapping("/home")
    PracticeResponse responseOutput(){
        return PracticeResponse.builder().code(200).Data("Hello").message("accepted").build();
    }

}
