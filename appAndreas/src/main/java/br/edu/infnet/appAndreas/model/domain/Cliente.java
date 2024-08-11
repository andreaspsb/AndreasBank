package br.edu.infnet.appAndreas.model.domain;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private Integer id;

	private String cpf;
	private String nome;

	private List<Conta> contas;

	public Cliente() {
		contas = new ArrayList<Conta>();
	}

	@Override
	public String toString() {
		return String.format("%d,%s;%s;%d;%s", id, cpf, nome, contas.size(), contas);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
