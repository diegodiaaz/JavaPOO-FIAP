package aulasPOO.exercicios.aula06;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListVersusLinkedListPerformance {

	public static void main(String[] args) {

		Collection<Long> lista = new ArrayList<Long>();

		long inicio = System.currentTimeMillis();

		for (long i = 0; i <= 1000000; i++) {
			lista.add(i);
		}

		long fim = System.currentTimeMillis();

		long tempoGasto = fim - inicio;

		System.out.println("O tempo gasto para a execução do programa foi de: " + tempoGasto + "ms");

	}

}
