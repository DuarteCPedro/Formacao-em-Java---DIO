package edu.java.facul.exercicios.carro;

public class Pneu {

	private double preco;
	private String tipo;
	
	public Pneu(double preco, String tipo) {
		
		this.preco = preco;
		this.tipo = tipo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "pneu [preco=" + preco + ", tipo=" + tipo + "]";
	}
	
}
