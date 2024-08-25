package br.edu.infnet.appAndreas.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appAndreas.model.domain.TipoOperacao;
import br.edu.infnet.appAndreas.repository.TipoOperacaoRepository;

@Service
public class TipoOperacaoService {

	@Autowired
	private TipoOperacaoRepository tipoOperacaoRepository;

	public void incluir(TipoOperacao tipoOperacao) {
		tipoOperacaoRepository.save(tipoOperacao);
	}

	public Iterable<TipoOperacao> obterLista() {
		return tipoOperacaoRepository.findAll();
	}

	public TipoOperacao obterPorId(Integer id) {
		return tipoOperacaoRepository.findById(id).orElse(null);
	}

	public void excluir(Integer id) {
		tipoOperacaoRepository.deleteById(id);
	}

	public long obterQtde() {
		return tipoOperacaoRepository.count();
	}
}
