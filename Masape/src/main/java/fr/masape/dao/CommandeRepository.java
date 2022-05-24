package fr.masape.dao;

import org.springframework.data.repository.CrudRepository;

import fr.masape.entities.Commande;

public interface CommandeRepository extends CrudRepository<Commande, Long>{

}
