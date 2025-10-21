package org.tts.springbootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tts.springbootdemo.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}