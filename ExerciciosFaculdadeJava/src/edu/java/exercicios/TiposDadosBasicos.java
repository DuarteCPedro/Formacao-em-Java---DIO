package edu.java.exercicios;

public class TiposDadosBasicos {

	public static void main(String[] args) {
		
		/* JAVA POSSUI 8 TIPOS BÁSICOS DE DADOS
		
		int => Numeros inteiros => 4 bytes => EX: int idade = 30;
		
		byte => Números inteiros muito pequenos (-128 a 127) => 1 byte => EX: pessoasSala = 12;
		
		short => Números inteiros curtos => 2 bytes => EX: short ano = 2024;
		
		long => Números inteiros muito grandes => 8 bytes => EX: long populacaoMundial = 8000000000L;
		
		float => Números decimais (precisão menor que double) => 4 bytes => EX: float preco = 19.99f;
		
		double => Números com casas decimais (alta precisão) => 8 bytes => EX: double altura = 1.75;
		
		char => Um único caractere (letra, número, símbolo) => 2 bytes => EX: char inicial = 'A';
		
		boolean => Valores de verdadeiro ou falso => 1 Bit => EX: boolean estaChovendo = false; */
		
		byte a1 = 1; // 1 byte = 8 bits -2^7~2^7-1(-128~127)         
		short a2 = 10; // 2 bytes=16 bits -2^15~2^15-1         
		int a3 = 100; //4 bytes = 32 bits -2^31~2^31-1         
		long a4 = 1000; // 8 bytes = 64 bits -2^63~2^63-1         
		double b1 = 10.1151555; // 8 bytes = 64 bits         
		float b2 = 12.2f; //4 bytes = 32 bits
		char c1 = 'a'; //  2 bytes = 16 bits => char é um único caractere com aspas simples       
		boolean d1 = true; // 1 byte = 8 bits        
		boolean d2 = false; 
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(c1);
		System.out.println(d1);

	}

}
