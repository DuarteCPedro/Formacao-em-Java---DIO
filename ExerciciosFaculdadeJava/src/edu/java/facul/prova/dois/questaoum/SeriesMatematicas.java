package edu.java.facul.prova.dois.questaoum;

//SuperClasse Abstrata: Funciona como um "contrato para outras classes
//A palavra "abstract" indica que a classe nao pode ser executada diretamente, ela extiste para ser herdada
public abstract class SeriesMatematicas {

	//ATRIBUTOS PROTEGIDOS:
	//Protected significa que esses atributos não podem ser acessados em qualquer lugar, Só mesma classe, pacote e subclasses	
	//Int n: Numero a ser usado no cálculo
	protected int n;
	//Int res: Guarda o resultado do cálculo
	protected int res;
	
	//Construtor da superclasse:
	//Metodo chamado quando um objeto da subcçasse é criado
	//Garante que o atributo "n" seja inicializado
	public SeriesMatematicas(int aux) {
		this.n = aux;
	}

	//Metodo Abstrato:
	//É como uma "obrigação". Quando uma classe herdar "SeriesMatematicas" ela obrigará a criar uma formula de calcular
		public abstract void calcula();
		
	//Retorno do resultado do cálculo
	//Metodo que será herdado para as subclasses retornarem o resultado	
	public int getRes() {
		return this.res;
	}
}
