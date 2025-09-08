package edu.java.facul.exercicios.carro;

public class Banco {

	private String modelo;
	private double preco;
	
	public Banco(String modelo, double preco) {
		
		this.modelo = modelo;
		this.preco = preco;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Banco [modelo=" + modelo + ", preco=" + preco + "]";
	}
	
}
