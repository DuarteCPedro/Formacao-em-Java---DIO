package edu.java.auladio.metodos.exercicio;

public class Usuario {

	public static void main(String[] args) {
		
		SmartTv smartTv = new SmartTv();
		
		System.out.println("TV ligada? " + smartTv.ligada );
		System.out.println("Canal Atual: " + smartTv.canal);
		System.out.println("Volume Atual: " + smartTv.volume);
		
		smartTv.ligar();
		smartTv.aumentarCanal();
		smartTv.aumentarCanal();
		smartTv.aumentarCanal();
		smartTv.aumentarCanal();
		smartTv.aumentarCanal();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		
		
		System.out.println("Novo I -> TV ligada? " + smartTv.ligada);
		System.out.println("Novo I -> Canal Atual: " + smartTv.canal);
		System.out.println("Novo I -> Volume Atual: " + smartTv.volume);
		
		smartTv.desligar();
		smartTv.diminuirCanal();
		smartTv.diminuirVolume();
		
		
		System.out.println("Novo II -> TV ligada? " + smartTv.ligada);
		System.out.println("Novo II -> Canal Atual: " + smartTv.canal);
		System.out.println("Novo II -> Volume Atual: " + smartTv.volume);
		
		smartTv.ligar();
		smartTv.mudarCanal(100);
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		
		System.out.println("Novo III -> TV ligada? " + smartTv.ligada);
		System.out.println("Novo III -> Canal Atual: " + smartTv.canal);
		System.out.println("Novo III -> Volume Atual: " + smartTv.volume);
	
	}
}
