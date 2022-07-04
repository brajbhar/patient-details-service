package com.patient.details.mapper;

import com.patient.details.dto.PatientDto;
import com.patient.details.model.Patient;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface PatientMapper {

    @Mapping(source = "id", target = "patientId")
    PatientDto toPatientDto(Patient patient);

    @Mapping(source = "patientId", target = "id")
    Patient toPatient(PatientDto patientDto);
}
