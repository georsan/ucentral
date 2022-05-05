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

	ApplicationContext context= SpringApplication.run(UcentralApplication.class, args);
	Ticketrepository repos = context.getBean(Ticketrepository.class);
	ticket t1=new ticket(11L,"hla", "03/03/2000","04/04/2021","fh","SHGO","dJHGis");
	repos.save(t1);
	ticket t2=new ticket(null,"hla", "03/03/2000","04/04/2021","fh","SHGO","dJHGis");
	repos.save(t2);

	}

}
