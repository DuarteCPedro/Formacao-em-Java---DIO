package edu.java.facul.exercicios.pessoaum;

public class PessoaUm {

	private String nome, endereco;
	private int idade;
	
	public PessoaUm(String nom, String end, int id){
		nome = nom;
		endereco = end;
		idade = id;
	}
	
	public void alterarNome(String nom){
		nome = nom;
	}
		
	public void alterarEndereco(String ender){
		endereco = ender;
	}
	
	public void alterarIdade(int id){
		idade = id;
	}
	
	public String retornarNome(){
		return nome;
	}
	
	public String retornarEndereco(){
		return endereco;
	}
	
	public int retornarIdade(){
		return idade;
	}
	
	public String imprimeDados(){
		return "Nome: " + nome + "\n" + "Endereco: " + endereco + "\n" + "Idade: " + idade;
	}
	
}
