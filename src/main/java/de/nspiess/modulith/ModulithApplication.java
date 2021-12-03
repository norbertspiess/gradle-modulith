package de.nspiess.modulith;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync // to allow async events
public class ModulithApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModulithApplication.class, args);
	}

}
