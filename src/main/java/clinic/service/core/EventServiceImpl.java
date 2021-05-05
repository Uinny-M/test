package clinic.service.core;

import clinic.dao.api.EventDao;
import clinic.dto.EventDTO;
import clinic.entities.Event;
import clinic.mappers.EventMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl extends AbstractServiceImpl<Event, EventDTO, EventDao, EventMapper> {
    @Autowired
    public EventServiceImpl(EventDao dao, EventMapper mapper) {
        super(dao, mapper);
    }
}
