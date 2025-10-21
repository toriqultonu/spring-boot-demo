package org.tts.springbootdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.tts.springbootdemo.entity.Student;
import org.tts.springbootdemo.repository.StudentRepository;
import org.tts.springbootdemo.service.StudentService;

import java.util.List;

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

    @Test
    public void test2() {
        System.out.println(studentService.getStudentByName("tonu"));
    }


    @Test
    public void test3() {
        System.out.println(studentRepository.randomEmail("tonu"));
    }

    @Test
    public void testStudentRepository() {
        List<Student> students = studentRepository.findAllStudentWithAppointment();
        System.out.println(students);
    }
}
