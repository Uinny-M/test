package clinic.service.core;

import clinic.dao.api.PatientDao;
import clinic.dto.PatientDTO;
import clinic.entities.Patient;
import clinic.mappers.PatientMapper;
import clinic.service.api.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PatientServiceImpl extends AbstractServiceImpl<Patient, PatientDTO, PatientDao, PatientMapper>
        implements PatientService {

    @Autowired
    public PatientServiceImpl(PatientDao dao, PatientMapper mapper) {
        super(dao, mapper);
    }

    @Override
    @Transactional
    public List<PatientDTO> getPatientsByName(String name) {
        return mapToDTO(dao.findAllByName(name));
    }

    @Override
    @Transactional
    public PatientDTO createOrUpdatePatient(PatientDTO patientDTO) {
        if (getAll().stream().anyMatch(p -> p.getInsurance().equals(patientDTO.getInsurance()))) {
            dao.update(mapToEntity(patientDTO));
        } else {
            dao.save(mapToEntity(patientDTO));
        }
        return patientDTO;
    }
}
