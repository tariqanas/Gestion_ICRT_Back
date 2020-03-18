package com.ges.interco;

import java.util.Arrays;

import com.ges.interco.Services.functional.IClient;
import com.ges.interco.Services.functional.IDomaine;
import com.ges.interco.Services.functional.IEmployee;
import com.ges.interco.entities.Client;
import com.ges.interco.entities.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ges.interco.daoSecurity.RoleRepo;
import com.ges.interco.daoSecurity.UsersRepository;
import com.ges.interco.entities.Role;
import com.ges.interco.entities.User;

@SpringBootApplication
public class Application {


	/**
	 * DATA FOR MY DB.
	 * @param args for the main.
	 */
	
	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		UsersRepository userRep= ctx.getBean(UsersRepository.class);
		RoleRepo roleRepo = ctx.getBean(RoleRepo.class);
		IEmployee employeeRepo = ctx.getBean(IEmployee.class);
		IClient clientRepo = ctx.getBean(IClient.class);
		IDomaine domainRepo = ctx.getBean(IDomaine.class);

		Employee emp1 = new Employee();
		emp1.setFirstName("Anas");
		emp1.setLastName("Tariq");
		emp1.setAge(25L);
		emp1.setAnciennete(1L);
		emp1.setNiveau("Confirmé");
		emp1.setNationalité("Marocain");
		emp1.setPhotoIdentity(null);
		emp1.setScore(3000D);
		emp1.setClient(clientRepo.getOne(1L));
		emp1.setDomaine(domainRepo.getOne(1L));
		employeeRepo.save(emp1);
		System.out.println("Ok");



	}

}
