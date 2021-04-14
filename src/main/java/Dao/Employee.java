package Dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Entity medical employee (doctor or nurse)
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //name of the medical employee
    @Column(name = "name", nullable = false)
    private String patientName;

    //type of medical employee (doctor/nurse)
    @Column(name = "position", nullable = false)
    private String position;
}
