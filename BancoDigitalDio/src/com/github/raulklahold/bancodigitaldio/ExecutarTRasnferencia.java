package com.github.raulklahold.bancodigitaldio;

public class ExecutarTRasnferencia {
  public static double Transferir(ColetarDados ColetarDados) {
	  
	    double saldo = ColetarDados.getSaldo();
		double valor = ColetarDados.getValor();
		double contaDestino = 0;
      
		if (saldo >= valor) {
			saldo = saldo - valor;
			contaDestino = contaDestino + valor;
			System.out.println("A conta destino recebeu: "+contaDestino+" $");
			
		}else {
			System.out.println("Valor superior ao saldo, impossível completar transação");
		}
			
   return contaDestino;
  }
}
