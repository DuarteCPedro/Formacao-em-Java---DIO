package edu.java.facul.exercicios.contabancaria;

public class Cliente {

	private String nome;
	private Endereco endereco;
	
	public Cliente(String n, Endereco ender){
		nome = n;
		endereco = ender;
	}
	
	
	
	
	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public Endereco getEndereco() {
		return endereco;
	}




	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}




	public String toString(){
		return "Nome: " + nome+  "\n" + endereco.toString() ;
	}
	
}
