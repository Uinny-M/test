package clinic.service.core;

import clinic.dao.api.PrescriptionDao;
import clinic.dto.PrescriptionDTO;
import clinic.entities.Prescription;
import clinic.mappers.PrescriptionMapper;
import clinic.service.api.PrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrescriptionServiceImpl extends AbstractServiceImpl<Prescription, PrescriptionDTO,
        PrescriptionDao, PrescriptionMapper> implements PrescriptionService {
    @Autowired
    public PrescriptionServiceImpl(PrescriptionDao dao, PrescriptionMapper mapper) {
        super(dao,mapper);
    }
}
