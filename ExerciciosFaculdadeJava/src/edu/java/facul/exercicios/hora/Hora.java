package edu.java.facul.exercicios.hora;

public class Hora {
	private int horas, minutos, segundos;

	public Hora(int horas, int minutos, int segundos) {
		
		
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}
	
	public Hora(int horas, int minutos) {
		
		
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = 0;
	}
	
	
	public Hora(int horas) {
		
		
		this.horas = horas;
		this.minutos = 0;
		this.segundos = 0;
	}
	
	public Hora() {
		
		
		this.horas = 0;
		this.minutos = 0;
		this.segundos = 0;
	}

	
	public String imprimeDados() {
		return horas + ":" + minutos + ":" + segundos;
	}	

}