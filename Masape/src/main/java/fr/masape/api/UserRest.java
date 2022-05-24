package fr.masape.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.masape.dao.UserRepository;
import fr.masape.entities.User;

@RestController @CrossOrigin
public class UserRest {
	@Autowired
	UserRepository userRepo;
	
	@GetMapping("/user")
	public List<User> getAllUser(){
		return (List<User>) userRepo.findAll();
	}
	
	@PostMapping("/user")
	public User saveUser(@RequestBody User u) {
		return userRepo.save(u);
	}
	
	@PostMapping("/connexion")
	public User connexion(@RequestBody User u){
		List<User> users = (List<User>) userRepo.findAll();
		User use = new User();
		for (User us : users) {
			if(us.getEmail().equals(u.getEmail()) && us.getPassword().equals(u.getPassword())) {
				use=us;
			}
		}
		return use;
	}

}
