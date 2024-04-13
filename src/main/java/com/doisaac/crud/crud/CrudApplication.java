package com.doisaac.crud.crud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudApplication {
	@Value("${spring.datasource.url}")

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

}
