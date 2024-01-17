package com.github.raulklahold.bancodigitaldio;

import java.util.Scanner;

public class RetornaMain {

	public static void main(String[] args) {
		ColetarDados cx = new ColetarDados();
		Scanner scan = new Scanner(System.in);

		System.out.println("\nBem vindos ao Banco Digital! \n");
		System.out.println("\nPara qual opção você deseja ter acesso? \n");
		System.out.println("Escolha a seu tipo de conta 1 - conta corrente 2 - poupança: \n");
		int opcao = scan.nextInt();

		if(opcao == 1) {
			System.out.println("Por favor insira seu nome");
			String nome = scan.nextLine();
			cx.setNome(nome);
			
			System.out.println("Por favor insira o numero de sua agência");
			String agencia = scan.nextLine();
			cx.setAgencia(agencia);
			
			System.out.println("Por favor insira o numero da sua conta");
			String conta = scan.nextLine();
			cx.setNumeroconta(conta);
			
			System.out.println("Qual operação deseja realizar?:");
			System.out.println("1 - Saque 2 - Deposito 3 - Transferência");
			int operacao = scan.nextInt();
			
			
			
			
		}
		else if(opcao == 2) {
			System.out.println("teste 2");
			
		}else {
			System.out.println("Solução não encontrada");
		}
		
	}
}
