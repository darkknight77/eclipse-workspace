package org.corona;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "org.corona")
@EnableAutoConfiguration
public class DoctorsSprBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctorsSprBootApplication.class, args);
	}

}
