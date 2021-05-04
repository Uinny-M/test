package clinic.dao.api;

import clinic.entities.Patient;


import java.util.List;


public interface PatientDao extends AbstractDao<Patient> {

    public List<Patient> findAllByName(String name);
}
