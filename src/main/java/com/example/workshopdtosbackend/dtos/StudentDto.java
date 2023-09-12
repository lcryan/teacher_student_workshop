package com.example.workshopdtosbackend.dtos;

import jakarta.validation.constraints.*;

import java.time.LocalDate;

public class StudentDto {
    public Long id;
    @NotBlank(message = "id missing")
    public String fullName;
    @Size(min = 7, max = 100)
    public String mainSubject;

    public LocalDate startingDate;

    @Min(500)
    @Max(5000)
    public int studentLoan;
}
