package br.com.alura;

import java.io.IOException;

import br.com.alura.client.ClientHttpConfigurantion;
import br.com.alura.service.PetService;

public class ImportarPetsDoAbrigoCommand implements Command {

	@Override
	public void execute() {
		try {
			ClientHttpConfigurantion client = new ClientHttpConfigurantion();
			PetService petService = new PetService(client);
			petService.importarPetsDoAbrigo();
		} catch (IOException | InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
