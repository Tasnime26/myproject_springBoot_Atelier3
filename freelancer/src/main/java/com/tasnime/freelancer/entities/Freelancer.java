package com.tasnime.freelancer.entities;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Freelancer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFreelancer;
	private String nomFreelancer;
	private Double salaireFreelancer;
	private Date dateinscription;;
	public Freelancer() {
	super();
	}
	public Freelancer(String nomFreelancer, Double salaireFreelancer, Date dateinscription) {
	super();
	this.nomFreelancer = nomFreelancer;
	this.salaireFreelancer = salaireFreelancer;
	this.dateinscription = dateinscription;
	}
	public Long getIdFreelancer() {
		return idFreelancer;
	}
	public void setIdFreelancer(Long idFreelancer) {
		this.idFreelancer = idFreelancer;
	}
	public String getNomFreelancer() {
		return nomFreelancer;
	}
	public void setNomFreelancer(String nomFreelancer) {
		this.nomFreelancer = nomFreelancer;
	}
	public Double getSalaireFreelancer() {
		return salaireFreelancer;
	}
	public void setSalaireFreelancer(Double salaireFreelancer) {
		this.salaireFreelancer = salaireFreelancer;
	}
	public Date getDateinscription() {
		return dateinscription;
	}
	public void setDateinscription(Date dateinscription) {
		this.dateinscription = dateinscription;
	}
	@Override
	public String toString() {
		return "Freelancer [idFreelancer=" + idFreelancer + ", nomFreelancer=" + nomFreelancer + ", salaireFreelancer="
				+ salaireFreelancer + ", dateinscription=" + dateinscription + "]";
	}
	
}
