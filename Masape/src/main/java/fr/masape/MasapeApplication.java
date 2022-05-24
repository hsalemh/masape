package fr.masape;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.masape.entities.User;

@SpringBootApplication
public class MasapeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MasapeApplication.class, args);

		
		User u = new User("SACKO", "Ismaila", "ismalsacko@yahoo.fr", "00 00 56 56 89", "Châtinay-Malabey");
=======

	}

	private void Syso() {
		// TODO Auto-generated method stub
		System.out.println("De la part de Diego");
		System.err.println("bien recus");

		User u = new User("SACKO", "Ismaila", "ismalsacko@yahoo.fr", "Châtinay-Malabey");
>>>>>>> branch 'master' of https://github.com/hsalemh/masape.git
		
		System.out.println(u);
	}

	
}
