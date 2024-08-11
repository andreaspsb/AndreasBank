package br.edu.infnet.appAndreas.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appAndreas.model.domain.Agencia;

@Service
public class AgenciaService {

	Map<Integer, Agencia> mapa = new HashMap<Integer, Agencia>();
	Integer id = 0;

	public void incluir(Agencia agencia) {
		agencia.setId(++id);

		mapa.put(agencia.getId(), agencia);
	}

	public Collection<Agencia> obterLista() {
		return mapa.values();
	}

}
