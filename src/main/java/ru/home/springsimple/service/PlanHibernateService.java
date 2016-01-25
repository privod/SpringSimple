package ru.home.springsimple.service;

import javax.inject.Named;

import ru.home.springsimple.model.Plan;

@Named(value = "planService")
public class PlanHibernateService extends HibernateService<Plan> implements PlanService {

//  public PlanHibernateService(SessionFactory sessionFactory) {
//      super(Plan.class, sessionFactory);
//  }


  public PlanHibernateService() {
      super(Plan.class);
  }
}
