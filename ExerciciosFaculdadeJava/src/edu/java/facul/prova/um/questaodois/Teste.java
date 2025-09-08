package edu.java.facul.prova.um.questaodois;

public class Teste {

	public static void main(String[] args) {
		
		Deposito depositoA = new Deposito(180, 50, 5); 
		Deposito depositoB = new Deposito(30, 70, 18); 
		Deposito depositoC = new Deposito(80, 40, 3); 

		Patio umPatio = new Patio(depositoA, depositoB, depositoC);

		System.out.println("Total de Cimento no patio: " + umPatio.getTotalCimento() + " sacos");
		System.out.println("Total de Cal no patio: " + umPatio.getTotalCal() + " sacos");
		System.out.println("Total de Areia no patio: " + umPatio.getTotalAreia() + " caminhoes");

		System.out.println("");
		System.out.println("");

		
		//-----Saida de dados-----
		System.out.println("CIMENTO:");
		System.out.println("Cimento Deposito 1: " + umPatio.getDeposito1().getCimentoSacos() + " sacos.");
		System.out.println("Cimento Deposito 2:" + umPatio.getDeposito2().getCimentoSacos() + "sacos.");
		System.out.println("Cimento Deposito 3:" + umPatio.getDeposito3().getCimentoSacos() + "sacos.");
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("CAL:");
		System.out.println("Cal Deposito 1: " + umPatio.getDeposito1().getCalSacos() + " sacos");
		System.out.println("Cal Deposito 2: " + umPatio.getDeposito2().getCalSacos() + " sacos");
		System.out.println("Cal Deposito 2: " + umPatio.getDeposito3().getCalSacos() + " sacos");
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("AREIA:");
		System.out.println("Areia Deposito 1: " + umPatio.getDeposito1().getAreiaCaminhao() + " caminhoes");
		System.out.println("Areia Deposito 2: " + umPatio.getDeposito2().getAreiaCaminhao() + " caminhoes");
		System.out.println("Areia Deposito 3: " + umPatio.getDeposito3().getAreiaCaminhao() + " caminhoes");
	}
}
