package observer;

import java.util.ArrayList;
import java.util.List;

public class Venda {
	private float valor;
	private String nomeLoja;
	private List<VendaObserver> observadores = new ArrayList<>();

	public void addObservador(VendaObserver vendaObserver) {
		observadores.add(vendaObserver);
	}

	public void finalizarVenda() {
		for (VendaObserver vendaObserver : observadores) {
			vendaObserver.reacao(this);
		}
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getNomeLoja() {
		return nomeLoja;
	}

	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}
}
