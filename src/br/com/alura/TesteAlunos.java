package br.com.alura;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class TesteAlunos {

	public static void main(String[] args) {
		
		Collection<String> alunos = new HashSet<>();
		alunos.add("Ricardo Sutil");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aninche");
		
		System.out.println(alunos);
		alunos.remove("Ricardo Sutil");
		
		
		System.out.println(alunos.size());
		alunos.add("Nico Steppat");
		System.out.println(alunos.size());		
		
	}

}
