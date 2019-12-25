package com.ges.interco.restControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ges.interco.dao.UsersRepository;
import com.ges.interco.entities.User;

@CrossOrigin(origins = "*")
@RestController
public class AuthenticationController {

	@Autowired
	UsersRepository user;

	@PostMapping("auth")
	public void authenticated(@RequestBody User utilisateur) {
		
		System.out.println(utilisateur.toString());

	}
}
