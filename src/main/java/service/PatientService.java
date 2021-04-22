package service;

import dao.PatientDaoImpl;
import entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    private PatientDaoImpl dao;

    //Create new Patient
    public void createOrUpdatePatient(Patient patient) {
        dao.save(patient);
    }

    //soft-delete Patient (isDelete = true)
    public void removePatient(Patient patient) {
        dao.softDelete(patient);
    }

    //get patient by id
    public Patient getPatientById(Integer patientId){
        return dao.findOne(patientId);
    }

    //get patient by part of name
    public List<Patient> getPatientsByName(String patientName){
        return dao.findAllByName(patientName);
    }

    //get patient by part of name
    public List<Patient> getAllPatients() {
        return dao.findAll();
    }
}
