package bancoDigital;

public class Atendimento {
	public static void main(String[] args) {
		
		Cliente Andre = new Cliente();
		Andre.setNome("Andre Oliveira");
		
		Conta cc = new ContaCorrente(Andre);
		cc.depositar(100.00);
		
		
		Conta Poupanca = new ContaPoupanca(Andre);
		
		cc.transferir(58, Poupanca);
		
		cc.imprimirExtrato();
		Poupanca.imprimirExtrato();
	}

}
