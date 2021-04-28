package clinic.controller;

import clinic.entities.Patient;
import clinic.service.api.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


/**
 * Manage patient
 * Сделать:
 * - CRUD Patient
 * - getCasesByPatientId - List(case) - список дел пациента по patientId
 * - getOpenCasesByPatientId - List(case) - список открытых дел пациента по patientId
 * - getPrescriptionsByPatientId - List(Prescriptions) - список назначений пациента по patientId
 * - getOpenPrescriptionsByPatientId - List(Prescriptions) - список назначений пациента по patientId
 */

@Controller
@RequestMapping(value = "/patient")
public class PatientController {

    final PatientService patientService;

    @Autowired
    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }


    //Return Patient by ID
    @RequestMapping(value = "/{patientId}", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView getPatientById(@PathVariable("patientId") Integer patientId) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("patient", patientService.getOneById(patientId));
        modelAndView.setViewName("patient");
        return modelAndView;
    }


    //Return all patients
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView getAllPatients() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("patient", patientService.getAll());
        modelAndView.setViewName("patient");
        return modelAndView;
    }
}
