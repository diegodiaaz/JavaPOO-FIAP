package aulasPOO.aula05;

public class InicializacaoArrays {

	public static void main(String[] args) {

		int[] x = new int[10];
		lerVetor(x);
		imprimirVetor(x);

	}
	
	// Método para atribuir valores às posições do array
	public static void lerVetor(int[] x) {
		for (int i = 0; i < x.length; i++) {
			x[i] = 2 * i;
		}
	}
	
	// Método para imprimir os dados do array
	public static void imprimirVetor(int[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i] + "\t");
		}
	}

}
