package edu.java.facul.exercicios.lampada;

public class Lampada {
	
	private int potencia;
	private int voltagem;
	private boolean ligada;
	
	public Lampada(int pot, int volt){		
		potencia = pot;
		voltagem= volt;
		ligada = true;
	}
	
	public void ligar(){
		ligada = true;
	}

	public void desligar(){
		ligada = false;
	}

	public void mudarPotencia(int p){
		potencia = p;
	}

	public void mudarVoltagem(int v){
		voltagem = v;
	}

	public void mostrarDados(){
		System.out.println("Potencia: " + potencia);
		System.out.println("Voltagem: " + voltagem);
		System.out.println("Estado: " + ligada + "\n");
	
	}
}
