package com.github.raulklahold.bancodigitaldio;

public class ExecutarSaque {
	public static double sacar(ColetarDados ColetarDados) {

		double saldo = ColetarDados.getSaldo();
		double valor = ColetarDados.getValor();
        double valorsacado = 0;
        
		if (saldo >= valor) {
			valorsacado = saldo - valor;
		}else {
			System.out.println("adicionar uma exceptions aqui");
		}
			
     return valorsacado;
		

	}
}
