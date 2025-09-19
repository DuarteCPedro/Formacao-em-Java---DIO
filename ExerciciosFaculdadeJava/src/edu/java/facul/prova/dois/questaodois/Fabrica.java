package edu.java.facul.prova.dois.questaodois;

//HERANÇA:
//Subclasse do tipo "UnidadeEmpre" que herda todos os atributos e métodos(não privados) da classe mãe
//"Extends" indica essa herança
public class Fabrica extends UnidadeEmpre {
    
	//Atributo específico que só a subclasse FABRICA possui
	private int numeroOperarios;

    //CONTRUTOR DA SUBCLASSSE FABRICA:
	//Chama a identificação da fabria, o atributo especifico de OPERARIOS e a referência para matriz
	public Fabrica(int id, int operarios, Matriz matriz) {
		
		// Chama o método construtor da superclasse
		super(id, matriz); 
        
		//O atributo especifico é incializado
		this.numeroOperarios = operarios;
    }

    //IMPLEMENTAÇÃO DO METÓDO ABSTRATO:
	//A FABRICA define sua própria lógica de venda
    public void venderPerfume(Perfume perfume) {
       
    	//Venda com margem de 50%
    	double precoFinal = perfume.getPreco() * 1.50;
        System.out.printf("Venda na Fábrica (ID: %d): Perfume '%s' vendido por R$ %.2f%n", this.identificador, perfume.getNome(), precoFinal);
        
        //A FABRICA usa a referencia "matrizPrincipal" para adicionar a venda ao faturamento principal na MATRIZ
        this.matrizPrincipal.adicionarAoFaturamento(precoFinal);
    }
}
