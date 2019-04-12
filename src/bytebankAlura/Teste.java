package bytebankAlura;

public class Teste {

	public static void main(String[] args) {

		Conta conta1 = new Conta(5555, 595959);

		Cliente cliente1 = new Cliente();

		cliente1.setNome("Wagner");
		cliente1.setCpf(123456789);

		conta1.setTitular(cliente1);

		Conta conta2 = new Conta(4444, 595959);

		System.out.println("Quantidade de contas: " + Conta.getQuantidadeContas());

		Funcionario funcionario = new Funcionario();
		
		funcionario.setSalario(2000.0);
		
		Funcionario gerente = new Gerente();
		
		gerente.setSalario(5000.0);
		
		Funcionario editorVideo = new EditorVideo();
		
		editorVideo.setSalario(3000.0);
		
		System.out.println(funcionario.getBonificacao());
		System.out.println(gerente.getBonificacao());
		System.out.println(editorVideo.getBonificacao());
		
	}
}
