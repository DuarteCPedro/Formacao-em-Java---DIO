package edu.java.facul.prova.um.questaodois;

public class Patio {

	private Deposito deposito1; 
	private Deposito deposito2; 
	private Deposito deposito3; 

	public Patio(Deposito deposito1, Deposito deposito2, Deposito deposito3) {
		this.deposito1 = deposito1;
		this.deposito2 = deposito2;
		this.deposito3 = deposito3;
	}

	public int getTotalCimento() {
		return deposito1.getCimentoSacos() + deposito2.getCimentoSacos() + deposito3.getCimentoSacos();
	}


	public int getTotalCal() {
		return deposito1.getCalSacos() + deposito2.getCalSacos() + deposito3.getCalSacos();
	}


	public int getTotalAreia() {
		return deposito1.getAreiaCaminhao() + deposito2.getAreiaCaminhao() + deposito3.getAreiaCaminhao();
	}

	public Deposito getDeposito1() {
		return deposito1;
	}

	public Deposito getDeposito2() {
		return deposito2;
	}

	public Deposito getDeposito3() {
		return deposito3;
	}
	
}
