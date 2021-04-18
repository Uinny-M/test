package dao;

import java.util.List;

public interface SoftDeleteDao<T> {
    //todo написать дефолтные методы
    public default T findById(int id){return null;}
    public default List<T> findAll(){return null;}
    public default void update(T entity) {}
    public default void save(T entity){}
    public default void delete(T entity){}
}
