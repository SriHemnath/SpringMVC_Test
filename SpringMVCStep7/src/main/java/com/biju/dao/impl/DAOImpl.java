package com.biju.dao.impl;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.biju.dao.UserDAO;
import com.biju.entity.Person;
import com.biju.model.UserModel;

@Repository
public class DAOImpl implements UserDAO{
	
	@Autowired
	SessionFactory sessionFactory;
	
	Session session;
	
	@Override
	public Person getUser(String userName) {
		Person user = new Person();
		try{
			session = sessionFactory.getCurrentSession();
			Criteria criteria = session.createCriteria(Person.class).add(Restrictions.eq("name", userName).ignoreCase());
			user = (Person) criteria.uniqueResult();
			return user;
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public Person savePerson(UserModel userModel) {
		try{
			Session session = sessionFactory.getCurrentSession();
			Person person = new Person();
			person.setName(userModel.getUserName());
			person.setPassword(userModel.getUserPassword());
			session.save(person);
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

}
