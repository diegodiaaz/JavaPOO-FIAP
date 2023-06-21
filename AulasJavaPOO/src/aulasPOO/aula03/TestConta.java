package aulasPOO.aula03;

import java.text.ParseException;

public class TestConta {

	public static void main(String[] args) throws ParseException, SaldoInsuficiente {
		
		
		// objetos
		CDB cdb = new CDB();
		LCI lci = new LCI();
		LCA lca = new LCA();
		
		Cliente vitinho = new Cliente("Vitinho", "123456789", "123456788", "Rua x, 145", "28/06/1990");
		Cliente camotinha = new Cliente("Camotinha", "987654321", "987654321", "Rua y, 256", "29/07/2005");
		
		ContaCorrente contaVitinho = new ContaCorrente(vitinho, 1, 1, "teste");
		ContaCorrente contaCamotinha = new ContaCorrente(camotinha, 2, 1, "teste");
		
		
		// simulações
		contaVitinho.depositar(700);
		contaCamotinha.depositar(700);
		
		contaVitinho.exibirSaldo();
		contaCamotinha.exibirSaldo();
		
		contaVitinho.sacar(150);
		contaCamotinha.sacar(300);

		contaVitinho.exibirSaldo();
		contaCamotinha.exibirSaldo();
		
		contaVitinho.transferir(contaCamotinha, 200);

		contaVitinho.exibirSaldo();
		contaCamotinha.exibirSaldo();
		
		
		Conta.exibirContador();

		contaCamotinha.investimento(lci, 100);
		contaCamotinha.investimento(lca, 100);
		contaVitinho.investimento(cdb, 100);
		
		contaCamotinha.exibirSaldo();
		contaVitinho.exibirSaldo();
		
	}

}
