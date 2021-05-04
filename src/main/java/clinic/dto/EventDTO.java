package clinic.dto;

import clinic.entities.Manipulation;
import clinic.entities.Patient;
import clinic.entities.enums.EventStatus;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class EventDTO {

    private Long id;

    //patient's id
    private Patient patient;

    //date of the event
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate date;

    //time of the event
    @DateTimeFormat(pattern = "HH:mm")
    private LocalTime time;

    //type of the manipulation
    private Manipulation manipulation;

    //status of event (planned/completed/canceled/failed)
    private EventStatus status;

    //comment on the procedure
    private String comment;

    //is the event deleted
    private boolean isDeleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public Manipulation getManipulation() {
        return manipulation;
    }

    public void setManipulation(Manipulation manipulation) {
        this.manipulation = manipulation;
    }

    public EventStatus getStatus() {
        return status;
    }

    public void setStatus(EventStatus status) {
        this.status = status;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}
