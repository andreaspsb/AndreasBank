package br.edu.infnet.appAndreas.model.domain;

public abstract class Conta {
	private String numero;
	private float saldo;
	private boolean isAtivo;
	
	@Override
	public String toString() {
		return String.format("%s;%.2f;%s", numero, saldo, isAtivo ? "ativo=sim" : "ativo=não");
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean isAtivo() {
		return isAtivo;
	}

	public void setAtivo(boolean isAtivo) {
		this.isAtivo = isAtivo;
	}

	
}
