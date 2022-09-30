package br.com.fiap.challengesprint3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("br.com.fiap.challengesprint3.repository")

public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
