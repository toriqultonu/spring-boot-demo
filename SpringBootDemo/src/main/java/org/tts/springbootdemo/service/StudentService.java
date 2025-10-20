package org.tts.springbootdemo.service;

import org.tts.springbootdemo.dto.AddStudentRequestDto;
import org.tts.springbootdemo.dto.StudentDto;

import java.util.List;

public interface StudentService {

    List<StudentDto> getAllStudents();

    StudentDto getStudentById(Long id);

    StudentDto createNewStudent(AddStudentRequestDto addStudentRequestDto);

    void deleteStudentById(Long id);
}
