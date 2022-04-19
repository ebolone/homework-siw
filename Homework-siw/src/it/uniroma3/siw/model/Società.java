package it.uniroma3.siw.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Società {
	@Id
	private Long id;	
	
	@Column
	private String ragioneSociale;
	private String indirizzo;
	private String numeroTelefonico;

}
