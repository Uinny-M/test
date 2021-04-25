package clinic.dao.core;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

public abstract class AbstractHibernateDao<T>  {
    private Class<T> clazz;

    @Autowired
    SessionFactory sessionFactory;

    public void setClazz(Class<T> clazzToSet) {
        this.clazz = clazzToSet;
    }

    @Transactional
    public T findById(Number id) {
        return sessionFactory.getCurrentSession().find(clazz, id);
    }

    @Transactional
    public List<T> findAll() {
        return sessionFactory.getCurrentSession().createQuery("from " + clazz.getName())
                .getResultList();
    }

    @Transactional
    public T save(T entity) {
        sessionFactory.getCurrentSession().save(entity);
        return entity;
    }

    @Transactional
    public T update(T entity) {
        return (T) sessionFactory.getCurrentSession().merge(entity);
    }

    @Transactional
    public void delete(T entity) {
        //todo softDelete or remove method
        sessionFactory.getCurrentSession().remove(entity);
    }

    @Transactional
    public void deleteById(Number entityId) {
        T entity = findById(entityId);
        delete(entity);
    }
}
