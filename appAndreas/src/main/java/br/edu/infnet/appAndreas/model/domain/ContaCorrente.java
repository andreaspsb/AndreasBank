package br.edu.infnet.appAndreas.model.domain;

public class ContaCorrente extends Conta {

	private float limite;
	private float taxaManutencao;

	@Override
	public String toString() {
		return String.format("%s;%.2f;%.2f", super.toString(), limite, taxaManutencao);
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	public float getTaxaManutencao() {
		return taxaManutencao;
	}

	public void setTaxaManutencao(float taxaManutencao) {
		this.taxaManutencao = taxaManutencao;
	}

}
