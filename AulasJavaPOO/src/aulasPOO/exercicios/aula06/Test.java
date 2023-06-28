package aulasPOO.exercicios.aula06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		
		// objetos tipo Usuario
		Usuario emerson = new Usuario(1, "Emerson", "123");
		Usuario vitor = new Usuario(2, "Vitor", "123");
		Usuario camila = new Usuario(3, "Camila", "123");
		Usuario hugo = new Usuario(4, "Hugo", "123");
		Usuario rafa = new Usuario(5, "Rafa", "123");
		
		// collection (lista de usuários)
		List<Usuario> listaUsuarios = new ArrayList<Usuario>();
		
		// adicionando objetos Usuario a lista de Usuario
		listaUsuarios.add(rafa);
		listaUsuarios.add(hugo);
		listaUsuarios.add(camila);
		listaUsuarios.add(vitor);
		listaUsuarios.add(emerson);
		
		// iterando a lista
		for (Usuario usuario : listaUsuarios) {
			System.out.println(usuario.getNome() + " -- " + "ID: " + usuario.getIdUsuario());
		}
		
		Collections.sort(listaUsuarios);
		
		System.out.println(" ------------------- ");
		
		// iterando a lista ordenada
		for (Usuario usuario : listaUsuarios) {
			System.out.println(usuario.getNome() + " -- " + "ID: " + usuario.getIdUsuario());
		}
		
		Map mapa = new HashMap();
		mapa.put("Emerson", emerson);
		
		Object objeto = mapa.get("Jose");
		Usuario usuario = (Usuario) objeto;
		System.out.println(usuario.getNome());
		
		
	}

}
