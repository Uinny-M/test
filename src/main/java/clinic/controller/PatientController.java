package clinic.controller;

import clinic.dao.api.PatientDao;
import clinic.dto.PatientDTO;
import clinic.service.api.PatientService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.validation.Valid;


/**
 * Manage patient
 * Сделать:
 * - CRUD Patient
 * - getCasesByPatientId - List(case) - список дел пациента по patientId
 * - getOpenCasesByPatientId - List(case) - список открытых дел пациента по patientId
 * - getPrescriptionsByPatientId - List(Prescriptions) - список назначений пациента по patientId
 * - getOpenPrescriptionsByPatientId - List(Prescriptions) - список назначений пациента по patientId
 */
@Log
@Controller
@RequestMapping(value = "/patient")
public class PatientController {
    private final PatientService patientService;


    private PatientDao dao;

    @Autowired
    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    //Return Patient by ID
    //   @RequestMapping(value = "/{patientId}", method = RequestMethod.GET)
    @GetMapping(value = "/{patientId}")
    @ResponseBody
    public ModelAndView getPatientById(@PathVariable("patientId") Integer patientId) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("patient", patientService.getOneById(patientId));
        modelAndView.setViewName("patient");
        return modelAndView;
    }

    //Return all patients
    @GetMapping(value = "/")
    @ResponseBody
    public ModelAndView getAllPatients() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("patients", patientService.getAll());
        modelAndView.setViewName("patients");
        return modelAndView;
    }

//    @PostMapping(value = "/")
////    public ModelAndView addPatient( @ModelAttribute PatientDTO patientDTO) {
////    patientService.create(patientDTO);
////    return new ModelAndView(new RedirectView("/patient/"));
//
//        public String addPatient(@ModelAttribute("patientNew") PatientDTO patientDto, Model model) {
//                model.addAttribute("patientNew", new PatientDTO());
//                return "/patient/";
//    }
}
