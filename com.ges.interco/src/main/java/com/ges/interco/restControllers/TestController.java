package com.ges.interco.restControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ges.interco.dao.UsersRepository;
import com.ges.interco.entities.User;

@RestController
public class TestController {

	@Autowired
	UsersRepository user;
	
	@GetMapping("users")
	public List<User> users() {
		
		
		return user.findAll(); 
	}
}
