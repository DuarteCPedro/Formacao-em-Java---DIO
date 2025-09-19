package edu.java.facul.prova.tres.questaodois;

//Classe principal para testar a ContaCorrente e o tratamento de suas exceções.
public class TesteContaCorrente {

	public static void main(String[] args) {
		
		//Cria uma nova conta corrente com saldo inicial de R$ 500,00.
		
		ContaCorrente minhaConta = new ContaCorrente(500.0f);
		
		System.out.println("Conta criada. Saldo inicial: R$" + minhaConta.getSaldo());
		System.out.println("---------------------------------------------");

		//Teste 1: Operação de depósito válida
		try {
			
			System.out.println("Tentando depositar R$200,00");
			
			minhaConta.depositar(200.0f);
		
		} catch (ValorInvalido e) {
			
			System.out.println("Erro capturado: " + e.getMessage());
		
		}
		
		System.out.println("Saldo atual: R$" + minhaConta.getSaldo());
		System.out.println("---------------------------------------------");


		//Teste 2: Forçando uma ValorInvalidoException no depósito  
		try {
			
			System.out.println("Tentando depositar R$-100,00");
			
			minhaConta.depositar(-100.0f); // Este valor causará a exceção
		
		} catch (ValorInvalido e) {
			
			// O bloco 'catch' captura a exceção e a trata de forma adequada.
			System.out.println("Erro capturado: " + e.getMessage());
		
		}
		
		System.out.println("Saldo atual: R$" + minhaConta.getSaldo());
		System.out.println("---------------------------------------------");


		//Teste 3: Forçando uma SaldoInsuficienteException no saque
		try {
			
			System.out.println("Tentando sacar R$1000,00");
			
			minhaConta.sacar(1000.0f); // Saldo é 700, então isso causará a exceção
		
		} catch (ValorInvalido | SaldoInsuficiente e) {
			
			// Podemos capturar mais de uma exceção no mesmo bloco catch.
			System.out.println("Erro capturado: " + e.getMessage());
		
		}
		
		System.out.println("Saldo atual: R$" + minhaConta.getSaldo());
		System.out.println("---------------------------------------------");


		//Teste 4: Operação de saque válida
		try {
			
			System.out.println("Tentando sacar R$300,00");
			minhaConta.sacar(300.0f);
		
		} catch (ValorInvalido | SaldoInsuficiente e) {
			
			System.out.println("Erro capturado: " + e.getMessage());
		
		}
		
		System.out.println("Saldo final: R$" + minhaConta.getSaldo());
		System.out.println("---------------------------------------------");
	}
}