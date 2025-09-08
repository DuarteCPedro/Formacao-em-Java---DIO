package edu.java.facul.prova.dois.questaoum;

//HERANÇA:
//Subclasse de "SeriesMatematicas" que herda todos os atributos e métodos(não privados) da classe mãe
//"Extends" indica essa herança
//Calcular um n-esimo numero da sequencia
public class Fibonacci extends SeriesMatematicas {

    //Construtor
    public Fibonacci(int aux) {
        super(aux); // Chama o construtor da superclasse para inicializar "n"
        this.res = 0; //Inicializa o resultado, a logica da sequência Fibonacci permite começar em 0
    }

    //Metodo Abstrato para calcular o termo da sequencia
  //Cumpre a "obrigação" de criar uma fórmula, fornecendo a lógica de calcular a sequência Fibonacci
    public void calcula() {
        if (n == 0) {
            this.res = 0;
            return;
        }
        if (n == 1) {
            this.res = 1;
            return;
        }

        // Variáveis para guardar os dois números anteriores da sequência.
        int a = 0;
        int b = 1;

        //0 e 1 acima, entao começa do 2
        for (int i = 2; i <= this.n; i++) {
            this.res = a + b;
            a = b;
            b = this.res;
        }
    }
}
