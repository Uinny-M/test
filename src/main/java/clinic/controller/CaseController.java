package clinic.controller;

import clinic.dto.CaseDTO;
import clinic.dto.PatientDTO;
import clinic.service.api.CaseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping(value = "/cases")
public class CaseController {
    private final CaseService caseService;

    public CaseController(CaseService caseService) {
        this.caseService = caseService;
    }

    //Return all cases by PatientId
    @GetMapping(value = "/{patientId}")
    public ModelAndView getAllCases(@PathVariable Integer patientId) {
        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("cases", caseService.getAllOpenCases());
        modelAndView.addObject("cases", caseService.getAll());
        modelAndView.setViewName("cases");
        return modelAndView;
    }

//    //Return Case by ID
//    @GetMapping(value = "/add")
//    public ModelAndView getPatientById() {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("caseNew", new CaseDTO());
//        modelAndView.setViewName("case");
//        return modelAndView;
//    }
//
//    //Add new case
//    @PostMapping(value = "/add")
//    public ModelAndView addCase(@ModelAttribute CaseDTO caseDTO) {
//        caseService.createOrUpdate(caseDTO);
//        ModelAndView modelAndView = new ModelAndView(new RedirectView());
//        return modelAndView;
//    }
}
