package edu.java.facul.prova.dois.questaodois;

//Guarda as informações de um perfume.
//Não é uma herança, essa classe só serve como conteiner de dados para organizar as informações de um perfume = POJO
public class Perfume {
    
	//ATRIBUTOS PRIVADOS E ESPECIFICOS DE UM PERFUME:
	//O encapsulamento garante que os dados sejam acessados somente pelos métodos publicos da classe
	private int identificador;
    private String nome;
    private double preco;

    //Construtor:
    //Inicializa os atribtos do perfume quando um objeto é criado
    public Perfume(int identificador, String nome, double preco) {
        this.identificador = identificador;
        this.nome = nome;
        this.preco = preco;
    }

    //METODOS GETTERS:
    //Metodos publicos que permite que outras classses leiam os valores dos atributos de forma controlada
    public double getPreco() {
        return this.preco;
    }

    public String getNome() {
        return this.nome;
    }
}