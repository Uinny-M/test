package clinic.mappers;

import clinic.dto.EventDTO;
import clinic.entities.Event;
import clinic.entities.enums.EventStatus;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-05-10T13:40:24+0300",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 13.0.2 (AdoptOpenJDK)"
)
@Component
public class EventMapperImpl implements EventMapper {

    @Override
    public List<Event> mapDtoToEntity(List<EventDTO> dto) {
        if ( dto == null ) {
            return null;
        }

        List<Event> list = new ArrayList<Event>( dto.size() );
        for ( EventDTO eventDTO : dto ) {
            list.add( mapDtoToEntity( eventDTO ) );
        }

        return list;
    }

    @Override
    public List<EventDTO> mapEntityToDto(List<Event> entity) {
        if ( entity == null ) {
            return null;
        }

        List<EventDTO> list = new ArrayList<EventDTO>( entity.size() );
        for ( Event event : entity ) {
            list.add( mapEntityToDto( event ) );
        }

        return list;
    }

    @Override
    public EventDTO mapEntityToDto(Event entity) {
        if ( entity == null ) {
            return null;
        }

        EventDTO eventDTO = new EventDTO();

        eventDTO.setId( entity.getId() );
        eventDTO.setPatient( entity.getPatient() );
        eventDTO.setDate( entity.getDate() );
        eventDTO.setTime( entity.getTime() );
        eventDTO.setManipulation( entity.getManipulation() );
        eventDTO.setPrescription( entity.getPrescription() );
        if ( entity.getStatus() != null ) {
            eventDTO.setStatus( entity.getStatus().name() );
        }
        eventDTO.setComment( entity.getComment() );

        return eventDTO;
    }

    @Override
    public Event mapDtoToEntity(EventDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Event event = new Event();

        event.setId( dto.getId() );
        event.setPatient( dto.getPatient() );
        event.setDate( dto.getDate() );
        event.setTime( dto.getTime() );
        event.setManipulation( dto.getManipulation() );
        event.setPrescription( dto.getPrescription() );
        if ( dto.getStatus() != null ) {
            event.setStatus( Enum.valueOf( EventStatus.class, dto.getStatus() ) );
        }
        event.setComment( dto.getComment() );

        return event;
    }
}
