package com.example.workshopdtosbackend.models;


import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

@Entity
@Table
public class Student {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "full_name", length = 130)
    private String fullName;

    @Column(name = "main_subject", length = 100)
    private String mainSubject;

    private LocalDate startingDate;

    private int studentLoan;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMainSubject() {
        return mainSubject;
    }

    public void setMainSubject(String mainSubject) {
        this.mainSubject = mainSubject;
    }

    public LocalDate getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(LocalDate startingDate) {
        this.startingDate = startingDate;
    }

    public int getStudentLoan() {
        return studentLoan;
    }

    public void setStudentLoan(int studentLoan) {
        this.studentLoan = studentLoan;
    }
}
