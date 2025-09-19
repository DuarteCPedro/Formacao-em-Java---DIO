package edu.java.auladio.operadores;

public class Aula004Ternarios {

	public static void main(String[] args) {
		
		/*
		 * O operador ternário é representado pelos símbolos ?: utilizados na seguinte estrutura de sintaxe:
		 * <Expressão Condicional>`` ?``<Caso condição seja true>``: ``<Caso condição seja false>
		*/
	
		//Operadores Ternarios
		int a, b;

		a = 5;
		b = 6;

		/* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
		if(a==b)
		   resultado = "verdadeiro";
		else
		   resultado = "falso";
		*/

		//MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
		String resultado = (a==b) ? "verdadeiro" : "false";

		System.out.println(resultado);
		
		//O operador ternário é aplicado para qualquer tipo de valor.
	
	}

}
