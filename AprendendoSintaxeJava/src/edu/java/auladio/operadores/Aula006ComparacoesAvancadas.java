package edu.java.auladio.operadores;

public class Aula006ComparacoesAvancadas {

	public static void main(String[] args) {

		/* Valor e referência: Precisamos entender que em Java tudo é objeto, logo
		 * objetos diferentes podem ter as mesmas características, mas lembrando, são
		 * objetos diferentes.
		 */ 

		// ComparacaoAvancada

		String nome1 = "JAVA";
		String nome2 = "JAVA";

		System.out.println(nome1 == nome2); // true

		String nome3 = new String("JAVA");

		System.out.println(nome1 == nome3); // false

		String nome4 = nome3;

		System.out.println(nome3 == nome4); // true

		// equals na parada
		System.out.println(nome1.equals(nome2)); // ??
		System.out.println(nome2.equals(nome3)); // ??
		System.out.println(nome3.equals(nome4)); // ??

	}

}
