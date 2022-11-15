package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.entities.Auteur;
@RepositoryRestResource(path = "aut")
@CrossOrigin(origins="http://localhost:4200/") 
public interface AuteurRepository extends JpaRepository<Auteur,Long>{

}
