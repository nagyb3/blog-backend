package org.example.blogbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlogBackendApplication {

	public static void main(String[] args) {
		System.out.println("Debug: MYSQL_URL: " + System.getenv("MYSQL_URL") );
		System.out.println("Debug: MYSQL_PASSWORD: " + System.getenv("MYSQL_PASSWORD") );
		System.out.println("Debug: MYSQL_USER: " + System.getenv("MYSQL_USER") );

		SpringApplication.run(BlogBackendApplication.class, args);
	}

}
