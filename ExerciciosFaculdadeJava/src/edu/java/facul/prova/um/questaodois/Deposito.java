package edu.java.facul.prova.um.questaodois;

public class Deposito {

	private int cimentoSacos; 
	private int calSacos; 
	private int areiaCaminhao; 

	public Deposito(int cimentoSacos, int calSacos, int areiaCaminhao) {
		this.cimentoSacos = cimentoSacos;
		this.calSacos = calSacos;
		this.areiaCaminhao = areiaCaminhao;
	}

	public int getCimentoSacos() {
		return cimentoSacos;
	}

	public int getCalSacos() {
		return calSacos;
	}

	public int getAreiaCaminhao() {
		return areiaCaminhao;
	}

	public void setCimentoSacos(int cimentoSacos) {
		this.cimentoSacos = cimentoSacos;
	}

	public void setCalSacos(int calSacos) {
		this.calSacos = calSacos;
	}

	public void setAreiaCaminhao(int areiaCaminhao) {
		this.areiaCaminhao = areiaCaminhao;
	}
	
}
