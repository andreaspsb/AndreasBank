package br.edu.infnet.appAndreas.model.domain;

public class Cliente {
	
	private String cpf;
	private String nome;
	
	
	@Override
	public String toString() {
		return cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
