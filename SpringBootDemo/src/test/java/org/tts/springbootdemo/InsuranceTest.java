package org.tts.springbootdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.tts.springbootdemo.entity.Appointment;
import org.tts.springbootdemo.entity.Insurance;
import org.tts.springbootdemo.entity.Student;
import org.tts.springbootdemo.service.AppointmentService;
import org.tts.springbootdemo.service.InsuranceService;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootTest
public class InsuranceTest {

    @Autowired
    private InsuranceService insuranceService;

    @Autowired
    private AppointmentService appointmentService;

    @Test
    public void testInsurance(){
        Insurance insurance = Insurance.builder()
                .policyNumber("HDFC_124")
                .provider("New Bank")
                .validUntil(LocalDate.of(2026, 12, 12))
                .build();

        Student student = insuranceService.assignInsuranceToStudent(insurance, 7L);

        Student student1 = insuranceService.disAccociateInsuranceFromStudent(student.getId());

    }

    @Test
    public void testCreateAppointment(){
        Appointment appointment = Appointment.builder()
                .appointmentTime(LocalDateTime.of(2025, 11, 1, 14, 23))
                .reason("Cancer")
                .build();

       Appointment newAppointment =  appointmentService.createNewAppointment(appointment, 1L, 7L);

       Appointment reAssignedAppointment = appointmentService.reAssignAppointmentToAnotherDoctor(newAppointment.getId(), 2L);

    }
}
