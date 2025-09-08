package edu.java.facul.exercicios.registroacademico;

public class RegistroAcademico {

	private String nome, numMat;
	private Data dataNasc;
	private boolean bolsa;
	private int anoMatr;
	private Endereco endereco;
	
	public RegistroAcademico(String nom, String matr, Data d, boolean bol, int ano,Endereco ender){
		nome = nom;
		numMat = matr;
		dataNasc = d;
		bolsa = bol;
		anoMatr = ano;
		endereco = ender;
	}
	
	public double calculaMensalidade(){
		double mensal = 400;
		if(bolsa)
			mensal/=2;
		return mensal;
	}
	
	public void mostrarDados(){
		System.out.println("Nome: " + nome);
		System.out.println("N�mero de matricula: " + numMat);
		System.out.println("Data de Nascimento: " + dataNasc.toString());
		if(bolsa)
		   System.out.println("O aluno � bolsista");
		else
			System.out.println("O aluno n�o � bolsista");
		System.out.println("Ano de matricula: " + anoMatr+"\n");
		System.out.println("Endere�o do aluno: "+ "\n" + endereco.toString());
	}
	
}
