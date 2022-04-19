package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

public class Corso {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	private String nome;
	private LocalDate datainizio;
	private int mesi;
	@ManyToMany(cascade = {CascadeType.PERSIST}) // è utile avere una lista persistente di tutti gli allievi affiliati a un corso
	private List<Allievo> allievi;
	@ManyToOne
	private Docente docente;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDatainizio() {
		return datainizio;
	}
	public void setDatainizio(LocalDate datainizio) {
		this.datainizio = datainizio;
	}
	public int getMesi() {
		return mesi;
	}
	public void setMesi(int mesi) {
		this.mesi = mesi;
	}
	public List<Allievo> getAllievi() {
		return allievi;
	}
	public void setAllievi(List<Allievo> allievi) {
		this.allievi = allievi;
	}
	public Docente getDocente() {
		return docente;
	}
	public void setDocente(Docente docente) {
		this.docente = docente;
	}
	
}
