package com.biju.dao;

import com.biju.entity.Person;
import com.biju.model.UserModel;

public interface UserDAO {

	public Person getUser(String userName);
	public Person savePerson(UserModel userModel);
}
