package models.dao;

import java.util.List;

public interface EntityDao<T> {
    public void create(T entity);
    
    public T find(Object id);
    public List<T> findAll();
    
    public void update(T entity);
    public void delete(Object id);
}
