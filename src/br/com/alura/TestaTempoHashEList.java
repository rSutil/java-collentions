package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaTempoHashEList {

	public static void main(String[] args) {
		
		Collection<Integer> numerosHashSet = new HashSet();

        long inicioHashSet = System.currentTimeMillis();

        for (int i = 1; i <= 50000; i++) {
        	numerosHashSet.add(i);
        }

        for (Integer numero : numerosHashSet) {
        	numerosHashSet.contains(numero);
        }

        long fimHashSet = System.currentTimeMillis();

        long tempoDeExecucaoHashSet = fimHashSet - inicioHashSet;
        
        System.out.println("Tempo gasto HashSet: " + tempoDeExecucaoHashSet);
        
        Collection<Integer> numerosArrayList = new ArrayList<Integer>();

        long inicioArrayList = System.currentTimeMillis();

        for (int i = 1; i <= 50000; i++) {
            numerosArrayList.add(i);
        }

        for (Integer numero : numerosArrayList) {
            numerosArrayList.contains(numero);
        }

        long fimArrayList = System.currentTimeMillis();

        long tempoDeExecucaoArrayList = fimArrayList - inicioArrayList;

        System.out.println("Tempo gasto ArrayList: " + tempoDeExecucaoArrayList);

	}

}
