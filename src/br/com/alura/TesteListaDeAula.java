package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteListaDeAula {

	public static void main(String[] args) {
		
		Aula a1 = new Aula("Revisando as ArrayLists", 21);
		Aula a2 = new Aula("Lista de Objetos", 20);
		Aula a3 = new Aula("Relacionando listas e objetos", 15);
		
		ArrayList<Aula> aulas = new ArrayList<Aula>(); 
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
		
		aulas.sort(Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);
	}

}