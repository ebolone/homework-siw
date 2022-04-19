package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

public class Corso {
	@Id
	
	private Long id;
	@Column
	private String nome;
	private LocalDate datainizio;
	private int mesi;
	@ManyToMany
	private List<Allievo> allievi;
	
}
