package org.tts.springbootdemo.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.tts.springbootdemo.entity.Insurance;
import org.tts.springbootdemo.entity.Student;
import org.tts.springbootdemo.repository.InsuranceRepository;
import org.tts.springbootdemo.repository.StudentRepository;

@Service
@RequiredArgsConstructor
public class InsuranceService {

    private final InsuranceRepository insuranceRepository;
    private final StudentRepository studentRepository;

    @Transactional
    public Student assignInsuranceToStudent(Insurance insurance, Long studentId) {
        Student student = studentRepository.findById(studentId).
                orElseThrow(() -> new IllegalArgumentException("Student not found with id: " + studentId));

        student.setInsurance(insurance);
        insurance.setStudent(student); // not needed just for bidirectional maintainence.
        return student;
    }

    @Transactional
    public Student disAccociateInsuranceFromStudent(Long studentId) {
        Student student = studentRepository.findById(studentId).
                orElseThrow(() -> new IllegalArgumentException("Student not found with id: " + studentId));
        student.setInsurance(null);
        return student;
    }
}
