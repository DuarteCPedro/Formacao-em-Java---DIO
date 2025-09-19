package edu.java.facul.prova.tres.questaodois;

//Classe que representa uma Conta Corrente.
public class ContaCorrente {

	// Atributo para armazenar o saldo da conta
	private float saldo;

	// Construtor para inicializar a conta com um saldo inicial.
	public ContaCorrente(float saldoInicial) {
		
		this.saldo = saldoInicial;
	
	}

	// Método para consultar o saldo atual.
	public float getSaldo() {
		
		return this.saldo;
	
	}

	
	//Método para adicionar um valor ao saldo.
	//throws ValorInvalido se o valor for negativo ou zero. 
	public void depositar(float valor) throws ValorInvalido {
		
		// Validação: Não se pode depositar um valor negativo ou nulo
		if (valor <= 0) {
			
			// Lança a nossa exceção customizada com uma mensagem clara
			throw new ValorInvalido("O valor do depósito deve ser maior que zero.");
		
		}
		
		this.saldo += valor;
		System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
	}

	
	//Método para retirar um valor do saldo.	
	//throws ValorInvalido se o valor for negativo ou zero.
	//throws SaldoInsuficiente se o saldo for menor que o valor do saque.
	public void sacar(float valor) throws ValorInvalido, SaldoInsuficiente {
		
		// Validação 1: Não se pode sacar um valor negativo ou nulo
		if (valor <= 0) {
			
			throw new ValorInvalido("O valor do saque deve ser maior que zero.");
		
		}
		
		// Validação 2: Não se pode sacar um valor maior que o saldo
		if (valor > this.saldo) {
			
			throw new SaldoInsuficiente("Saldo insuficiente. Saldo atual: R$" + this.saldo);
		
		}
		
		this.saldo -= valor;
		System.out.println("Saque de R$" + valor + " realizado com sucesso.");
	}
}
