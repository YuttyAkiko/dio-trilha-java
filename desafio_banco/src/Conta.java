public abstract class Conta implements IConta {
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.conta = SEQUENCIAL++;
		this.cliente = cliente;
		this.pix = definirChavePix();
	}
	
	protected int agencia;
	protected int conta;
	protected double saldo;
	protected Cliente cliente;
	private String pix;
	
	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		if(saldo >= valor) {
			this.sacar(valor);
			contaDestino.depositar(valor);
		} else {
			System.out.println("Saldo insuficiente! Não foi possível realizar a transação.");
		}
	}
	
	public void fazerPix(String chavePix, double valor, Conta contaDestino) {
		if(this.saldo < valor) {
			System.out.println("Saldo insuficiente para fazer o pix.");
			return;
		}
		
		if(!contaDestino.getChavePix().equals(chavePix)) {
			System.out.println("Chave pix inválida!");
			return;
		}
		
		this.sacar(valor);
		contaDestino.depositar(valor);
		System.out.println("Pix realizado com sucesso!");
	}

	public int getAgencia() {
		return agencia;
	}

	public int getConta() {
		return conta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public String getChavePix() {
		return pix;
	}
	
	private String definirChavePix() {
        return "yutty@email.com";
    }
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Conta: %d", this.conta));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
