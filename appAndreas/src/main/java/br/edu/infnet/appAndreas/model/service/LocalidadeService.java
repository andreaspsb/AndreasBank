package br.edu.infnet.appAndreas.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appAndreas.client.LocalidadeClient;
import br.edu.infnet.appAndreas.model.domain.Estado;
import br.edu.infnet.appAndreas.model.domain.Municipio;

@Service
public class LocalidadeService {

	@Autowired
	private LocalidadeClient localidadeClient;

	public Collection<Estado> obterEstados() {
		return localidadeClient.obterEstados();
	}

	public Collection<Municipio> obterMunicipios(Integer uf) {
		return localidadeClient.obterMunicipios(uf);
	}
}
