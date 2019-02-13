package com.biju.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.biju.dao.UserDAO;
import com.biju.entity.Person;
import com.biju.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDAO userDAO;

	@Override
	@Transactional
	public Person getUser(String userName) {
		try{
			Person user = userDAO.getUser(userName);
			return user;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

}
