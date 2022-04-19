package it.uniroma3.siw.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Societ� {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;	
	
	@Column
	private String ragioneSociale;
	private String indirizzo;
	private String numeroTelefonico;
	
	

}
