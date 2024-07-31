package br.edu.infnet.appAndreas;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appAndreas.model.domain.Agencia;

@Component
public class AgenciaLoader implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub

		FileReader file = new FileReader("agencia.txt");
		BufferedReader leitura = new BufferedReader(file);

		String linha = leitura.readLine();
		String[] campos = null;

		while (linha != null) {
			campos = linha.split(";");

			Agencia agencia = new Agencia();
			agencia.setCodigo(campos[0]);
			agencia.setNome(campos[1]);

			System.out.println("AGENCIA" + agencia);

			linha = leitura.readLine();
		}

		leitura.close();
	}

}
