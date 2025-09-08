package edu.java.facul.prova.um.questaoum;

public class Time {

	//Seria os atributos da classe,ou seja,as variaveis. Estao como private para serem alteradas apenas por metodos especificos
	//Essa ação se chama encapsulamento ou abstração
	private int hours;
	private int minutes;
	private int seconds;

	//Essa parte e o metodo construtor 1. Ele cria os objetos time sem valor. (metodo sem parametro)
	public Time() {
			
		//O this serve para diferenciar o atributo classe do parametro do metodo
		this.hours = 0;
		this.minutes = 0;
		this.seconds = 0;
	}

	//Essa parte e o construtor 2. Cria o objeto time de forma mais pratica. (metodo com parametro)
	public Time(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	//Serve para formatar o horario na hora da saida dos dados
	public String toString() {
		return String.format("%02d:%02d:%02d", hours, minutes, seconds);
	}

	//Get permite ler o atributo hora que esta private
	public int getHours() {
		return hours;
	}

	//Set permite alterar/atualizar o atributo hora que esta encapsulado (private)
	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	//Metodo pra comparar o time com um futuro objeto
	public boolean equals(Object obj) {
		if (this == obj) return true;
			if (obj == null || getClass() != obj.getClass()) return false;
			
		Time time = (Time) obj;
			
		return hours == time.hours && minutes == time.minutes && seconds == time.seconds;
	}
}
