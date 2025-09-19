package edu.java.facul.exercicios.contabancaria;

public class ContaBancaria {

	private Cliente cliente;
	private double saldo;
	
	
	public ContaBancaria(Cliente cli, double sal){
		cliente = cli;
		saldo = sal;
	}
	
	public void deposita(double valor){
		saldo += valor;
	}
	
	public void retira(double valor){
		saldo -= valor;
	}
	
	public String toString(){
		return cliente.toString() + "Saldo: " + saldo;
	}

}
