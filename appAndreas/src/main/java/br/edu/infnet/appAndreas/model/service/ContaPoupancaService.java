package br.edu.infnet.appAndreas.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appAndreas.model.domain.ContaPoupanca;

@Service
public class ContaPoupancaService {

	Map<Integer, ContaPoupanca> mapa = new HashMap<Integer, ContaPoupanca>();
	Integer id = 0;

	public void incluir(ContaPoupanca contaPoupanca) {
		contaPoupanca.setId(++id);

		mapa.put(contaPoupanca.getId(), contaPoupanca);
	}

	public Collection<ContaPoupanca> obterLista() {
		return mapa.values();
	}

}
