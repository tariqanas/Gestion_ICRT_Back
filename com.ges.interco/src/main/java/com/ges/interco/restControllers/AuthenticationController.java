package com.ges.interco.restControllers;

import java.security.Principal;
import java.util.Base64;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.ges.interco.dao.UsersRepository;
import com.ges.interco.entities.User;

@CrossOrigin(origins = "*")
@RestController
public class AuthenticationController {

	@Autowired
	UsersRepository user;
	

	@GetMapping("/auth")
	public Optional<User> login(Principal principale) {
		
		Logger log = Logger.getLogger("Authentication Logger");
		log.log(Level.INFO, "The Authenticated user is :" + principale.getName());
		// For Now..
		return user.findById(1L);
	}

}
