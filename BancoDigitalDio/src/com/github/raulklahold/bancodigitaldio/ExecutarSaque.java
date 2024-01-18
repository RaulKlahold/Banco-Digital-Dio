package com.github.raulklahold.bancodigitaldio;

public class ExecutarSaque {
	public static double sacar(ColetarDados ColetarDados) {

		double saldo = ColetarDados.getSaldo();
		double valor = ColetarDados.getValor();
        
		if (saldo >= valor) {
			saldo = saldo - valor;
		}else {
			System.out.println("Valor superior ao saldo, impossível completar transação");
		}
			
     return saldo;
		

	}
}
