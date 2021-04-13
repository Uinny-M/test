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
@Table(name = "staff")
public class Staff {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //name of the medical employee
    @Column(name = "staff_name", nullable = false)
    private String patientName;

    //type of medical employee
    @Column(name = "type_employee", nullable = false)
    private String typeEmployee; //todo rewrite to enum
}
