package bytebankAlura;

public abstract class Funcionario {

	String nome;
	double salario;
	int cpf;
	double bonificacao;
	
	
	public abstract double getBonificacao();

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
