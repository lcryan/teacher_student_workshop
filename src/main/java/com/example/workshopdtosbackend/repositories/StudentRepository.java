package com.example.workshopdtosbackend.repositories;

import com.example.workshopdtosbackend.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
