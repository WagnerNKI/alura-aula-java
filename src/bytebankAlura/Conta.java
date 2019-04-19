package bytebankAlura;

public class Conta {

	private int numero;
	private int agencia;
	private double saldo;
	private Cliente titular;

	private static int quantidadeContas;

	public Conta(int numero, int agencia) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 0;

		quantidadeContas += 1;
	}

	public boolean deposita(double valor) {

		if (valor >= 0) {
			this.saldo += valor;

			return true;
		}

		return false;
	}

	public boolean saca(double valor) {
		if (valor >= 0 && this.saldo >= valor) {

			this.saldo -= valor;

			return true;
		}

		return false;
	}

	public boolean transfere(double valor, Conta contaDestino) {

		if (valor > 0 && this.saldo >= valor) {

			this.saldo -= valor;

			contaDestino.deposita(valor);

			return true;
		}

		return false;
	}

	public static int getQuantidadeContas() {
		return Conta.quantidadeContas;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

}
