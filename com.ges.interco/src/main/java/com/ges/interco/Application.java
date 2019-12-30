package com.ges.interco;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ges.interco.dao.RoleRepo;
import com.ges.interco.dao.UsersRepository;
import com.ges.interco.entities.Role;
import com.ges.interco.entities.User;

@SpringBootApplication
public class Application {

	
	//DATA FOR MY DB ;
	
	public static void main(String[] args) {
		
		Role role1 = new Role(1L,"ADMIN");
		Role role2 = new Role(2L,"USER");
		
		
		
		User user = new User();
		user.setFirstName("Anas");
		user.setLastName("TARIQ");
		user.setUserName("ATA");
		user.setPassword("TA");
		user.setRoles(Arrays.asList(role1));
	
		User user2 = new User();
		user2.setFirstName("Anas");
		user2.setLastName("TARIQ");
		user2.setUserName("ATU");
		user2.setPassword("TA");
		user2.setRoles(Arrays.asList(role2));
		
		
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		UsersRepository userRep= ctx.getBean(UsersRepository.class);
		RoleRepo roleRepo = ctx.getBean(RoleRepo.class);
	
		
		role1.setUser(user);
		role2.setUser(user2);
		
		userRep.save(user);
		userRep.save(user2);
		roleRepo.save(role1);
		roleRepo.save(role2);
		
	
		
	}

}
