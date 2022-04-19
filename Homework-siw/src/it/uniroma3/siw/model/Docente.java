package it.uniroma3.siw.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Docente {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column
	private String nome;
	private String cognome;
	private String luogoDiNascita;
	private String dataDiNascita;
	private String partitaIVA;
	
	
	@OneToMany(mappedBy = "docenti")
	private List<Corso> corsi;
	
	
}
