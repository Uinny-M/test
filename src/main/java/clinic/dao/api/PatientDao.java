package clinic.dao.api;

import clinic.entities.Patient;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientDao extends AbstractDao<Patient> {
    public Patient findOne();
}
