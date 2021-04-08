package br.com.alura;

public class TestaBuscaAlunosNoCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando Colecões", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Trabalhando com colecões", 24));

		Aluno a1 = new Aluno("Rodrigo Turini", 12122);
		Aluno a2 = new Aluno("Guilherme Silveira", 65789);
		Aluno a3 = new Aluno("MAuricio Aniche", 586423);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Quem é o aluno com matricula 12122?");
		Aluno aluno = javaColecoes.buscaMatriculado(12122);
		System.out.println("Aluno: " + aluno);

	}

}
