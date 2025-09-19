package edu.java.facul.exercicios.pessoaum;

public class PessoaUmTeste {

	public static void main(String[] args) {
		
		PessoaUm p = new PessoaUm("Maria", "Rua A", 40);
		System.out.println(p.imprimeDados());
		
		p.alterarNome("Maria Rita");
		p.alterarEndereco("Rua A, Numero 1");
		p.alterarIdade(39);
		p.imprimeDados();
		System.out.println(p.imprimeDados());
		
		System.out.println(p.retornarNome());

	}

}
