package org.tts.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tts.springbootdemo.dto.StudentDto;

@RestController
public class StudentController {

    @GetMapping("/student")
    public StudentDto getStudent() {
        return new StudentDto(2L, "Toriqul", "toriqul@gmail.com");
    }
}
