package clinic.dao;

import clinic.entities.Patient;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PatientDaoImpl extends AbstractJpaDao<Patient> {
    public List<Patient> findAllByName(String name) {
        return null;
        //todo сделать поиск пациента по имени
    }

}
