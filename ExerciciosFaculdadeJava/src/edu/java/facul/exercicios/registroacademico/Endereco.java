package edu.java.facul.exercicios.registroacademico;

public class Endereco {

	private String cidade, rua, bairro;
	private int numero, cep;
	
	public Endereco(String cid, String r, String bair, int num, int c){
		cidade = cid;
		rua = r;
		bairro = bair;
		numero = num;
		cep = c;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}
	
	public String toString(){
		return "Cidade: " + cidade + "\n" +
			   "Rua: " + rua + "\n" +
			   "Numero: " + numero + "\n" +
			   "Bairro: " + bairro + "\n" +
			   "CEP: " + cep + "\n";
		        
	}
	
}
