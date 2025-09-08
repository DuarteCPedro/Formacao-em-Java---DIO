package edu.java.facul.prova.um.questaoum;

public class Despertador {

	//Atributos encapsulados. Um para o horario atual e outro para o horario do alarme
	private Time currentTime; 
	private Time alarmTime;   

	//Construtor com parametros, obriga dar valores a cada um dos atributos
	public Despertador(Time currentTime, Time alarmTime) {
		//This separa os atributo da classe do parametro dos metodos, meio que a função.
		this.currentTime = currentTime;
		this.alarmTime = alarmTime;
	}
		
	//Get e Set -> Possibilita ver o horario atual e do alarme (get) e alterar os dois (set)
	public Time getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(Time currentTime) {
		this.currentTime = currentTime;
	}

	public Time getAlarmTime() {
		return alarmTime;
	}

	public void setAlarmTime(Time alarmTime) {
		this.alarmTime = alarmTime;
	}
		
	//Funcao para ver se a hora atual e igual a hora do alarme dispertar, utiliza o metodo equal da classe time.
	public void notificarAlarme() {
		if (currentTime.equals(alarmTime)) {
			System.out.println("Hora de Acordar"); 
		} else {
			System.out.println("Dormir"); 
		}
	}
	
}
