package com.example.PayMe.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private float balance;
	
	private String iban;
	
	private String email;
	
	private String pwd;
	
	@ManyToMany
	private List<User> listContacts;
	
	@OneToMany(mappedBy ="sender")
	private List<Transaction> listeTransaction;
	
	@OneToMany(mappedBy ="user")
	private List<Virement> listeVirement;
}
