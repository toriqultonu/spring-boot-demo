package org.tts.springbootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.tts.springbootdemo.dto.StudentDto;
import org.tts.springbootdemo.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    Student findByName(String name);

    @Query("select s.email from Student s where s.name = :stdName")
    String randomEmail(@Param("stdName") String stdName);
}
