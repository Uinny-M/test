package clinic.service.core;

import clinic.dao.api.CaseDao;
import clinic.dto.CaseDTO;
import clinic.entities.Case;
import clinic.entities.Employee;
import clinic.service.api.CaseService;
import lombok.Getter;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CaseServiceImpl extends AbstractServiceImpl<Case, CaseDTO, CaseDao> implements CaseService {

    @Autowired
    private CaseDao caseDao;

    @Getter
    private ModelMapper mapper;

    public CaseServiceImpl(CaseDao dao) {
        super(dao); //todo
    }

    @Override
    public CaseDTO mapToDTO(Case entity) {
        return getMapper().map(entity, CaseDTO.class);
    }

    @Override
    public Case mapToEntity(CaseDTO caseDTO) {
        return getMapper().map(caseDTO, Case.class);
    }

    @Override
    public List<CaseDTO> getCasesByPatientId(Integer patientId) {
        return mapToDTO(caseDao.findCasesByPatientId(patientId));
    }
}
