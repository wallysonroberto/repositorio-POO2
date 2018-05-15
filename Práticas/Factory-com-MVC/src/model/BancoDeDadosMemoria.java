package model;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDadosMemoria implements BancoDeDados{
	private List<String> desenhos = new ArrayList<String>();

	public BancoDeDadosMemoria() {
		desenhos.add("Naruto");
		desenhos.add("One Piece");
		desenhos.add("Swoard art online");
	}

	

	@Override
	public void exibirDesenho() {
		System.out.println("\nDesenhos - bdMemoria");
		desenhos.forEach(System.out::println);
		
	}
}
