package clinic.dao.core;

import clinic.dao.api.PatientDao;
import clinic.dao.core.AbstractHibernateDao;
import clinic.entities.Patient;
import org.springframework.security.access.method.P;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class PatientDaoImpl extends AbstractHibernateDao<Patient> implements PatientDao {

public PatientDaoImpl(){super(Patient.class);}

    @Transactional
    public List<Patient> findAllByName(String name) {
        return null;
        //todo сделать поиск пациента по имени
    }
    EntityManager em;
    public Patient findOne(){return em.find(Patient.class, 1);}

}
