package service;

import dao.PatientDaoImpl;
import entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    @Autowired
    private PatientDaoImpl dao;

    public void createOrUpdatePatient(Patient patient) {
        dao.save(patient);
    }
    public void removePatient(Patient patient) {
        dao.softDelete(patient);
    }

    public Patient getPatient(Long patientId){
        return dao.findOne(patientId);
    }
    public Patient getPatient(String patientName){
        return dao.findOneByName(patientName);
    }
}
