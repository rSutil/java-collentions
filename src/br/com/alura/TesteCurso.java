package br.com.alura;

import java.util.List;

public class TesteCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando Colecões", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Trabalhando com colecões", 24));
		
		System.out.println(javaColecoes.getAulas());

	}

}
