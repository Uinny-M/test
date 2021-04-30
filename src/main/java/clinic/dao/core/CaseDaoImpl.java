package clinic.dao.core;

import clinic.dao.api.CaseDao;
import clinic.entities.Case;
import org.hibernate.annotations.NamedNativeQueries;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CaseDaoImpl extends AbstractHibernateDao<Case> implements CaseDao {
public CaseDaoImpl(){super(Case.class);}
    public List<Case> findCasesByPatientId(Integer patientId)
    {
        return null;
    } //todo
}
