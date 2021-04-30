package clinic.dao.core;

import clinic.dao.api.PatientDao;
import clinic.dao.core.AbstractHibernateDao;
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

}
