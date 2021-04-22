package clinic.entities;

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
    private byte id;

    //name of manipulation
    @Column(name = "title", nullable = false)
    private String title;

    //type of manipulation
    @Column(name = "type", nullable = false)
    private String type;

    //is the manipulation deleted
    @Column(name = "deleted", nullable = false, columnDefinition = "false")
    private boolean isDeleted;
}
