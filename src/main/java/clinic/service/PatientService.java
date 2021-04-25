package clinic.service;

import clinic.entities.Patient;

import java.util.List;

public interface PatientService {

    //Create new Patient
    public void createOrUpdatePatient(Patient patient);

    //soft-delete Patient (isDelete = true)
    public void removePatient(Patient patient);

    //get patient by id
    public Patient getPatientById(Integer patientId);

    //get patient by part of name
//    public List<Patient> getPatientsByName(String patientName);

    //get patient by part of name
    public List<Patient> getAllPatients();
}
