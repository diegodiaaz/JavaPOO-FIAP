package aulasPOO.aula03;

import javax.swing.JOptionPane;

public class TestConta {

	public static void main(String[] args) {
		
		
		// objetos
		CDB cdb = new CDB();
		LCI lci = new LCI();
		LCA lca = new LCA();
		
		Cliente vitinho = new Cliente("Vitinho", "123456789", "123456788", "Rua x, 145");
		Cliente camotinha = new Cliente("Camotinha", "987654321", "987654321", "Rua y, 256");
		
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

		contaCamotinha.investimento(cdb, 100);
		contaCamotinha.exibirSaldo();
	}

}
