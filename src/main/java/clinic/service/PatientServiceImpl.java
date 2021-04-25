package clinic.service;

import clinic.dao.api.PatientDao;
import clinic.dao.core.PatientDaoImpl;
import clinic.entities.Patient;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService{
    @Autowired
    private PatientDao dao;

    //Create new Patient
    public void createOrUpdatePatient(Patient patient) {
        dao.save(patient);
    }

    //soft-delete Patient (isDelete = true)
    public void removePatient(Patient patient) {
        dao.delete(patient);
    }

    //get patient by id
    public Patient getPatientById(Integer patientId){
        return dao.findById(patientId);
    }

    //get patient by part of name
//    public List<Patient> getPatientsByName(String patientName){
//        return dao.findAllByName(patientName);
//    }

    //get patient by part of name
    public List<Patient> getAllPatients() {
        return dao.findAll();
    }
}
