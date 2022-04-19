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


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public String getLuogoDiNascita() {
		return luogoDiNascita;
	}


	public void setLuogoDiNascita(String luogoDiNascita) {
		this.luogoDiNascita = luogoDiNascita;
	}


	public String getDataDiNascita() {
		return dataDiNascita;
	}


	public void setDataDiNascita(String dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}


	public String getPartitaIVA() {
		return partitaIVA;
	}


	public void setPartitaIVA(String partitaIVA) {
		this.partitaIVA = partitaIVA;
	}


	public List<Corso> getCorsi() {
		return corsi;
	}


	public void setCorsi(List<Corso> corsi) {
		this.corsi = corsi;
	}
	
	
}
