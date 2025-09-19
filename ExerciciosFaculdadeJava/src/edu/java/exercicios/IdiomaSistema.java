package edu.java.exercicios;

import java.util.Locale;

public class IdiomaSistema {

	public static void main(String[] args) {
		
		Locale idioma = Locale.getDefault();
		
		String lingua = idioma.getLanguage();
		
		if (lingua == "pt") {
			
			System.out.println("O seu sistema esta no idioma em portugues.");
		
		}else {
			
			System.out.println("O seu sistema nao esta em portugues.");
			
		}

	}

}
