package edu.java.facul.exercicios.lampada;

import java.util.Scanner;

public class LampadaTeste {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a potencia da lampada: ");
		int x = entrada.nextInt();
		
		System.out.println("Digite a voltagem da lampada: ");
		int y = entrada.nextInt();
		
		Lampada l1 = new Lampada(x,y);
		
		l1.mostrarDados();
		l1.mudarPotencia(50);
		l1.mudarVoltagem(150);
		l1.desligar();
		l1.mostrarDados();
		
		
		
		Lampada l2 = new Lampada(0,0);		
		l2.mostrarDados();
		
		
		Lampada l3 = new Lampada(100,200);
		l3.mostrarDados();

	}

}
