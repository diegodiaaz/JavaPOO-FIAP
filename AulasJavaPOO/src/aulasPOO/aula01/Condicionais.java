package aulasPOO.aula01;

import javax.swing.JOptionPane;

public class Condicionais {

	public static void main(String[] args) {

		// Balança dos metais, considere 3 metais distintos
		// Escreva um algoritimo para exibir o mais pesado
		// Fazer com if-else encadeado
		
		double ouro, prata, bronze;
		
		ouro = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o peso do Ouro"));
		prata = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o peso da Prata"));
		bronze = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o peso do Bronze"));
		
		if (ouro > prata & ouro > bronze) {
			JOptionPane.showMessageDialog(null, "O metal mais pesado é o Ouro");
		} else if (prata > ouro & prata > bronze) {
			JOptionPane.showMessageDialog(null, "O metal mais pesado é a Prata");
		} else {
			JOptionPane.showMessageDialog(null, "O metal mais pesado é o Bronze");
		} 

	}

}
