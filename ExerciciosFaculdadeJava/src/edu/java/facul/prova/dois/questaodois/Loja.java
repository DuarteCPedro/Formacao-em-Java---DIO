package edu.java.facul.prova.dois.questaodois;

//HERANÇA:
//Subclasse do tipo "UnidadeEmpre" que herda todos os atributos e métodos(não privados) da classe mãe
//"Extends" indica essa herança
public class Loja extends UnidadeEmpre {
    
	//Exemplo de atributo específico que só a LOJA possui
	private int numeroVendedores;

    //CONSTRUTOR DA SUBCLASSSE LOJA:
	//Chama a identificação da fabria, o atributo especifico de VENDEDORES e a referência para matriz
	public Loja(int id, int vendedores, Matriz matriz) {
		// Chama o  método do construtor da superclasse
		super(id, matriz); // Chama o construtor da superclasse
        //O atributo específico de loja é inicializado
		this.numeroVendedores = vendedores;
    }

	//IMPLEMENTAÇÃO DO METÓDO ABSTRATO:
	//A LOJA define sua própria lógica de venda
    public void venderPerfume(Perfume perfume) {
        
    	//Venda com margem de 75%
    	double precoFinal = perfume.getPreco() * 1.75;
        System.out.printf("Venda na Loja (ID: %d): Perfume '%s' vendido por R$ %.2f%n", this.identificador, perfume.getNome(), precoFinal);
        
        //A LOJA usa a referencia "matrizPrincipal" para adicionar a venda ao faturamento principal na MATRIZ
        this.matrizPrincipal.adicionarAoFaturamento(precoFinal);
    }
}