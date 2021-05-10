package clinic.controller;

import clinic.dto.EventDTO;
import clinic.dto.PatientDTO;
import clinic.dto.PrescriptionDTO;
import clinic.entities.Prescription;
import clinic.entities.enums.Times;
import clinic.entities.enums.Weekday;
import clinic.service.api.PrescriptionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.HashSet;

@Controller
@RequestMapping(value = "/prescription")
public class PrescriptionController {
    private final PrescriptionService prescriptionService;
    public PrescriptionController(PrescriptionService prescriptionService) {
        this.prescriptionService = prescriptionService;
    }

    //Return all prescriptions by PatientId
    @GetMapping(value = "/{patientId}")
    public ModelAndView getAllPrescriptionsByPatientId(@PathVariable Integer patientId) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("prescriptions", prescriptionService.getAllByPatientId(patientId));
        modelAndView.setViewName("prescriptions");
        return modelAndView;
    }

    //Return all prescriptions by CaseId
    @GetMapping(value = "/case/{caseId}")
    public ModelAndView getAllPrescriptionsByCaseId(@PathVariable Long caseId) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("prescriptions", prescriptionService.getAllByCaseId(caseId));
        modelAndView.setViewName("prescriptions");
        return modelAndView;
    }

    //Add new prescription
    @PostMapping(value = "/add")
    public RedirectView addPrescription(@ModelAttribute PrescriptionDTO prescriptionDTO) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("days", new HashSet<String>());
        modelAndView.addObject("times", new HashSet<String>());
        modelAndView.addObject("weekday", Weekday.values());
        modelAndView.addObject("time", Times.values());
        modelAndView.setViewName("prescription");
        prescriptionService.create(prescriptionDTO);
        return new RedirectView("/T_school_war_exploded/patient/");
    }
}
