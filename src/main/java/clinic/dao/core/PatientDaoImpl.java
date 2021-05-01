package clinic.dao.core;

import clinic.dao.api.PatientDao;
import clinic.entities.Patient;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class PatientDaoImpl extends AbstractHibernateDao<Patient> implements PatientDao {

public PatientDaoImpl(){super(Patient.class);}

    @Transactional
    public List<Patient> findAllByName(String name) {
        return null;
        //todo сделать поиск пациента по имени
    }

    public Patient findOne(){return em.find(Patient.class, 1);}

    public List<Patient> findWithId(Integer id) {
        return em.createQuery(
                "SELECT p FROM Patient p WHERE p.id > :id")
                .setParameter("id", id).getResultList();
    }

}
