package org.tts.springbootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tts.springbootdemo.entity.Appointment;


public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}