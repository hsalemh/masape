package fr.masape;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.masape.entities.User;

@SpringBootApplication
public class MasapeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MasapeApplication.class, args);

	}

	private void Syso() {
		// TODO Auto-generated method stub
		System.out.println("De la part de Diego");
		System.err.println("bien recus");

		User u = new User("SACKO", "Ismaila", "ismalsacko@yahoo.fr", "Châtinay-Malabey");
		
		System.out.println(u);
	}
}
