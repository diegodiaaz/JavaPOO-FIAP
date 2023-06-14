package aulasPOO.aula03;

import java.util.Date;

public abstract class Conta {

	// atributos
	protected int numeroConta, agencia;
	protected String senhaConta;
	protected Date dataAbertura;
	protected double saldo;
	protected Cliente cliente; // composição
	private static long contador;

	// construtor
	public Conta(Cliente cliente, int numeroConta, int agencia, String senhaConta) {
		this.cliente = cliente;
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.senhaConta = senhaConta;
		this.dataAbertura = new Date(System.currentTimeMillis());
		contador++;

		System.out.println("Objeto conta criado");
		System.out.println("Data de abertura da conta: " + this.dataAbertura);
	}

	// sacar
	public boolean sacar(double valor) {

		if (valor > 0) {
			if (this.saldo >= valor) {
				this.saldo -= valor;
				return true;
			}
		}
		return false;
	}

	// depositar
	public void depositar(double valor) {
		this.saldo += valor;
	}

	// transferir
	public void transferir(Conta conta, double valor) {
		boolean teste = this.sacar(valor);
		if (teste == true) {
			conta.depositar(valor);
		}
	}

	// consultar saldo
	public abstract void exibirSaldo();
	
	
	public static void exibirContador() {
		System.out.println("Contas criadas: " + contador);
	}

}
