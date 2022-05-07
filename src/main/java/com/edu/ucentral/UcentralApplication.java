package com.edu.ucentral;

import com.edu.ucentral.modelo.ticket;
import com.edu.ucentral.repository.Ticketrepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;
import java.util.Date;

@SpringBootApplication
public class UcentralApplication {

	public static void main(String[] args) {

	SpringApplication.run(UcentralApplication.class, args);

	}

}
