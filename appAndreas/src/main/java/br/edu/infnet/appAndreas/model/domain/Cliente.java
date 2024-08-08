package br.edu.infnet.appAndreas.model.domain;

import java.util.List;

public class Cliente {
	
	private String cpf;
	private String nome;
	
	private List<Conta> contas;
	
	
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

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
}
