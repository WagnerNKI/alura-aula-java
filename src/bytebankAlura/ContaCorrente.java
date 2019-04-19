package bytebankAlura;

public class ContaCorrente extends Conta {

	public ContaCorrente(int numero, int agencia) {
		super(numero, agencia);
	}

	@Override
	public boolean saca(double valor) {
		
		double valorASacar = valor + 0.20;
		
		return super.saca(valorASacar);
	}
}
