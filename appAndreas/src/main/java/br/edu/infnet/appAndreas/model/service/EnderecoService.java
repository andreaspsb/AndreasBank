package br.edu.infnet.appAndreas.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appAndreas.client.EnderecoClient;
import br.edu.infnet.appAndreas.model.domain.Endereco;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoClient enderecoClient;

	public Endereco obterPorCep(String cep) {
		return enderecoClient.findByCep(cep);
	}
}
