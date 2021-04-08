package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteCurso2 {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando Colecões", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Trabalhando com colecões", 24));
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		
		System.out.println(aulasImutaveis);
		
		List<Aula> aulas = new ArrayList<Aula>(aulasImutaveis);
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
		System.out.println(javaColecoes.getTempoTotal());
		System.out.println(javaColecoes);
		

	}

}
