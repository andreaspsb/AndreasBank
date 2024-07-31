package br.edu.infnet.appAndreas;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appAndreas.model.domain.Cliente;

@Component
public class ClienteLoader implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub

		FileReader file = new FileReader("agencia.txt");
		BufferedReader leitura = new BufferedReader(file);

		String linha = leitura.readLine();
		String[] campos = null;

		while (linha != null) {
			campos = linha.split(";");

			Cliente cliente = new Cliente();
			cliente.setCpf(campos[0]);
			cliente.setNome(campos[1]);

			System.out.println("CLIENTE" + cliente);

			linha = leitura.readLine();
		}

		leitura.close();

	}

}
