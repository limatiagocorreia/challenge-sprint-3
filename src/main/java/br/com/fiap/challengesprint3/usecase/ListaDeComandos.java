package br.com.fiap.challengesprint3.usecase;

import java.util.ArrayList;
import java.util.List;

public class ListaDeComandos {
	
	private List<UseCase> comandos = new ArrayList<UseCase>();
	
	public void add(UseCase comando) {
		this.comandos.add(comando);
	}

	public void executar() {
		for(UseCase comando : comandos) {
			comando.execute();
		}
	}
}
