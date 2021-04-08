package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListasExercicio {
	public static void main(String[] args) {
		
		String curso1 = "Java 8: Tire proveito dos novos recursos da linguagem";
        String curso2 = "Apache Camel";
        String curso3 = "Certificacao Java SE 8 Programmer I";

        ArrayList<String> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);        

        cursos.remove(1);

        cursos.forEach(curso -> {System.out.println("Curso: " + curso);});
        
        System.out.println("O primeiro curso da lista eh o: " + cursos.get(0)); // como acessar o primeiro valor?
		
        for (int i = 0; i < cursos.size(); i++) {
            System.out.println("Aula : " + cursos.get(i));
        }
        
        cursos.add(curso2); // Adicionando Curso 2 para deixar ordenado e ser o primeiro da lista
        Collections.sort(cursos); // Ordenando
        cursos.forEach(curso -> {System.out.println(curso);});
	}
}
