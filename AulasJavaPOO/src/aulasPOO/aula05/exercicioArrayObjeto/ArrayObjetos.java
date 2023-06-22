package aulasPOO.aula05.exercicioArrayObjeto;

import java.util.Date;

public class ArrayObjetos {

	public static void main(String[] args) {

		// Criando vetor para guardar objetos do tipo Usuario
		Usuario usuarios[] = new Usuario[2];

		
		// Criando os objetos, e guardando nas posições dentro do array
		usuarios[0] = new Usuario("Rafael", "rafacraft");
		usuarios[1] = new Usuario("Hugao", "tadurodorme");
		
		for (Usuario usuario : usuarios) {
			System.out.println("Nome: " + usuario.getNome() + "\t");
			System.out.println("Data de Cadastro:  " + usuario.getDataCadastro() + "\t");
			System.out.println(" -------------------------------- ");
		}
		
		
	}
	
	

}
