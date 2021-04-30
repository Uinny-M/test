package clinic.dao.core;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public abstract class AbstractHibernateDao<T>  {
    private Class<T> clazz;

    @PersistenceContext
    protected EntityManager em;

    public AbstractHibernateDao(Class<T> clazzToSet) {
        this.clazz = clazzToSet;
    }

    @Transactional
    public T findById(Number id) {
        return em.find(clazz, id);
    }

    @Transactional
    public List<T> findAll() {
        return em.createQuery("from " + clazz.getName(), clazz)
                .getResultList();
    }

    @Transactional
    public T save(T entity) {
        em.persist(entity);
        em.flush();
        return entity;
    }

    @Transactional
    public T update(T entity) {
        return em.merge(entity);
    }

    @Transactional
    public void delete(T entity) {
        //todo softDelete or remove method
        em.remove(em.contains(entity) ? entity : em.merge(entity));
    }

    @Transactional
    public void deleteById(Number entityId) {
        T entity = findById(entityId);
        delete(entity);
    }
}
