package bytebankAlura;

public class Teste {

	public static void main(String[] args) {

		Conta conta1 = new Conta(5555, 595959);

		Cliente cliente1 = new Cliente();

		cliente1.setNome("Wagner");
		cliente1.setCpf(123456789);

		conta1.setTitular(cliente1);

		Conta conta2 = new Conta(4444, 595959);
		
		conta1.deposita(200.0);
		
		conta1.transfere(55.0, conta2);
		
		System.out.println("Conta 1: " + conta1.getSaldo());
		System.out.println("Conta 2: " + conta2.getSaldo());
		
		ContaPoupanca cp = new ContaPoupanca(1111, 1234);
		ContaCorrente cc = new ContaCorrente(1112, 1234);
		
		cc.deposita(100.0);
		cc.saca(50.0);
		
		System.out.println("Saldo pós saque: " + cc.getSaldo());
		
		cc.transfere(20.0, cp);
		
		System.out.println("Saldo pós tranferencia: " + cc.getSaldo());
		
		System.out.println("Quantidade de contas: " + Conta.getQuantidadeContas());
				
		Funcionario gerente = new Gerente();
		
		gerente.setSalario(5000.0);
		
		Funcionario editorVideo = new EditorVideo();
		
		editorVideo.setSalario(3000.0);
		
		System.out.println("Bonificação do gerente: " + gerente.getBonificacao());
		System.out.println("Bonificação do editor: " + editorVideo.getBonificacao());
		
	}
}
