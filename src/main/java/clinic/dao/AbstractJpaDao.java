package clinic.dao;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.util.List;


public abstract class AbstractJpaDao<T>  {
    private Class<T> clazz;

    @Autowired
    SessionFactory sessionFactory;

    public void setClazz(Class<T> clazzToSet) {
        this.clazz = clazzToSet;
    }

    @Transactional
    public T findOne(Number id) {
        return sessionFactory.getCurrentSession().find(clazz, id);
    }

    @Transactional
    public List<T> findAll() {
        return sessionFactory.getCurrentSession().createQuery("from " + clazz.getName())
                .getResultList();
    }

    @Transactional
    public void save(T entity) {
        sessionFactory.getCurrentSession().persist(entity);

    }

    @Transactional
    public void update(T entity) {
        sessionFactory.getCurrentSession().merge(entity);
    }

    @Transactional
    public void softDelete(T entity) {
        //todo softDelete or remove method
        sessionFactory.getCurrentSession().remove(entity);
    }

    @Transactional
    public void deleteById(Long entityId) {
        T entity = findOne(entityId);
        softDelete(entity);
    }
}
