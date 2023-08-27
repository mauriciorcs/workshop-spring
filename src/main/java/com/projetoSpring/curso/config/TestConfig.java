package com.projetoSpring.curso.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projetoSpring.curso.entities.Order;
import com.projetoSpring.curso.entities.User;
import com.projetoSpring.curso.entities.enums.OrderStatus;
import com.projetoSpring.curso.repositories.OrderRepository;
import com.projetoSpring.curso.repositories.UserRepository;

@Configuration 			  //especifico de configuração
@Profile("test")         // configuração especifica de teste
public class TestConfig implements CommandLineRunner{
	
	@Autowired //resolve a dependencia
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1); 
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WATTING_PAYMENT, u2); 
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WATTING_PAYMENT, u1); 

		userRepository.saveAll(Arrays.asList(u1,u2));
		
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
	}

}
