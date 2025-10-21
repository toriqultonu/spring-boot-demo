package org.tts.springbootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tts.springbootdemo.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}