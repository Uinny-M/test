package clinic.dto;

import clinic.entities.Employee;
import clinic.entities.Patient;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

public class CaseDTO {

    private Integer id;

    //patient
    private Patient patient;

    //patient's diagnosis
    private String diagnosis;

    //doctor in charge of the case
    private Employee doctor;

    //start day of case
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate startDate;

    //finish day of case
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate endDate;

    //status of the case (patient's therapy continues?)
    private boolean openCase;
}
