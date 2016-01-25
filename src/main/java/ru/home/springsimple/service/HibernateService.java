package ru.home.springsimple.service;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ru.home.springsimple.model.Domain;

public class HibernateService<E extends Domain> implements Service<E> {
    
    protected Class<E> type;
    
    @Inject
    private SessionFactory sessionFactory;

    public HibernateService(Class<E> type) {
        this.type = type;
    }

//    public HibernateService(Class<E> type, SessionFactory sessionFactory) {
//        this.type = type;
//        this.sessionFactory = sessionFactory;
//    }
    
//    @SuppressWarnings("unchecked")
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    @Override
    public void save(E entity) {
        sessionFactory.getCurrentSession().save(entity);
    }
    
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    @Override
    public List<E> getAll() {
//        Session session = sessionFactory.getCurrentSession();
//        return session.createCriteria(type).list();
        return sessionFactory.getCurrentSession().createCriteria(type).list();
    }
    
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    @Override
    public E getById(Long id) {
        return (E) sessionFactory.getCurrentSession().get(type, id);
    }

}
