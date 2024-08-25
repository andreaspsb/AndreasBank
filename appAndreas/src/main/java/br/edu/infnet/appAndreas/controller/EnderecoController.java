package br.edu.infnet.appAndreas.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.appAndreas.model.domain.Endereco;
import br.edu.infnet.appAndreas.model.domain.Estado;
import br.edu.infnet.appAndreas.model.domain.Municipio;
import br.edu.infnet.appAndreas.model.service.EnderecoService;
import br.edu.infnet.appAndreas.model.service.LocalidadeService;

@RestController
public class EnderecoController {

	@Autowired
	private EnderecoService enderecoService;

	@Autowired
	private LocalidadeService localidadeService;

	@GetMapping(value = "/endereco/{cep}")
	public Endereco findByCep(@PathVariable String cep) {
		return enderecoService.obterPorCep(cep);
	}

	@GetMapping(value = "/estados")
	public Collection<Estado> obterEstados() {
		return localidadeService.obterEstados();
	}

	@GetMapping(value = "/municipios/{uf}")
	public Collection<Municipio> obterMunicipios(@PathVariable Integer uf) {
		return localidadeService.obterMunicipios(uf);
	}

}
