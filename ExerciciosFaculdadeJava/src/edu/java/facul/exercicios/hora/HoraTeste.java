package edu.java.facul.exercicios.hora;

public class HoraTeste {

	public static void main(String[] args) {
		
		Hora h1 = new Hora(10,20,5);
		System.out.println(h1.imprimeDados());
		
		Hora h2 = new Hora(11,10);
		System.out.println(h2.imprimeDados());
		
		Hora h3 = new Hora(13);
		System.out.println(h3.imprimeDados());
		
		Hora h4 = new Hora();
		System.out.println(h4.imprimeDados());

	}

}
