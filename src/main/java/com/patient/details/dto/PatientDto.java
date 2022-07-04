package com.patient.details.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PatientDto {

    private Long patientId;

    private String firstName;

    private String lastName;

    private LocalDate dateOfBirth;

    private String gender;

    private String ssn;
}
