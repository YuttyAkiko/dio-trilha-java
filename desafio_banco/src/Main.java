public class Main {
	public static void main(String[] args) {
		Cliente Yutty = new Cliente();
		Yutty.setNome("Yutty");
		
		Conta Cc = new ContaCorrente(Yutty);
		Conta poupanca = new ContaPoupanca(Yutty);
		
		Cc.depositar(10000);
		Cc.transferir(250, poupanca);
		
		Cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		Cc.fazerPix(poupanca.getChavePix(), 250, poupanca);
		Cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
