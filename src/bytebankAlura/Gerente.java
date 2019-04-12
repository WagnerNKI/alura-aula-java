package bytebankAlura;

public class Gerente extends Funcionario {

	private int senha;

	public double getBonificacao() {
		return super.salario + super.getBonificacao();
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean validacao(int senhaRecebida) {
		
		if (senhaRecebida == this.senha) {
			return true;
		}
		
		return false;
		
	}
}
