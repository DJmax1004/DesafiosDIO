
public class Main {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setNome("David Santos");
		
		Conta cc = new ContaCorrente(cliente);
		cc.depositar(200);
		
		Conta poupanca = new ContaPoupanca(cliente);

		cc.transferir(100, poupanca);
		cc.sacar(50);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
