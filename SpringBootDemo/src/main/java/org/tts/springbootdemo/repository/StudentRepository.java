package org.tts.springbootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tts.springbootdemo.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
