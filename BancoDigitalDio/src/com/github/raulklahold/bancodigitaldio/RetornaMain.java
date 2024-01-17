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
			String nomeCC = scan.next();
			cx.setNome(nomeCC);
			
			System.out.println("Por favor insira o numero de sua agência");
			int agenciaCC = scan.nextInt();
			cx.setAgencia(agenciaCC);
			
			System.out.println("Por favor insira o numero da sua conta");
			String contaCC = scan.next();
			cx.setNumeroconta(contaCC);
			
			System.out.println("Qual operação deseja realizar?:");
			System.out.println("1 - Saque 2 - Deposito 3 - Transferência");
			int operacaoCC = scan.nextInt();
			
			if(operacaoCC == 1) {
				System.out.println("Qual o valor que deseja sacar?: ");
				double saqueCC = scan.nextDouble();
				cx.setValor(saqueCC);
				
				double resultanteSaqueCC = ExecutarSaque.sacar(cx);
                double saldoSaqueCC = cx.getSaldo();
                
				System.out.println("Você Sacou: "+resultanteSaqueCC+" $");
				System.out.println("Agora você possui em conta: "+saldoSaqueCC+" $");
			}
			else if(operacaoCC == 2) {
				
				System.out.println("Qual o valor que deseja depositar?: ");
				double depositoCC = scan.nextDouble();
				cx.setValor(depositoCC);
				
				double resultanteDepositoCC = ExecutarDeposito.Deposito(cx);
                double saldoDepositoCC = cx.getSaldo();
                
				System.out.println("Você depositou: "+resultanteDepositoCC+" $");
				System.out.println("Agora você possui em conta: "+saldoDepositoCC+" $");
			}
			else if(operacaoCC == 3) {
				
				System.out.println("Qual o valor que deseja transferir?: ");
				double transferenciaCC = scan.nextDouble();
				cx.setValor(transferenciaCC);
				
				double resultantetransferenciaCC = ExecutarTRasnferencia.Transferir(cx);
                double saldoTransferenciaCC = cx.getSaldo();
                
				System.out.println("Você depositou: "+resultantetransferenciaCC+" $");
				System.out.println("Agora você possui em conta: "+saldoTransferenciaCC+" $");
			}
			
			
			
			
		}
		else if(opcao == 2) {
			System.out.println("teste 2");
			
		}else {
			System.out.println("Solução não encontrada");
		}
		
	}
}
