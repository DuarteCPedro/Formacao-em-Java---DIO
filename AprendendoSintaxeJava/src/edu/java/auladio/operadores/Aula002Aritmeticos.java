package edu.java.auladio.operadores;

public class Aula002Aritmeticos {

	public static void main(String[] args) {
		
		//Os operadores aritméticos são: + (adição), - (subtração), * (multiplicação) e / (divisão)
		double soma = 10.5 + 15.7;
		int subtração = 113 - 25;
		int multiplicacao = 20 * 7;
		int divisao = 15 / 3;
		int modulo = 18 % 3;
		double resultado = (10 * 7) + (20/4);

		//ATENÇÃO! O operador de adição (+), quando utilizado em variáveis do tipo texto, realizará a “concatenação de textos”.
		
		String nomeCompleto = "LINGUAGEM" + "JAVA";
				
		//Qual o resultado das expressoes abaixo?
		String concatenacao ="?"; 

		concatenacao = 1+1+1+"1"; //31

		concatenacao = 1+"1"+1+1; //1111

		concatenacao = 1+"1"+1+"1"; //1111

		concatenacao = "1"+1+1+1; //1111

		concatenacao = "1"+(1+1+1); //13
		
	}

}
