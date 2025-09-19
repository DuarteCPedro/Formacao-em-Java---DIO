package edu.java.facul.prova.dois.questaodois;

//Classe para testar a interação entre os objetos
public class Teste{

    public static void main(String[] args) {
        
    	//Criação dos objetos:
    	//Poderia ser possivel implementar uma estrutura de repetição para criar uma quantidade especifica de objetos de cada classe
    	//Cria o objeto central, a Matriz:
    	Matriz matrizCentral = new Matriz(123, "Joaozinho");

    	//Cria as fábricas, passando a referência da 'matrizCentral' para elas:
        Fabrica fabrica01 = new Fabrica(1, 50, matrizCentral);
        Fabrica fabrica02 = new Fabrica(2, 50, matrizCentral);

        //Cria as lojas, também passando a referência da 'matrizCentral':
        Loja loja01 = new Loja(1, 5, matrizCentral);
        Loja loja02 = new Loja(2, 5, matrizCentral);
        Loja loja03 = new Loja(3, 5, matrizCentral);

        //Cria os produtos, esses não usam as referências da matriz:
        Perfume perfumeA = new Perfume(1, "Perfume A", 100.00);
        Perfume perfumeB = new Perfume(2, "Perfume B", 110.00);

        //SAÍDA DE DADOS:
        System.out.println("FATURAMENTO INICIAL");
        System.out.printf("Faturamento total: R$ %.2f%n%n", matrizCentral.getFaturamentoAnual());

        System.out.println("VENDENDO");
        matrizCentral.venderPerfume(perfumeA);
        fabrica01.venderPerfume(perfumeA);
        fabrica02.venderPerfume(perfumeB);
        loja01.venderPerfume(perfumeA);
        loja02.venderPerfume(perfumeA);
        loja03.venderPerfume(perfumeB);

        System.out.println("FATURAMENTO FINAL");
        System.out.printf("Faturamento total: R$ %.2f%n", matrizCentral.getFaturamentoAnual());
    }
}
