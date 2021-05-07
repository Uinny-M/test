package clinic.dao.core;

import clinic.dao.api.EventDao;
import clinic.entities.Event;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Repository
public class EventDaoImpl extends AbstractHibernateDao<Event> implements EventDao {
    public EventDaoImpl() {
        super(Event.class);
    }

    @Transactional
    public List<Event> findAllByDate(LocalDate date) {
        return em.createQuery(
                "SELECT e FROM Event e WHERE e.date = :date AND e.status = 1 ")
                .setParameter("date", date)
                .getResultList();
    }

    @Transactional
    public List<Event> findAllByPatientId(Integer patientId) {
        return em.createQuery(
                "SELECT e FROM Event e WHERE e.patient.id = :patientId AND e.status = 1" +
                        " ORDER BY date")
                .setParameter("patientId", patientId)
                .getResultList();
    }

    @Transactional
    public List<Event> findAllByDateTime(LocalDate date, LocalTime time) {
        return em.createQuery(
                "SELECT e FROM Event e WHERE e.date = :date AND e.time < :time AND e.status = 1 " +
                        " ORDER BY time")
                .setParameter("date", date)
                .setParameter("time", time)
                .getResultList();
    }
}
