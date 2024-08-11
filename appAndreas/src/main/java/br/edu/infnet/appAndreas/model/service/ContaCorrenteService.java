package br.edu.infnet.appAndreas.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appAndreas.model.domain.ContaCorrente;

@Service
public class ContaCorrenteService {

	Map<Integer, ContaCorrente> mapa = new HashMap<Integer, ContaCorrente>();
	Integer id = 0;

	public void incluir(ContaCorrente contaCorrente) {
		contaCorrente.setId(++id);

		mapa.put(contaCorrente.getId(), contaCorrente);
	}

	public Collection<ContaCorrente> obterLista() {
		return mapa.values();
	}

}
