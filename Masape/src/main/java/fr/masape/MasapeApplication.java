package fr.masape;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.masape.dao.CommandeRepository;
import fr.masape.dao.ProduitRepository;
import fr.masape.dao.UserRepository;

import fr.masape.entities.Commande;
import fr.masape.entities.Produit;

import fr.masape.entities.User;

@SpringBootApplication
public class MasapeApplication implements CommandLineRunner {
	
	@Autowired
	UserRepository userRepo;
	@Autowired
	CommandeRepository commandeRepo;
	@Autowired
	ProduitRepository produitRepo;

	public static void main(String[] args) {
		SpringApplication.run(MasapeApplication.class, args);
		System.out.println("salut");

	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		

//		Produit p = new Produit("Paton", 75.00);

		//userRepo.save(u1);
		//userRepo.save(u2);
		
		userRepo.findAll().forEach(u ->  {
			System.out.println(u.toString());
		});
		

	}

	
}
