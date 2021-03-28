package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@RestController
@SpringBootApplication
public class ElbWebAppApplication {

	@RequestMapping("/date")
	public String home() {
		Date date=java.util.Calendar.getInstance().getTime();

		return "\n" + "{date: " +date.toString()+ "}";
	}

	public static void main(String[] args) {
		SpringApplication.run(ElbWebAppApplication.class, args);
	}

}
