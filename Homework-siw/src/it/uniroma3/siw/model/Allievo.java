package it.uniroma3.siw.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;



@Entity
public class Allievo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;	
	
	@Column
	private String nome;
	private String cognome;
	private String dataNascita;
	private String luogoNascita;
	private String matricola;
	private String email;
	
	@ManyToMany(mappedBy = "allievi",fetch = FetchType.EAGER)
	private List<Corso> corsi;
	@ManyToOne
	private Società società;
}
