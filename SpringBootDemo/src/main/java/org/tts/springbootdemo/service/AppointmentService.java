package org.tts.springbootdemo.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.tts.springbootdemo.entity.Appointment;
import org.tts.springbootdemo.entity.Doctor;
import org.tts.springbootdemo.entity.Student;
import org.tts.springbootdemo.repository.AppointmentRepository;
import org.tts.springbootdemo.repository.DoctorRepository;
import org.tts.springbootdemo.repository.StudentRepository;

@Service
@RequiredArgsConstructor
public class AppointmentService {

    private final AppointmentRepository appointmentRepository;
    private final DoctorRepository doctorRepository;
    private final StudentRepository studentRepository;


    @Transactional
    public Appointment createNewAppointment(Appointment appointment, Long doctorId, Long studentId) {
        Doctor doctor = doctorRepository.findById(doctorId).orElseThrow(() ->
                new IllegalArgumentException("Doctor not found with id: " + doctorId));
        Student student = studentRepository.findById(studentId).orElseThrow(() ->
                new IllegalArgumentException("Student not found with id: " + studentId));

        if(appointment.getId() != null){
            throw new IllegalArgumentException("Cannot create new appointment with existing id");
        }

        appointment.setDoctor(doctor);
        appointment.setStudent(student);

        student.getAppointments().add(appointment); // to maintain bi-directional consistancy. database won't be affected.

        appointmentRepository.save(appointment);
        return appointment;
    }
}
