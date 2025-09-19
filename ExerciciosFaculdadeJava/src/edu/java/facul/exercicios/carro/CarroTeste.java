package edu.java.facul.exercicios.carro;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro c1 = new Carro(new Motor(100,2000.0), new Pneu(500.0, "A"), new Banco("B", 1000.0 ));
		System.out.println(c1.toString());

	}

}
