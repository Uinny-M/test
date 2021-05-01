package clinic.dao.api;

import clinic.entities.Patient;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface PatientDao extends AbstractDao<Patient> {
    public Patient findOne();
    public List<Patient> findWithId(Integer id);
}
