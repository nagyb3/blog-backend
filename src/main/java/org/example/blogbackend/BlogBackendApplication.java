package org.example.blogbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlogBackendApplication {

	public static void main(String[] args) {
		System.out.println("Debug: MYSQL_PASSWORD: " + System.getenv("MYSQL_PASSWORD") );
		System.out.println("Debug: MYSQL_USER: " + System.getenv("MYSQL_USER") );
		System.out.println("Debug: MYSQL_HOST: " + System.getenv("MYSQL_HOST") );
		System.out.println("Debug: MYSQL_PORT: " + System.getenv("MYSQL_PORT") );
		System.out.println("Debug: MYSQL_DATABASE: " + System.getenv("MYSQL_DATABASE") );

		SpringApplication.run(BlogBackendApplication.class, args);
	}

}
