package org.tts.springbootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.tts.springbootdemo.dto.StudentDto;
import org.tts.springbootdemo.entity.Student;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    Student findByName(String name);
//    @Modifying // modifying is used when database is being updated using the jpql.
    @Query("select s.email from Student s where s.name = :stdName")
    String randomEmail(@Param("stdName") String stdName);

    @Query("select s from Student s left join fetch s.appointments a left join fetch a.doctor")
    List<Student> findAllStudentWithAppointment();
}
