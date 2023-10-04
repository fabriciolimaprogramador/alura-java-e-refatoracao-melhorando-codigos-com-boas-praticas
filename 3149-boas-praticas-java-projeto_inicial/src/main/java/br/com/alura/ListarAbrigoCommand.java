package br.com.alura;

import java.io.IOException;

import br.com.alura.client.ClientHttpConfigurantion;
import br.com.alura.service.AbrigoService;

public class ListarAbrigoCommand implements Command {

	@Override
	public void execute() {
		try {
			ClientHttpConfigurantion client = new ClientHttpConfigurantion();
			AbrigoService abrigoService = new AbrigoService(client);
			abrigoService.listarAbrigosCadastrados();
		} catch (IOException | InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
