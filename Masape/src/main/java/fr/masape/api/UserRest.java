package fr.masape.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@DeleteMapping("/user/{id}")
	public boolean deleteById(@PathVariable Long id) {
		if(userRepo.findById(id).isPresent()) {
			userRepo.deleteById(id);
			return true;
		}else {
			return false;
		}
	}
	
	@PutMapping("/user/{id}")
	public User modifUser(@RequestBody User u, @PathVariable Long id) {
		u.setId(id);
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
