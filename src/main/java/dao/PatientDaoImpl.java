package dao;

import entities.Patient;
import org.springframework.stereotype.Repository;

@Repository
public class PatientDaoImpl extends AbstractJpaDao<Patient> {
    public Patient findOneByName(String name) {
        return null;
        //todo сделать поиск пациента по имени
    }

}
