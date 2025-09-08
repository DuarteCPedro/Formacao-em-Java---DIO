package edu.java.facul.prova.tres.questaodois;

	//Exceção para representar a falta de saldo ao tentar realizar um saque.
	public class SaldoInsuficiente extends Exception {

		// Construtor que recebe a mensagem de erro.
		public SaldoInsuficiente(String mensagem) {
			
			super(mensagem);
		
		}
}