package clinic.dto;

import clinic.entities.Case;
import clinic.entities.Manipulation;
import clinic.entities.Patient;
import clinic.entities.enums.Times;
import clinic.entities.enums.Weekday;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

public class PrescriptionDTO {

    private Long id;

    //patient
    private Patient patient;

    //case
    private Case patientCase;

    //type of the manipulation
    private Manipulation manipulation;

    //start day of prescription
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate startDate;

    //duration of manipulation (number of days)
    private byte duration;

    //select weekdays for manipulation
    private Set<Weekday> weekdays;

    //select time for manipulation
    @DateTimeFormat(pattern="HH:mm")
    private Set<Times> times;

    //how many times a day
    private byte dailyChart;

    //name of the drug
    private String drug;

    //dosage of medication
    private String dosage;

    //is the prescription deleted
    private boolean isDeleted;
}
