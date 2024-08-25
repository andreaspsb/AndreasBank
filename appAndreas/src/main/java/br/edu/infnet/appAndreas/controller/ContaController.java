package br.edu.infnet.appAndreas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.appAndreas.model.domain.Conta;
import br.edu.infnet.appAndreas.model.service.ContaService;

@RestController
public class ContaController {

	@Autowired
	private ContaService contaService;

	@GetMapping(value = "conta/listar")
	public Iterable<Conta> obterLista() {
		return contaService.obterLista();
	}

}
