package clinic.dto;

import clinic.entities.Manipulation;
import clinic.entities.Patient;
import clinic.entities.Prescription;
import clinic.entities.enums.EventStatus;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalTime;

public class EventDTO {

    private Long id;

    //patient's id
    private Patient patient;

    //date of the event
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

    //time of the event
    @DateTimeFormat(pattern = "HH:mm:ss")
    private LocalTime time;

    //type of the manipulation
    private Manipulation manipulation;

    //prescription
    private Prescription prescription;

    //status of event (planned/completed/canceled/failed)
    private String status;

    //comment on the procedure
    private String comment;
}
