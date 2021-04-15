package Dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.Valid;
import java.time.LocalDate;

/**
 * Entity appointment
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "appointment")
public class Appointment {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //patient's id
    @Column(name = "patient_id", nullable = false)
    private Integer patientId;

    //type of the manipulation
    @Column(name = "manipulation_id", nullable = false)
    private byte manipulation_id;

    //start day of appointment
    @Column(name = "start_date", nullable = false)
    private LocalDate startDate;

    //duration of manipulation (number of days)
    @Column(name = "duration", nullable = false)
    private byte duration;

    //select weekdays for manipulation
    @Column(name = "weekday")
    private String weekday;

    //how many times a day
    @Column(name = "daily_chart", nullable = false)
    private byte dailyChart;

    //name of the drug
    @Column(name = "drug", length = 40)
    private String drug;

    //dosage of medication
    @Column(name = "dosage")
    private String dosage;
}
