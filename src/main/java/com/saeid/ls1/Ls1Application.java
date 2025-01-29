package com.saeid.ls1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class Ls1Application {


	public static void main(String[] args) {
		SpringApplication.run(Ls1Application.class, args);
	}

//	@Bean
//	CommandLineRunner run(CustomerRepository customerRepository) {
//		return args -> {
//			Customer ahmad = new Customer("ahmad", "ahm@test.com", 43);
//			Customer ali = new Customer("ali", "ali@test.com", 32);
//			List<Customer> customers = List.of(ahmad, ali);
//			customerRepository.saveAll(customers);
//		};
//	}


}
