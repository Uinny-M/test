package clinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Manage events
 * - CRUD event
 * - getEventsByDate - List(Events) - список процедур на определенный день
 * - getEventsByPatientId - List(Events) - список назначенных процедур по patientId
 * - updateEventStatusByEventId - изменение статуса процедуры
 */
@Controller
@RequestMapping(value = "/event")
public class EventController {
}
