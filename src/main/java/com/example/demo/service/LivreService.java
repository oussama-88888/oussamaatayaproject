package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Auteur;
import com.example.demo.entities.Livre;

public interface LivreService {
	Livre saveLivre(Livre l);
	Livre updateLivre(Livre l);
	void deleteLivre(Livre l);
	void deleteLivreById(Long id);
	Livre getLivre(Long id);
	List<Livre> getAllLivres();
	List<Livre> getAllProduits();
	List<Livre> findByNomLivre(String nom);
	List<Livre> findByNomLivreContains(String nom);
	List<Livre> findByNomPrix (String nom, Double prix);
	List<Livre> findByAuteur (Auteur auteur);
	List<Livre> findByAuteurIdAut(Long id);
	List<Livre> findByOrderByNomAuteurAsc();
	List<Livre> trierAuteursNomsPrix();
}
