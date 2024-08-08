package br.edu.infnet.appAndreas;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appAndreas.model.domain.ContaPoupanca;

@Component
public class ContaPoupancaLoader implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub

		FileReader file = new FileReader("files/contapoupanca.txt");
		BufferedReader leitura = new BufferedReader(file);

		String linha = leitura.readLine();
		String[] campos = null;

		while (linha != null) {
			campos = linha.split(";");

			ContaPoupanca contaPoupanca = new ContaPoupanca();
			contaPoupanca.setNumero(campos[0]);
			contaPoupanca.setSaldo(Float.valueOf(campos[1]));

			System.out.println("CONTA POUPANCA" + contaPoupanca);

			linha = leitura.readLine();
		}

		leitura.close();
	}

}
