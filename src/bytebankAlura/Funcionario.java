package bytebankAlura;

public class Funcionario {

	String nome;
	double salario;
	int cpf;
	double bonificacao;
	
	
	public double getBonificacao() {
		return salario*0.1;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	
}
