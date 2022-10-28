package com.example.demo.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Auteur {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idAut;
	private String nomAut;
	private String descriptionAut;
	
	@OneToMany(mappedBy="auteur")
	@JsonIgnore
	private List<Livre> livres;

	
	public Auteur(Long idAut, String nomAut, String descriptionAut, List<Livre> livres) {
		super();
		this.idAut = idAut;
		this.nomAut = nomAut;
		this.descriptionAut = descriptionAut;
		this.livres = livres;
	}

	public Auteur() {
		super();
		
	}

	public Long getIdAut() {
		return idAut;
	}

	public void setIdAut(Long idAut) {
		this.idAut = idAut;
	}

	public String getNomAut() {
		return nomAut;
	}

	public void setNomAut(String nomAut) {
		this.nomAut = nomAut;
	}

	public String getDescriptionAut() {
		return descriptionAut;
	}

	public void setDescriptionAut(String descriptionAut) {
		this.descriptionAut = descriptionAut;
	}

	public List<Livre> getLivres() {
		return livres;
	}

	public void setLivres(List<Livre> livres) {
		this.livres = livres;
	}

	@Override
	public String toString() {
		return "Auteur [idAut=" + idAut + ", nomAut=" + nomAut + ", descriptionAut=" + descriptionAut + ", livres="
				+ livres + "]";
	}
	


}
