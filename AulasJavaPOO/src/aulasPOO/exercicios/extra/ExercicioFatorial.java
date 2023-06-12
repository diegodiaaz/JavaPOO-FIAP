package aulasPOO.exercicios.extra;

import javax.swing.JOptionPane;

public class ExercicioFatorial {

	public static void main(String[] args) {

		float num, fatoracao = 1, a;

		num = Float.parseFloat(JOptionPane.showInputDialog("Insira o número que você deseja fatorar: "));

		for (a = 1; a <= num; a++) {
			fatoracao = fatoracao * a;
		}
		
		JOptionPane.showMessageDialog(null, String.format(" O fatorial de %.0f é:  %.0f", num, fatoracao));
		
		double b;
	}

}
