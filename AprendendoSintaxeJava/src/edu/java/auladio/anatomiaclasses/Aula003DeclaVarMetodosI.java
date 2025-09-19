package edu.java.auladio.anatomiaclasses;

public class Aula003DeclaVarMetodosI {
	
	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = 7;
		int resul = somar (num1, num2);
		
		System.out.println("O resultado e: " + resul);

	}

	public static int somar (int a, int b) {
		return a + b;
	}
	
}
