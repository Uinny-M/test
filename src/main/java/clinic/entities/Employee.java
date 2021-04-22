package clinic.entities;

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

    //patient's second name
    @Column(name = "second_name", nullable = false, length = 20)
    private String secondName;

    //patient's first name
    @Column(name = "first_name", nullable = false, length = 20)
    private String firstName;

    //patient's middle name
    @Column(name = "middle_name", nullable = false, length = 20)
    private String middleName;

    //type of medical employee (doctor/nurse)
    @Column(name = "position", nullable = false)
    private String position;

    //login for auth
    @Column(name = "login", nullable = false, length = 20)
    private String login;

    //password for auth
    @Column(name = "password", nullable = false, length = 20, columnDefinition = "password")
    private String password;

    //is the employee deleted
    @Column(name = "deleted", nullable = false, columnDefinition = "false")
    private boolean isDeleted;

    //employee's role
    @Column(name = "role", nullable = false)
    private String role;
}
