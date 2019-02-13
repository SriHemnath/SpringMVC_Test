package com.biju.restcontroller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.biju.entity.Person;
import com.biju.model.UserModel;
import com.biju.restService.RestService;

@RequestMapping("/rest")
@RestController
public class BijurestController {
	@Autowired
	RestService restService;
	
	@RequestMapping(value = "populateuser", method=RequestMethod.POST, headers = { "content-type=application/json" })
	public ResponseEntity<String> populateUser(@Valid @RequestBody UserModel userModel){
		System.out.println("Inside rest populate user");
		System.out.println(userModel.getUserName()+" "+userModel.getUserPassword());
		Person person = null;
		try{
			person = restService.savePerson(userModel);
		}catch(Exception e){
			e.printStackTrace();
		}
		return new ResponseEntity<>(HttpStatus.CREATED);
		
	}
}
