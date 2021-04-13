package Dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Entity manipulation
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "manipulation")
public class Manipulation {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //name of manipulation
    @Column(name = "manipulation_title", nullable = false)
    private String title;

    //type of manipulation
    @Column(name = "manipulation_type", nullable = false)
    private String type; //todo change to enum
}
