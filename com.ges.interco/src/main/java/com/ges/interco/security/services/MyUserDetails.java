package com.ges.interco.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ges.interco.dao.UsersRepository;
import com.ges.interco.entities.User;
import com.ges.interco.security.entities.UserPrincipal;

@Service
public class MyUserDetails implements UserDetailsService {

	@Autowired
	private UsersRepository useRepo;


	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = useRepo.findByuserName(username).
					orElseThrow(() -> new UsernameNotFoundException("404 - User not found."));
		return new UserPrincipal(user);
		
	}

}
