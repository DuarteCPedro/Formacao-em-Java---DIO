package edu.java.facul.prova.dois.questaodois;

	//SuperClasse Abstrata: Funciona como um "contrato para outras classes
	//A palavra "abstract" indica que a classe nao pode ser executada diretamente, ela extiste para ser herdada
	//Superclasse de uma Unidade da Empresa
	public abstract class UnidadeEmpre {
		
		//ATRIBUTOS PROTEGIDOS:
		//Protected significa que esses atributos não podem ser acessados em qualquer lugar, Só mesma classe, pacote e subclasses	
		protected int identificador; //ID único de cada unidade (ex: Loja 1, Fábrica 2).
	    protected Matriz matrizPrincipal; //Uma referência para o objeto da Matriz central.

		//Construtor da superclasse:
	    //Garante que toda unidade, ao ser criada, receba um ID e uma referência à Matriz.
	    public UnidadeEmpre(int identificador, Matriz matriz) {
	        this.identificador = identificador;
	        this.matrizPrincipal = matriz;
	    }

	    //MÉTODO ABSTRATO:
	    //Define que TODA unidade da empresa deve ter a capacidade de vender um perfume. OBRIGA CADA SUBCLASSE CRIAR ESTE MÉTODO
	    //Como cada tipo de unidade (Loja, Fábrica) venderá com um preço diferente, a implementação fica paras as subclasses
	    public abstract void venderPerfume(Perfume perfume);
	}
