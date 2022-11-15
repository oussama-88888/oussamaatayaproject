package com.example.demo;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entities.Auteur;
import com.example.demo.entities.Livre;
import com.example.demo.repos.LivreRepository;


@SpringBootTest
class LivresApplicationTests {

	@Autowired
	private LivreRepository livreRepository;
	
	@Test
	public void testCreateLivre() {
	Livre prod = new Livre("oussama",745.00,new Date());
	livreRepository.save(prod);
	}
	@Test
	public void testFindLivre()
	{
	Livre p = livreRepository.findById(1L).get();
	System.out.println(p);
	}
	@Test
	public void testUpdateLivre()
	{
	Livre p = livreRepository.findById(1L).get();
	p.setPrixLivre(2000.0);
	livreRepository.save(p);
	
	System.out.println(p);
	}
	@Test
	public void testDeleteLivre()
	{
		livreRepository.deleteById(1L);
	}
	@Test
	public void testFindAllLivres()
	{
		List<Livre> prods = livreRepository.findAll();
		
		for (Livre p:prods)
			 System.out.println(p);
		
	}
	@Test
	public void testFindAllLivresByNomContains()
	{
		List<Livre> prods = livreRepository.findByNomLivreContains("P");
		for (Livre p:prods)
		System.out.println(p);
		
	}
	@Test
	public void testfindByNomPrix()
	{
	List<Livre> prods = livreRepository.findByNomPrix("oussama", 1900.00);
		for (Livre p : prods)
			{
				System.out.println(p);
			}
	}
	@Test
	public void testfindByAuteur()
	{
	Auteur aut = new Auteur();
	aut.setIdAut(1L);
	
	List<Livre> livs = livreRepository.findByAuteur(aut);
	for (Livre l : livs)
	{
		System.out.println(l);
	}
	}
	@Test
	public void findByAuteurIdAut()
	{
	List<Livre> livs = livreRepository.findByAuteurIdAut(1L);
	for (Livre l : livs)
	{
		System.out.println(l);
	}
	}
	@Test
	public void testfindByOrderByNomProduitAsc()
	{
	List<Livre> livs =  livreRepository.findByOrderByNomLivreAsc();
	for (Livre l : livs)
		{
			System.out.println(l);
		}
	}
	@Test
	public void testTrierLivresNomsPrix()
	{
	List<Livre> livs = livreRepository.trierLivresNomsPrix();
	for (Livre l : livs)
	{
	System.out.println(l);
	}
	}
}
