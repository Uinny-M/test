package clinic.mappers;

import clinic.dto.PatientDTO;
import clinic.entities.Patient;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface PatientMapper extends AbstractMapper<Patient, PatientDTO> {

}
