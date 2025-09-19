package edu.java.facul.exercicios.carro;

public class Carro {

	private Motor motor;
	private Pneu pneus;
	private Banco bancos;
	
	public Carro(Motor motor, Pneu pneus, Banco bancos) {
		
		this.motor = motor;
		this.pneus = pneus;
		this.bancos = bancos;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Pneu getPneus() {
		return pneus;
	}

	public void setPneus(Pneu pneus) {
		this.pneus = pneus;
	}

	public Banco getBancos() {
		return bancos;
	}

	public void setBancos(Banco bancos) {
		this.bancos = bancos;
	}

	@Override
	public String toString() {
		return "Carro [motor=" + motor + ", pneus=" + pneus + ", bancos=" + bancos + "]" + "\n" + "Pre�o Total: " + precoCarro();
	}
	
	public double precoCarro(){
		return motor.getPreco() + 4 * pneus.getPreco() + 3 * bancos.getPreco();
	}
	
}
