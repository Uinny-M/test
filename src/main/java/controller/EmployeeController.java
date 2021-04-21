package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * CRUD employee
 * * Сделать:
 *  - CRUD employee
 *  - updatePassword - изменение пароля работника
 *  - getPatientsByDoctorId - List(Patient) - список пациентов по doctorId
 *  - getCasesByDoctorId - List(case) - список дел пациента по doctorId
 *  - getOpenCasesByDoctorId - List(case) - список открытых дел пациента по doctorId
 *  - getPrescriptionsByPatientId - List(Prescriptions) - список назначений пациента по patientId
 *  - getOpenPrescriptionsByPatientId - List(Prescriptions) - список назначений пациента по patientId
 */

@Controller
@RequestMapping(value = "/employee")
public class EmployeeController {
    //todo CRUD
}
