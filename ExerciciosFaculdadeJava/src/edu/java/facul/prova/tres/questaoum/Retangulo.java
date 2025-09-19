package edu.java.facul.prova.tres.questaoum;

//Classe para representar um Retângulo, implementando a interface ObjetoGeometrico
public class Retangulo implements ObjetoGeometrico {

	private double base;
	private double altura;

	// Construtor para inicializar o retângulo com base e altura
	public Retangulo(double base, double altura) {
		
		this.base = base;
		this.altura = altura;
	
	}

	@Override
	public void mostrarDados() {
		
		System.out.println("RETANGULO:");
		System.out.println("BASE: " + this.base);
		System.out.println("ALTURA: " + this.altura);
	
	}

	@Override
	public double calcularArea() {
		
		// Fórmula da área: base * altura
		return this.base * this.altura; 
	
	}

	@Override
	public double calcularPerimetro() {
		
		// Fórmula do perímetro: 2 * base + 2 * altura
		return 2 * this.base + 2 * this.altura; 
	
	}
}
