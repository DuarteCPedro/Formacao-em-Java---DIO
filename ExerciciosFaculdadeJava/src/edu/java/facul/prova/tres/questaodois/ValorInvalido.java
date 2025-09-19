package edu.java.facul.prova.tres.questaodois;

//Exceção para representar a tentativa de usar um valor monetário inválido (negativo ou nulo).
public class ValorInvalido extends Exception {

	// Construtor que recebe uma mensagem de erro específica.
	public ValorInvalido(String mensagem) {
		
		// A palavra 'super' chama o construtor da classe pai (Exception),
		// passando a mensagem de erro para ela.
		super(mensagem);
 
	}
}