package bytebankAlura;

public class Conta {

	private int numero;
	private int agencia;
	private double saldo;
	private Cliente titular;
	
	private static int quantidadeContas;
	
	public Conta (int numero, int agencia) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 0;
		
		this.saldo += 100;
		
		quantidadeContas += 1;
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
