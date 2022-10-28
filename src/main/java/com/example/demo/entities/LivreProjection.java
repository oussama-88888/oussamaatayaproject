package com.example.demo.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="nomLiv",types= {Livre.class})
public interface LivreProjection {
	public String getNomLivre();

}
