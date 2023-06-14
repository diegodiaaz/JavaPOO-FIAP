package aulasPOO.aula03;

import javax.swing.JOptionPane;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente, int numeroConta, int agencia, String senhaConta) {
		super(cliente, numeroConta, agencia, senhaConta);

		System.out.println("CONTA CORRENTE CRIADA");

	}

	private double saldoInvestimento;

	@Override
	public void exibirSaldo() {

		double saldoTotal = this.saldo + this.saldoInvestimento;
		System.out.println("Cliente: " + this.cliente.getNomeTitular());
		System.out.println("Data de Abertura da conta: " + this.dataAbertura);
		System.out.println("Saldo conta corrente: R$" + this.saldo);
		System.out.println("Saldo investimento: R$" + this.saldoInvestimento);
		System.out.println("Saldo total: R$" + saldoTotal + "\n");

	}

	// design pattern strategy
	public void investimento(Produto produto, double valor) {

		boolean teste = this.sacar(valor);
		if (teste == true) {
			this.saldoInvestimento += produto.investir(valor);
		}

	}
}
