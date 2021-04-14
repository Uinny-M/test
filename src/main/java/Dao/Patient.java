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
    private Integer id;

    //patient's name
    @Column(name = "name", nullable = false, length = 50)
    private String patientName;

    //patient's insurance policy number
    @Column(name = "insurance", nullable = false)
    private Long insurance;

    //patient's diagnosis
    @Column(name = "diagnosis", columnDefinition = "true")
    private String diagnosis;

    //doctor in charge of the case
    @Column(name = "doctor_id", nullable = false)
    private Integer doctorId;

    //status of the case (patient's therapy continues?)
    @Column(name = "openCase", columnDefinition = "true")
    private boolean openCase;
}
