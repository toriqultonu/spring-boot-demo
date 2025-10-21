package org.tts.springbootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tts.springbootdemo.entity.Insurance;

public interface InsuranceRepository extends JpaRepository<Insurance, Long> {
}