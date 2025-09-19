package edu.java.facul.prova.dois.questaoum;

public class Teste {

	public static void main(String[] args) {
		
		//DECLARAÇÃO POLIMÓRFICA:
		//A variável "serie" é declarada com o tipo da superclasse "SeriesMatematicas"
		//Tornando "serie" uma referência para "apontar" para qualquer objeto das subclasses
		SeriesMatematicas serie;
		
		//Teste Fatorial
        System.out.println("Fatorial");
        
        //Polimorfismo:
        //A variavel "serie" recebe um objeto do tipo "fatorial", "serie" esta assumindo a forma  de um "Fatorial"
        int numeroFatorial = 4;
        serie = new Fatorial(numeroFatorial);
        
        //Chama o método calcula a partir de "serie", desse modo a classe "serie" aponta pro metodo da subclasse "Fatorial"
        serie.calcula();
        
        //Imprime o resultado
        System.out.println("O fatorial de " + numeroFatorial + " e: " + serie.getRes());
        System.out.println();

        //Teste Fibonacci
        System.out.println("Fibonacci");
        
        //Polimorfismo:
        //A variavel "serie" recebe um objeto do tipo "fibonacci", "serie" esta assumindo a forma  de um "fibonacci"
        int numeroFibonacci = 11;
        serie = new Fibonacci(numeroFibonacci); 

        //Chama o método calcula a partir de "serie", desse modo a classe "serie" aponta pro metodo da subclasse "fibonacci"
        serie.calcula();
        
        //Imprime o resultado
        System.out.println("O " + numeroFibonacci + " numeri de Fibonacci e: " + serie.getRes());

	}

}
