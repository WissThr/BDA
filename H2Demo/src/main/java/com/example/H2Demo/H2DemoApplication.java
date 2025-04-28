package com.example.H2Demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.H2Demo.entities.Adherent;
import com.example.H2Demo.repository.AdherentRepository;

@SpringBootApplication
public class H2DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(H2DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(AdherentRepository repo) {
		return args -> {
			repo.save(new Adherent(null, "John Doe", "New York", 30));
			repo.save(new Adherent(null, "Jane Smith", "Los Angeles", 25));
			repo.save(new Adherent(null, "Alice Johnson", "Chicago", 28));
			repo.save(new Adherent(null, "Bob Brown", "Houston", 35));
		};
	}

}
