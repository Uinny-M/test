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
}
