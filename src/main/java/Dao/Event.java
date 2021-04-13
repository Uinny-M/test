package Dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Entity event
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "event")
public class Event {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //patient's id
    @Column(name = "patient_id", nullable = false)
    private Integer patientId;

    //date and time of the event
    @Column(name = "date", nullable = false)
    private LocalDateTime dateTime;

    //type of the manipulation
    @Column(name = "manipulation_id", nullable = false)
    private Integer manipulation_id;

    //status of event (planned/done/canceled)
    @Column(name = "status", columnDefinition = "planned")
    private String status;

    //comment on the procedure
    @Column(name = "comment")
    private String comment;
}
