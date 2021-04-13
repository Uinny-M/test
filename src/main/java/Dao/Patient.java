package Dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Entity patient
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "patient")
public class Patient {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //patient's name
    @Column(name = "patient_name", nullable = false)
    private String patientName;

    //patient's insurance policy number
    @Column(name = "insurance")
    private Long insurance;

    //patient's diagnosis
    @Column(name = "diagnosis")
    private String diagnosis;

    //doctor in charge of the case
    @Column(name = "doctor_id", nullable = false)
    private Long doctorId;

    //status of the case (patient's therapy continues?)
    @Column(name = "openCase", columnDefinition = "true")
    private Boolean openCase;

}
