package ru.home.springsimple.service;

import java.util.List;
import ru.home.springsimple.model.Domain;

public interface Service<E extends Domain> {
    
    public void save(E entity);
    
    public List<E> getAll();
    
    public E getById(Long id);
}
