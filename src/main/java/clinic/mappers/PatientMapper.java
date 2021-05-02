package clinic.mappers;

import clinic.dto.PatientDTO;
import clinic.entities.Patient;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PatientMapper extends AbstractMapper<Patient, PatientDTO> {

}
