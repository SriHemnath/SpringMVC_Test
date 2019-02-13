package com.biju.restService.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.biju.dao.UserDAO;
import com.biju.entity.Person;
import com.biju.model.UserModel;
import com.biju.restService.RestService;

@Service
@Transactional
public class RestServiceIml implements RestService {

	@Autowired
	UserDAO userdao;
	
	@Override
	public Person savePerson(UserModel userModel) {
		Person person = userdao.savePerson(userModel);
		return person;
	}

}
