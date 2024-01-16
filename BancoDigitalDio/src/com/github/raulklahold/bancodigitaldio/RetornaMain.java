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

		switch (opcao) {
		case 1:
			System.out.println("opçao C maiusculo");
			break;

		case 2:
			System.out.println("opçao P minusculo");
			break;

		default:
			System.out.println("Pedido não encontrado");
			break;

		}
	}
}
