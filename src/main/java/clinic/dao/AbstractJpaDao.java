package clinic.dao;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


public class AbstractJpaDao<T>  {
    private Class<T> clazz;

    @PersistenceContext
    EntityManager entityManager;

    public void setClazz(Class<T> clazzToSet) {
        this.clazz = clazzToSet;
    }

    public T findOne(Number id) {
        return entityManager.find(clazz, id);
    }

    public List<T> findAll() {
        return entityManager.createQuery("from " + clazz.getName())
                .getResultList();
    }

    public void save(T entity) {
        entityManager.persist(entity);

    }

    public void update(T entity) {
        entityManager.merge(entity);
    }

    public void softDelete(T entity) {
        //todo softDelete or remove method
        entityManager.remove(entity);
    }

    public void deleteById(Long entityId) {
        T entity = findOne(entityId);
        softDelete(entity);
    }
}
