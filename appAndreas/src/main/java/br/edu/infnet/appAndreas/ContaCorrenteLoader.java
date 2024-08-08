package br.edu.infnet.appAndreas;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appAndreas.model.domain.ContaCorrente;

@Component
public class ContaCorrenteLoader implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub

		FileReader file = new FileReader("files/contacorrente.txt");
		BufferedReader leitura = new BufferedReader(file);

		String linha = leitura.readLine();
		String[] campos = null;

		while (linha != null) {
			campos = linha.split(";");

			ContaCorrente contaCorrente = new ContaCorrente();
			contaCorrente.setNumero(campos[0]);
			contaCorrente.setSaldo(Float.valueOf(campos[1]));

			System.out.println("CONTA CORRENTE" + contaCorrente);

			linha = leitura.readLine();
		}

		leitura.close();
	}

}
