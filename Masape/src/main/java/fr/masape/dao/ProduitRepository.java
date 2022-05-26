package fr.masape.dao;

import org.springframework.data.repository.CrudRepository;

import fr.masape.entities.Produit;

public interface ProduitRepository extends CrudRepository<Produit, Long> {

}
