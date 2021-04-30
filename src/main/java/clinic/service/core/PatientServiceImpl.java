package clinic.service.core;

import clinic.dao.api.PatientDao;
import clinic.dto.PatientDTO;
import clinic.entities.Patient;


import clinic.service.api.PatientService;
import lombok.Getter;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PatientServiceImpl extends AbstractServiceImpl<Patient, PatientDTO, PatientDao> implements PatientService {
//    public PatientServiceImpl(PatientDao dao) {
//        super(dao);
//    }
    @Getter
    ModelMapper mapper;
    private final PatientDao patientDao;

    public PatientServiceImpl(PatientDao patientDao) {
        super(patientDao);
        this.patientDao = patientDao;
    }


    //    @Override
//    @Mappings({
//            @Mapping(target="birthdate", source = "entity.birthdate", dateFormat = "yyyy-MM-dd")
//    })
 //   public PatientDTO mapToDTO(Patient entity);
    @Override
    public PatientDTO mapToDTO(Patient entity){
        return getMapper().map(entity, PatientDTO.class);
    }

    @Override
    public Patient mapToEntity(PatientDTO patientDTO) {
        return getMapper().map(patientDTO, Patient.class);
    }

    //get patient by part of name
    @Override
    public List<PatientDTO> getAllPatientsByName(String secondName) {
        return mapToDTO(patientDao.findAll().stream()
                .filter(s->s.getSecondName().contains(secondName))
                .collect(Collectors.toList()));
    }
}
