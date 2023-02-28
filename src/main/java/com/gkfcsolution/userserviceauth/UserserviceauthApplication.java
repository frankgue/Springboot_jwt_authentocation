package com.gkfcsolution.userserviceauth;

import com.gkfcsolution.userserviceauth.domain.Role;
import com.gkfcsolution.userserviceauth.domain.User;
import com.gkfcsolution.userserviceauth.service.impl.UserServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class UserserviceauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserserviceauthApplication.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	CommandLineRunner run(UserServiceImpl userService) {
		return args -> {
			userService.saveRole(new Role(null, "ROLE_USER"));
			userService.saveRole(new Role(null, "ROLE_MANAGER"));
			userService.saveRole(new Role(null, "ROLE_ADMIN"));
			userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));


			userService.saveUser(new User(null, "Frank Guekeng", "frank", "1234", new ArrayList<>()));
			userService.saveUser(new User(null, "Cabrel Kueti", "cabrel", "5678", new ArrayList<>()));
			userService.saveUser(new User(null, "Ludovic Jongo", "ludovic", "9999", new ArrayList<>()));
			userService.saveUser(new User(null, "Hermann Nguekeng", "hermann", "herman", new ArrayList<>()));

			userService.addRoleToUser("hermann", "ROLE_USER");
			userService.addRoleToUser("hermann", "ROLE_MANAGER");
			userService.addRoleToUser("ludovic", "ROLE_MANAGER");
			userService.addRoleToUser("cabrel", "ROLE_ADMIN");
			userService.addRoleToUser("frank", "ROLE_SUPER_ADMIN");
			userService.addRoleToUser("frank", "ROLE_ADMIN");
			userService.addRoleToUser("frank", "ROLE_USER");

		};
	}

}
