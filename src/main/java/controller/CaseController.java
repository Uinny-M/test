package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Manage Case
 * Сделать:
 * - CRUD Case
 * - CRUD Prescription
 * - closeCase(caseId) - закрыть дело по caseId
 */

@Controller
@RequestMapping(value = "/case")
public class CaseController {
}
