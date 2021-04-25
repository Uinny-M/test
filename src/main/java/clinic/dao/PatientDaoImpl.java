package clinic.dao;

import clinic.entities.Patient;
import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository
public class PatientDaoImpl extends AbstractJpaDao<Patient> {

    @Transactional
    public List<Patient> findAllByName(String name) {
        return null;
        //todo сделать поиск пациента по имени
    }

}
