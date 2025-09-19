package edu.java.facul.exercicios.pessoadois;

public class PessoaDoisTeste {

	public static void main(String[] args) {
		
		PessoaDois p = new PessoaDois("Maria", "Rua A", 40);
		System.out.println(p.imprimeDados());
		
		p.setNome("Maria Rita");
		p.setEndereco("Rua A, Numero 1");
		p.setIdade(39);		
		System.out.println(p.imprimeDados());
		
		System.out.println(p.getNome());
		System.out.println(p.getEndereco());
		System.out.println(p.getIdade());

	}

}
