package clinic.service.core;

import clinic.dao.api.PatientDao;
import clinic.dto.PatientDTO;
import clinic.entities.Patient;


import clinic.mappers.PatientMapper;
import clinic.service.api.PatientService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.mapstruct.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PatientServiceImpl extends AbstractServiceImpl<Patient, PatientDTO, PatientDao, PatientMapper> implements PatientService {
    @Autowired
    public PatientServiceImpl(PatientDao dao, PatientMapper mapper) {
        super(dao, mapper);
    }


    //    @Override
//    @Mappings({
//            @Mapping(target="birthdate", source = "entity.birthdate", dateFormat = "yyyy-MM-dd")
//    })
 //   public PatientDTO mapToDTO(Patient entity);
//    @Override
//    public PatientDTO mapToDTO(Patient entity){
//        return getMapper().map(entity, PatientDTO.class);
//    }

//
//    @Override
//    public Patient mapToEntity(PatientDTO patientDTO) {
//        return getMapper().map(patientDTO, Patient.class);
//    }

    //get patient by part of name
//    @Override
//    public List<PatientDTO> getAllPatientsByName(String secondName) {
//        return mapToDTO(patientDao.findAll().stream()
//                .filter(s->s.getSecondName().contains(secondName))
//                .collect(Collectors.toList()));
//    }
}
