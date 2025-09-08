package edu.java.facul.prova.tres.questaoum;

//Classe para representar um Círculo, implementando a interface ObjetoGeometrico
public class Circulo implements ObjetoGeometrico {

	private double raio;

	// Construtor para inicializar o círculo com um raio
	public Circulo(double raio) {
		
		this.raio = raio;
	
	}

	@Override
	public void mostrarDados() {
		
		System.out.println("CIRCULO:");
		System.out.println("RAIO: " + this.raio);
	
	}

	@Override
	public double calcularArea() {
		
		// Fórmula da área: PI * r^2
		return Math.PI * this.raio * this.raio; 
	
	}

	@Override
	public double calcularPerimetro() {
		
		// Fórmula do perímetro (circunferência): 2 * PI * r
		return 2 * Math.PI * this.raio;
	
	}
}