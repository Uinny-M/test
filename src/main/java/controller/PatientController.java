package controller;

import entities.Patient;
import org.springframework.web.servlet.ModelAndView;
import service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


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

    @Autowired
    PatientService patientService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView test(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("patientJSP", "тут что-то важное");
        modelAndView.setViewName("patient");
        return modelAndView;
    }

    //Return Patient by ID
    @RequestMapping(value = "/{patientId}", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView getPatientById(@PathVariable("patientId") Integer patientId){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("patientJSP", patientService.getPatientById(patientId));
        modelAndView.setViewName("patient");
        return modelAndView;
    }

    //Return Patient's List by name
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView getPatientByName(@RequestBody String name){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("patientJSP", patientService.getPatientsByName(name));
        modelAndView.setViewName("patient");
        return modelAndView;
    }

    //Return all patients
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView getAllPatients(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("patientsJSP", patientService.getAllPatients());
        modelAndView.setViewName("patients");
        return modelAndView;
    }

    //Return all patients
    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView createOrUpdatePatient(@RequestBody Patient patient) {
        ModelAndView modelAndView = new ModelAndView();
        patientService.createOrUpdatePatient(patient);
        modelAndView.addObject("patientsJSP", patientService.getAllPatients());
        return modelAndView;
    }

    //Delete existing patient
    @RequestMapping(method = RequestMethod.DELETE)
    @ResponseBody
    public ModelAndView removePatient(@RequestBody Patient patient) {
        ModelAndView modelAndView = new ModelAndView();
        patientService.removePatient(patient);
        modelAndView.addObject("patientJSP", patientService.getAllPatients());
        return modelAndView;
    }
}
