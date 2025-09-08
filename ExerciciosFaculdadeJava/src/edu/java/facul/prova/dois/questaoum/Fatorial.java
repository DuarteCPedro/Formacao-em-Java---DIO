package edu.java.facul.prova.dois.questaoum;

//HERANÇA:
//Subclasse de "SeriesMatematicas" que herda todos os atributos e métodos(não privados) da classe mãe
//"Extends" indica essa herança
public class Fatorial extends SeriesMatematicas {

    //Construtor da classe filha:
    public Fatorial(int aux) {
        super(aux); // Chama o construtor da superclasse, desse modo o atributo "n" que foi herdado é inicializado
        this.res = 1; //Incializa o resultado com 1, ja que 0! e 1! é 1
    }

    //Metodo Abstrato para calcular o Fatorial
    //Cumpre a "obrigação" de criar uma fórmula, fornecendo a lógica de calcular um fatorial
    public void calcula() {
        for (int i = 1; i <= this.n; i++) {
            this.res = this.res * i;
        }
    }
}
