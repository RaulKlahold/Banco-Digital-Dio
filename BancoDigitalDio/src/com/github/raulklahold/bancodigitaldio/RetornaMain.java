package com.github.raulklahold.bancodigitaldio;

import java.util.Scanner;

public class RetornaMain {

	public static void main(String[] args) {
		ColetarDados cx = new ColetarDados();
		Scanner scan = new Scanner(System.in);
		
		
	System.out.println("\nBem vindos ao Banco Digital! \n");
	System.out.println("\nPara qual opção você deseja ter acesso? \n");
	System.out.println("Escolha a seu tipo de conta C - conta corrente P - poupança: \n");
	String opcao = scan.nextLine();
	
	if(opcao == "C" || opcao == "c") {
		
	}
	else if(opcao == "p" || opcao == "P") {
		
	}else {
		System.out.println("Colocar uma exception aqui");
	}
	

	}


}
