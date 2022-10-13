package com.devsuperior.dsmeta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.devsuperior.dsmeta.services.UserService;

@SpringBootApplication
public class DsmetaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DsmetaApplication.class, args);
	}

	@Autowired
	UserService userService; 
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("--------------------------");
		System.out.println("Spring Security Course !!!");
		System.out.println("--------------------------");
		
		System.out.println(new BCryptPasswordEncoder());
		
		
		
		//System.out.println(userService.findAll());
		
		
		//Departament d1 = new Departament(1L,"Vendas");
		//Departament d2 = new Departament(2L,"Marketing");
		
		//System.out.println(d1);
		//System.out.println(d2);
		
		//Employee e1 = new Employee(1L, "Maria", 6000.00, d1);
		
		//System.out.println(e1);
	}
	
	/*
	 * implements CommandLineRunner 
	 * 
	 * com metodo run()
	 * 
	 * Outra forma de rodar na inicialização
	 * 
	@Bean
	InitializingBean sendDatabase() { 
		
		System.out.println("---------------");
		System.out.println("Hello world !!!");
		System.out.println("---------------");
		
	    return () -> {
	    };
	}
	*/
	

}
