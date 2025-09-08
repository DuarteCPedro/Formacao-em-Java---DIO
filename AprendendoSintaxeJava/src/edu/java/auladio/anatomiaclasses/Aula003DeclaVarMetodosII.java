package edu.java.auladio.anatomiaclasses;

public class Aula003DeclaVarMetodosII {

	public static void main(String[] args) {
		
		String pNome = "Pedro Henrique";
		String sNome = "Duarte Coelho";
		String nCompleto = nomeCompleto (pNome, sNome);
		
		System.out.println(nCompleto);		

	}

	public static String nomeCompleto (String primeiroNome, String segundoNome) {
		return "Resultado do metodo e: " + primeiroNome.concat(" ").concat(segundoNome);
	}
}