package br.edu.infnet.primeiro_exemplo_maven.dominio;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aluno {
	
	@Id
	private String matricula;
	
	private String nome;
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}

