package com.projetoSpring.curso.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projetoSpring.curso.entities.User;
import com.projetoSpring.curso.repositories.UserRepository;

@Configuration 			  //especifico de configuração
@Profile("test")         // configuração especifica de teste
public class TestConfig implements CommandLineRunner{
	
	@Autowired //resolve a dependencia
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		
		userRepository.saveAll(Arrays.asList(u1,u2));
	}

}
