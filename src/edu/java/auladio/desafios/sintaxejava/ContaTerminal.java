package edu.java.auladio.desafios.sintaxejava;

import java.util.Locale;
import java.util.Scanner;

/**
 * A ContaTerminal apenas recebe as informações do usuário de uma conta bancária
 * e organiza essas informações em uma frase
 * <p>
 * <b>Note:</b> Leia atentamente a documentação desta classes para desfrutar dos
 * recursos oferecidos pelo autor
 *
 * @author Pedro Henrique
 * @version 1.0
 * @since 19/09/2025
 */

public class ContaTerminal {

	public static void main(String[] args) {
		// TODO: Conhecer e importar a classe Scanner 
		
		//Exibir as mensagens para nosso usuário 
		
		//Obter pela Scanner os valores digitados pelo terminal 
		
		//Exibir a mensagem final

		Scanner entrada = new Scanner (System.in).useLocale(Locale.US);
		
		int numeroConta;
		String agencia, nomeCliente, mensagem;
		double saldo;
		
		System.out.println("Por favor, digite o numero da Conta: ");
		numeroConta = entrada.nextInt();
		
		System.out.println("Agora, digite o numero da Agencia: ");
		agencia = entrada.next();
		
		System.out.println("Digite tambem o seu nome: ");
		entrada.nextLine();
		nomeCliente = entrada.nextLine();
		
		System.out.println("Por ultimo, faça o seu primeiro depósito: ");
		saldo = entrada.nextDouble();
		
		//System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " 1já está disponível para saque.");
		
		mensagem = String.format("Olá %s, obrigado pr criar uma conta em nosso banco, sua agencia é %s, conta %d e seu saldo %.2f ja esta disponivel para saque!", nomeCliente, agencia, numeroConta, saldo);
		System.out.println(mensagem);
	}

}
