package br.edu.infnet.appAndreas.model.domain;

import java.util.ArrayList;
import java.util.List;

public class Agencia {

	private Integer id;

	private String codigo;
	private String nome;

	private List<Conta> contas;

	public Agencia() {
		contas = new ArrayList<Conta>();
	}

	@Override
	public String toString() {
		return String.format("%d;%s;%s;%d;%s", id, codigo, nome, contas.size(), contas);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
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
