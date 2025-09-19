package edu.java.facul.exercicios.carro;

public class Motor {

	private int potencia;
	private double preco;
	
	public Motor(int potencia, double preco) {
		
		this.potencia = potencia;
		this.preco = preco;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Motor [potencia=" + potencia + ", preco=" + preco + "]";
	}
	
}
