package fr.masape;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.masape.entities.User;

@SpringBootApplication
public class MasapeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MasapeApplication.class, args);
		
		User u = new User("SACKO", "Ismaila", "ismalsacko@yahoo.fr", "00 00 56 56 89", "Châtinay-Malabey");
		
		System.out.println(u);
	}

	
}
