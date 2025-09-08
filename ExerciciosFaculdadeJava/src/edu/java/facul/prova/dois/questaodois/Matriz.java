package edu.java.facul.prova.dois.questaodois;

//HERANÇA:
//Subclasse do tipo "UnidadeEmpre" que herda todos os atributos e métodos(não privados) da classe mãe
//"Extends" indica essa herança
public class Matriz extends UnidadeEmpre {
	
	//ATRIBUTOS ESPECÍFICOS, só "matriz" possui
	private String quimicoResponsavel;
    private double faturamentoAnual;
    
    //CONSTRUTOR DA MATRIZ:
    public Matriz(int id, String quimico) {
        
    	//Chama o construtor da superclasse
    	//Como a MATRIZ é a própria matroz, passei "null" incialmente.
    	super(id, null); 
        //A referência para mtriz é ela mesma,isso permite que ela funcione como qualquer outra unidade
    	//MAS PERMITE TAMBÉM ela armazenar o faturamento
    	this.matrizPrincipal = this;
        //Inicializa os atributos específicos da Matriz
    	this.quimicoResponsavel = quimico;
        this.faturamentoAnual = 0.0;
    }

    //METODO PARA CENTRALIZAR O FATURAMENTO
    //Permite qualquer unidade chamar o método através da referência "matriPrincipal"
    public void adicionarAoFaturamento(double valorVenda) {
        this.faturamentoAnual += valorVenda;
    }

    //METODO PARA CONSULTAR O FATURAMENTO TOTAL "get" (metodo de acesso)
    public double getFaturamentoAnual() {
        return this.faturamentoAnual;
    }

    //IMPLEMENTAÇÃO DO MÉTODO ABSTRATO:
    //Cumpre a "obrigação" de criar uma função para vender o produto, fornecendo a própria lógica de venda
    public void venderPerfume(Perfume perfume) {
        
    	//Venda com margem de 50%
    	double precoFinal = perfume.getPreco() * 1.50;
        System.out.printf("Venda na Matriz (ID: %d): Perfume '%s' vendido por R$ %.2f%n", this.identificador, perfume.getNome(), precoFinal);
        
        //A própria matriz adiciona o valor ao seu faturamento
        this.adicionarAoFaturamento(precoFinal);
    }
}
