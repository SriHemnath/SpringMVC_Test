package com.biju.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.biju.entity.Person;
import com.biju.model.TestModel;
import com.biju.model.UserModel;
import com.biju.service.UserService;

@Controller
public class BijuController {
	
	@Autowired
	UserService userService;

	@RequestMapping("/login")
	public String loadLogin(){
		System.out.println("inside /login");
		return "login";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/validateUser")
	public String validateLogin(@ModelAttribute("userModel")UserModel userModel,HttpServletRequest request, HttpServletResponse response){
		System.out.println("inside /validateUser");
		Person userProfile = userService.getUser(userModel.getUserName());
		System.out.println(userModel.getUserName()+" "+userModel.getUserPassword());
		if(userProfile.getName().equalsIgnoreCase(userModel.getUserName()) && userProfile.getPassword().equalsIgnoreCase(userModel.getUserPassword())){
			System.out.println("valid user");
			//request.setAttribute("userProfile", userProfile);
			return "welcome";
		}else{
			System.out.println("Invalid user");
			return "login";
		}
	}
	
	@RequestMapping("/welcome")
	public String welcomePage(ModelMap model,HttpServletRequest request, HttpServletResponse response){
		System.out.println("inside /welcome");
		/*TestModel testmodel = null;
		model.addAttribute("testModel", testmodel);*/
		return "welcome";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/addUser")
	public String addUser(@ModelAttribute("testModel")TestModel testModel,Model model){
		System.out.println("inside /adduser");
		System.out.println(testModel.toString());
		
		return null;
	}
}
