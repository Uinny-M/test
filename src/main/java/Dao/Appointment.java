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

    //periodicity of manipulation
    @Column(name = "periodicity", nullable = false)
    private String periodicity; //todo think and rewrite this field

    //start day of appointment
    @Column(name = "start_date", nullable = false)
    private LocalDate startDate;

    //end day of appointment
    @Column(name = "end_date", nullable = false)
    private LocalDate endDate;

    //dosage of medication
    @Column(name = "dosage")
    private String dosage;
}
