package clinic.dao.core;

import clinic.dao.api.PrescriptionDao;
import clinic.entities.Prescription;
import org.springframework.stereotype.Repository;

@Repository
public class PrescriptionDaoImpl extends AbstractHibernateDao<Prescription> implements PrescriptionDao {
    public PrescriptionDaoImpl(){
        super(Prescription.class);
    }
}
