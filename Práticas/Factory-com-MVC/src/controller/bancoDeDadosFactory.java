package controller;
import model.BancoDeDados;
import model.BancoDeDadosMemoria;
import model.BancoDeDadosTexto;

public class bancoDeDadosFactory {
	public BancoDeDados getBancoDeDados(String tipo) {
		if (tipo.equals("texto")) {
			return new BancoDeDadosTexto();
		} else if (tipo.equals("memoria")) {
			return new BancoDeDadosMemoria();
		}
		return null;
	}
}
