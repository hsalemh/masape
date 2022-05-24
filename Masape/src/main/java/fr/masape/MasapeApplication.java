package fr.masape;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.masape.dao.UserRepository;
import fr.masape.entities.User;

@SpringBootApplication
public class MasapeApplication implements CommandLineRunner {
	
	@Autowired
	UserRepository userRepo;

	public static void main(String[] args) {
		SpringApplication.run(MasapeApplication.class, args);
		


	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User u1 = new User("SACKO", "Ismaila", "ismalsacko@yahoo.fr", "00 00 56 56 89", "Châtinay-Malabey");
		User u2 = new User("HAMIANE", "Salem", "salem.hamiane@outlook.fr", "0777272727", "AUBERVILLIERS");
		
		userRepo.save(u1);
		userRepo.save(u2);
		
		userRepo.findAll().forEach(u ->  {
			System.out.println(u.toString());
		});
	}



	
}
