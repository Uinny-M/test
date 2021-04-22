package clinic.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

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
    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

    //patient's diagnosis
    @Column(name = "diagnosis", columnDefinition = "true")
    private String diagnosis;

    //doctor in charge of the case
    @ManyToOne
    @JoinColumn(name = "doctor_id", nullable = false)
    private Employee doctor;

    //start day of case
    @Column(name = "start_date", nullable = false)
    private LocalDate startDate;

    //finish day of case
    @Column(name = "end_date", nullable = false)
    private LocalDate endDate;

    //status of the case (patient's therapy continues?)
    @Column(name = "open", columnDefinition = "true")
    private boolean openCase;
}
