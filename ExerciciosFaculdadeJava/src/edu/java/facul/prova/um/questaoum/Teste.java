package edu.java.facul.prova.um.questaoum;

public class Teste {

	public static void main(String[] args) {
		
		//Primeiro cenario -> O alarme deve tocar
		Time horaAtual1 = new Time(7, 0, 0); //Inicializa o horario atual -> 7 horas
		Time horaAlarme1 = new Time(7, 0, 0); //Inicializa o alarme -> Para 7 horas
		Despertador despertador1 = new Despertador(horaAtual1, horaAlarme1); //Cria um objeto despertador com o horario atual e do despertador
				
		System.out.println("Despertador 1 - Horário Atual: " + despertador1.getCurrentTime() + ", Horário Alarme: " + despertador1.getAlarmTime());
		despertador1.notificarAlarme(); //Verifica a saida, no caso se espera "Hora de acordar"

		System.out.println("");

		//Segundo cenario -> O alarme não deve tocar
		Time horaAtual2 = new Time(8, 30, 0); //Hora atual -> 8 horas e 30 minutos
		Time horaAlarme2 = new Time(7, 0, 0); //Alarme -> 7 horas
		Despertador despertador2 = new Despertador(horaAtual2, horaAlarme2); //Cria o despertador com horarios inicializados
				
		System.out.println("Despertador 2 - Horário Atual: " + despertador2.getCurrentTime() + ", Horário Alarme: " + despertador2.getAlarmTime());
		despertador2.notificarAlarme(); //Verifica o metodo e retorna a saida esperada -> "Dormir"

		System.out.println("");

				
				
		//Terceiro cenario -> Testando get e o set
		//Cria um horario atual com o valor zerado
		Time horaAtual3 = new Time(); 
				
		//Altera os valores do objeto time pelo set
		horaAtual3.setHours(6);
		horaAtual3.setMinutes(45);
		horaAtual3.setSeconds(0);

		//Da valores ao alarme = Valor horaAtual
		Time horaAlarme3 = new Time(6, 45, 0);

		Despertador despertador3 = new Despertador(horaAtual3, horaAlarme3); //Cria o despertador incializado, com os parametros definidos
		System.out.println("Despertador 3 - Horário Atual: " + despertador3.getCurrentTime() + ", Horário Alarme: " + despertador3.getAlarmTime());
				
		//Verifica se tem que acordar ou dormir
		despertador3.notificarAlarme(); 

		System.out.println("");

		//Quarto cenario -> Verifica se com valores muito proximos os metodos continuam funcionando
		Time horaAtual4 = new Time(10, 0, 0);
		Time horaAlarme4 = new Time(10, 0, 1);
				
		Despertador despertador4 = new Despertador(horaAtual4, horaAlarme4);
		System.out.println("Despertador 4 - Horário Atual: " + despertador4.getCurrentTime() + ", Horário Alarme: " + despertador4.getAlarmTime());
				
		despertador4.notificarAlarme();
	}
}
