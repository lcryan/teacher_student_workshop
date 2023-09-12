package com.example.workshopdtosbackend.dtos;

import jakarta.validation.constraints.*;

import java.time.LocalDate;

public class TeacherDto {
    public Long id;
    @NotBlank(message = "empty")
    public String firstName;
    @Size(min = 3, max = 128)
    public String lastName;
    @Past
    public LocalDate dob;

    @Min(1000)
    @Max(100_000)
    public int salary;
}
