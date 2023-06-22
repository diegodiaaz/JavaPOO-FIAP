package aulasPOO.aula05.exemplosCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import aulasPOO.aula05.exercicioArrayObjeto.Usuario;

public class ExemploListaCollections {

	public static void main(String[] args) {

//		List<String> lista = new ArrayList<String>();
//		lista.add("Diegão");
//		lista.add("Camota");
//		lista.add("Vitinho");
//		lista.add("Rafael");
//		lista.add("Theylor");
//		lista.add("Hugão");
//		
//		for(String a : lista) {
//			System.out.println("Nome: " + a + "\t");
//		}

		List<Usuario> usuarios = new ArrayList<Usuario>();
		Usuario camota = new Usuario("Camotax", "vitor");
		Usuario vitinho = new Usuario("Vitinho", "camota");

		usuarios.add(vitinho);
		usuarios.add(camota);
		usuarios.add(new Usuario("Hugao", "tadurodorme"));

		for (Usuario usuario : usuarios) {
			System.out.println("Nome: " + usuario.getNome());
			System.out.println("------------------------------");
		}

		
//		listaAtualizada = test.remover("vitinho");
//		for (Usuario user : listaAtualizada) { 
//			System.out.println(user.getNome());
//		}
	}

}
