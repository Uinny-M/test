package clinic.dao.api;

import clinic.entities.Event;

import java.time.LocalDate;
import java.util.List;

public interface EventDao extends AbstractDao<Event> {
    List<Event> findAllByPatientId(Integer patientId);
    List<Event> findAllByDate(LocalDate date);
}
