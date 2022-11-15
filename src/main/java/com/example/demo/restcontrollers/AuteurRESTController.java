package com.example.demo.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Auteur;
import com.example.demo.repos.AuteurRepository;

@RestController
@RequestMapping("/api/aut")
@CrossOrigin("*")
public class AuteurRESTController {
@Autowired
AuteurRepository auteurRepository;


@RequestMapping(method=RequestMethod.GET)
public List<Auteur> getAllCategories()
{
return auteurRepository.findAll();
}


@RequestMapping(value="/{id}",method = RequestMethod.GET)
public Auteur getAuteurById(@PathVariable("id") Long id) {
return auteurRepository.findById(id).get();
}
}
