package edu.java.facul.exercicios.contabancaria;

public class TesteContaBancaria {

	public static void main(String[] args) {
		
		Endereco ender1 = new Endereco("A", "X", "Y", 32, 35930000);
		Cliente c1 = new Cliente("Joao", ender1);
		ContaBancaria cont1 = new ContaBancaria(c1,2000);
		System.out.println(cont1.toString());
		
		ContaBancaria cont2 = new ContaBancaria(new Cliente("Pedro",new Endereco("A","B","C",100,35400)),5000);
		System.out.println(cont2.toString());

	}

}
