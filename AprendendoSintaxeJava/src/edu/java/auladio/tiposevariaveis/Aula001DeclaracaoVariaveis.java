package edu.java.auladio.tiposevariaveis;

public class Aula001DeclaracaoVariaveis {

	public static void main(String[] args) {
		
		int idade; //Tipo "int", nome "idade", com nenhum valor atribuído. 
		int anoFabricacao = 2021; //tipo "int", nome "anoFabricacao", com valor 2021.
		double salarioMinimo = 2.500; //tipo "double", nome "salarioMinimo", valor 2.500.
		
		byte idade2 = 123;
		short ano = 2021;
		int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
		long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
		float pi = 3.14F;
		double salario = 1275.33;
		
		// TiposEVariaveis.java

		short numeroCurto = 1;
		int numeroNormal = numeroCurto;
		//short numeroCurto2 = numeroNormal; *NÃO É PERMITIDO UM SHORT RECEBER UM INT MESMO QUE O INT CAIBA DENTRO DO SHORT (O JAVA NÃO CORRE RISCO)

	}

}
