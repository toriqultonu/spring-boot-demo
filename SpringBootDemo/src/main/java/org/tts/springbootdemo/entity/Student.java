package org.tts.springbootdemo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
@Table(
        name = "student",
        uniqueConstraints = {
                @UniqueConstraint(name = "unique_patient_email", columnNames = {"email"}),
        },
        indexes = {
                @Index(name = "idx_student_name", columnList = "name")
        }
)
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ToString.Exclude
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    private String email;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;

    @Enumerated(EnumType.STRING)
    private BloodGroup bloodGroup;


}
