package com.biju.restService;

import com.biju.entity.Person;
import com.biju.model.UserModel;

public interface RestService {
	public Person savePerson(UserModel userModel);
}
