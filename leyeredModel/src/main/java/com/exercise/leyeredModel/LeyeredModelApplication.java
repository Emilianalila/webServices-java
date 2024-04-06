package com.exercise.leyeredModel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//dependency injection using @Autowired, the most important part is to not use object instantiation to get and use the methods of a class
@SpringBootApplication
public class LeyeredModelApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeyeredModelApplication.class, args);
	}

}
