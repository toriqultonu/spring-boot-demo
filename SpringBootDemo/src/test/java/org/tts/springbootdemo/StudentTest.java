package org.tts.springbootdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.tts.springbootdemo.repository.StudentRepository;
import org.tts.springbootdemo.service.StudentService;

@SpringBootTest
public class StudentTest {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentService studentService;

    @Test
    public void test() {
        System.out.println(studentService.getStudentById(1L));

    }
}
