package bytebankAlura;

public class Cliente {

	private int cpf;
	private String nome;

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		
		if (nome != null) {

			this.nome = nome;
		}
	}

}
