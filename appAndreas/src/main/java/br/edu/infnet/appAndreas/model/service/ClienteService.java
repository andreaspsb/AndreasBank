package br.edu.infnet.appAndreas.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appAndreas.model.domain.Cliente;

@Service
public class ClienteService {

	Map<Integer, Cliente> mapa = new HashMap<Integer, Cliente>();
	Integer id = 0;

	public void incluir(Cliente cliente) {
		cliente.setId(++id);

		mapa.put(cliente.getId(), cliente);
	}

	public Collection<Cliente> obterLista() {
		return mapa.values();
	}

}
