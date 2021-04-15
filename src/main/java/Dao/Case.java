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
@Table(name = "case")
public class Case {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //patient's id
    @Column(name = "patient_id", nullable = false)
    private Integer patientId;

    //patient's diagnosis
    @Column(name = "diagnosis", columnDefinition = "true")
    private String diagnosis;

    //doctor in charge of the case
    @Column(name = "doctor_id", nullable = false)
    private Integer doctorId;

    //status of the case (patient's therapy continues?)
    @Column(name = "open", columnDefinition = "true")
    private boolean openCase;
}
