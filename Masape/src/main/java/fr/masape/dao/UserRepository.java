package fr.masape.dao;

import org.springframework.data.repository.CrudRepository;

import fr.masape.entities.User;

public interface UserRepository extends CrudRepository <User, Long>{

}
