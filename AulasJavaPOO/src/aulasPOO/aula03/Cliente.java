package aulasPOO.aula03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// javabeans ()
public class Cliente {
	
	// atributos
	private String nomeTitular, cpfTitular, rgTitular, enderecoTitular;
	private final Date dataNasc;
	
	// construtor 
	public Cliente(String nomeTitular, String cpfTitular, String rgTitular, String enderecoTitular, String dataNasc) throws ParseException {

		this.nomeTitular = nomeTitular;
		this.cpfTitular = cpfTitular;
		this.rgTitular = rgTitular;
		this.enderecoTitular = enderecoTitular;
		
		// formatação de data para inserção no objeto
		SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
		this.dataNasc = formato.parse(dataNasc);
		
		System.out.println("Objeto cliente criado");
	}
	
	
	// getters and setters (get para ler, set para escrever) para acessar as variáveis que são privadas
	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getCpfTitular() {
		return cpfTitular;
	}

	public void setCpfTitular(String cpfTitular) {
		this.cpfTitular = cpfTitular;
	}

	public String getRgTitular() {
		return rgTitular;
	}

	public void setRgTitular(String rgTitular) {
		this.rgTitular = rgTitular;
	}

	public String getEnderecoTitular() {
		return enderecoTitular;
	}

	public void setEnderecoTitular(String enderecoTitular) {
		this.enderecoTitular = enderecoTitular;
	}

	
	
	
}
