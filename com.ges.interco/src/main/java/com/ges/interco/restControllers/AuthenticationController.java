package com.ges.interco.restControllers;

import java.util.Optional;
import java.util.logging.Logger;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ges.interco.dao.UsersRepository;
import com.ges.interco.entities.User;

@CrossOrigin(origins = "*")
@RestController
public class AuthenticationController {

	@Autowired
	UsersRepository user;

	@GetMapping("/auth")
	public JSONObject login(Authentication connectedUser) {

		Logger log = Logger.getLogger("Authentication Logger");
		Optional<User> utilisateur = user.findByuserName(connectedUser.getName());

		JSONObject json = new JSONObject();

		utilisateur.get().getRoles().forEach(_w -> {
			json.put("role", _w);
		});

		return json;
	}

}
