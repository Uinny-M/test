package clinic.service.core;

import clinic.dao.api.CaseDao;
import clinic.dto.CaseDTO;
import clinic.entities.Case;
import clinic.mappers.CaseMapper;
import clinic.service.api.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CaseServiceImpl extends AbstractServiceImpl<Case, CaseDTO, CaseDao, CaseMapper> implements CaseService {

    @Autowired
    private CaseServiceImpl(CaseDao dao, CaseMapper mapper) {
        super(dao, mapper);
    }

    @Override
    public List<CaseDTO> getCasesByPatientId(Integer patientId) {
        return mapToDTO(dao.findCasesByPatientId(patientId));
    }

    @Override
    public List<Case> getCases(Integer i) {
        return dao.findAll();
    }
}
