package com.sip.ams.entities;

public class Candidat {
	private int Id;
	private String Nom;
	private String Email;
	private String Telephone;
	
	public Candidat(int id, String nom, String email, String telephone) {
		Id = id;
		Nom = nom;
		Email = email;
		Telephone = telephone;
	}
	public Candidat() {
		
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getTelephone() {
		return Telephone;
	}
	public void setTelephone(String telephone) {
		Telephone = telephone;
	}

}
