package edu.java.facul.prova.tres.questaoum;

//Classe principal para testar as funcionalidades das formas geométricas
public class Teste {

	public static void main(String[] args) {

		// 1. Testando a classe Circulo
		Circulo meuCirculo = new Circulo(5.0);
		
		meuCirculo.mostrarDados();
		
		System.out.println("Área: " + meuCirculo.calcularArea());
		System.out.println("Perímetro: " + meuCirculo.calcularPerimetro());
		
		System.out.println("\n"); // Adiciona uma linha em branco para separar

		// 2. Testando a classe Retangulo
		Retangulo meuRetangulo = new Retangulo(10.0, 4.0);
		
		meuRetangulo.mostrarDados();
		
		System.out.println("Área: " + meuRetangulo.calcularArea());
		System.out.println("Perímetro: " + meuRetangulo.calcularPerimetro());
		
		System.out.println("\n");

		// 3. Testando a classe Triangulo (usando um triângulo retângulo como exemplo)
		Triangulo meuTriangulo = new Triangulo(3.0, 4.0, 5.0);
		
		meuTriangulo.mostrarDados();
		
		System.out.println("Área: " + meuTriangulo.calcularArea());
		System.out.println("Perímetro: " + meuTriangulo.calcularPerimetro());
		
	}
}
