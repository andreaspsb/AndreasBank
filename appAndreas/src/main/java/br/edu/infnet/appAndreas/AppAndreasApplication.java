package br.edu.infnet.appAndreas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppAndreasApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppAndreasApplication.class, args);
	}

}
