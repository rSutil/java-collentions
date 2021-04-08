package br.com.alura;

public class TesteCursoComAluno {

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

		System.out.println("Todos os alunos do curso");
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});
		
		System.out.println("O aluno " + a1 + " está matriculado?");
		System.out.println(javaColecoes.estaMAtriculado(a1));
		
		// Aqui nesse ponto quando hash é necessário alterar o hashCode, utilizando o String.hashCode() para aproveitar o espalhamento de memória
		// e continuar performático. Caso não seja feito será utilizado o espalhamento de objeto com base na classe Object, recebendo um número aleatório
		Aluno turini = new Aluno("Rodrigo Turini", 12122);
		System.out.println("E esse Turini está cadastrado?");
		System.out.println(javaColecoes.estaMAtriculado(turini));
		
		System.out.println("O a1 é igual ao turini?");
		// Método equals também foi subscrito para considerar apenas o nome do aluno (nesse exemplo, porém poderia validar também a matricula)
		System.out.println(a1.equals(turini));
		
		System.out.println("Comparando os hashCode()");
		// lembrar sempre de implementar o hashCode na classe quando alterar o equals, pois com Array sempre funcionará, mas quando utilizar set dará erro.
		System.out.println(a1.hashCode() == turini.hashCode());

	}

}
