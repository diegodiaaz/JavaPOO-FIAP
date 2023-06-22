package aulasPOO.aula05.exercicioArrayObjeto;

import java.util.Date;

import java.util.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private int id;
	private String nome;
	private String email;
	private String telefone;
	private String senha;
	private Date dataCadastro;
	private List<Usuario> list = new ArrayList<Usuario>();
	
	
	public Usuario(String nome, String senha) {
		super();
		this.nome = nome;
		this.senha = senha;
		this.dataCadastro = new Date(System.currentTimeMillis());
	}
	
	// Exemplo Iterator
	public List<Usuario> remover(String nome) {
		Iterator<Usuario> iterator = list.iterator();
		while(iterator.hasNext()) {
			Usuario usuario = iterator.next();
			if (usuario.getNome() == nome) {
				iterator.remove();
			}
		}
		return list;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public Date getDataCadastro() {
		return dataCadastro;
	}


	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
		
	
}
