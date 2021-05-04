package clinic.dto;

import clinic.entities.Employee;
import clinic.entities.Patient;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
@Getter
@Setter
public class CaseDTO {

    private Integer id;

    //patient
    private Patient patient;

    //patient's diagnosis
    private String diagnosis;

    //doctor in charge of the case
    private Employee doctor;

    //start day of case
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate startDate;

    //finish day of case
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate endDate;

    //status of the case (patient's therapy continues?)
    private boolean openCase;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public Employee getDoctor() {
        return doctor;
    }

    public void setDoctor(Employee doctor) {
        this.doctor = doctor;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public boolean isOpenCase() {
        return openCase;
    }

    public void setOpenCase(boolean openCase) {
        this.openCase = openCase;
    }
}
