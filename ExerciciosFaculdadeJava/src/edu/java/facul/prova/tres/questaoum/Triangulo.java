package edu.java.facul.prova.tres.questaoum;

//Classe para representar um Triângulo, implementando a interface ObjetoGeometrico
public class Triangulo implements ObjetoGeometrico {

	private double ladoA;
	private double ladoB;
	private double ladoC;

	// Construtor para inicializar o triângulo com seus três lados
	public Triangulo(double ladoA, double ladoB, double ladoC) {
		
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	
	}

	@Override
	public void mostrarDados() {
		
		System.out.println("TRIANGULO:");
		System.out.println("LADOS: " + this.ladoA + ", " + this.ladoB + ", " + this.ladoC);
	
	}

	@Override
	public double calcularArea() {
		
		// Utiliza a Fórmula de Herão para calcular a área
		double semiperimetro = calcularPerimetro() / 2;
		return Math.sqrt(semiperimetro * (semiperimetro - this.ladoA) * (semiperimetro - this.ladoB) * (semiperimetro - this.ladoC)); 
	
	}

	@Override
	public double calcularPerimetro() {
		
		// O perímetro é a soma dos três lados
		return this.ladoA + this.ladoB + this.ladoC; 
	
	}
}