package org.tts.springbootdemo.service;

import org.tts.springbootdemo.dto.AddStudentRequestDto;
import org.tts.springbootdemo.dto.StudentDto;

import java.util.List;
import java.util.Map;

public interface StudentService {

    List<StudentDto> getAllStudents();

    StudentDto getStudentById(Long id);

    StudentDto createNewStudent(AddStudentRequestDto addStudentRequestDto);

    void deleteStudentById(Long id);

    StudentDto updateStudent(Long id, AddStudentRequestDto addStudentRequestDto);

    StudentDto updatePartialStudent(Long id, Map<String, Object> updates);

    StudentDto getStudentByName(String name);

    String getRandom(String name);
}
