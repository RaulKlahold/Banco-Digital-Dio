package com.github.raulklahold.bancodigitaldio;

public class ExecutarDeposito {
   public static double Deposito (ColetarDados ColetarDados) {
	   
	   double saldo = ColetarDados.getSaldo();
		double valor = ColetarDados.getValor();
       
       
		if (valor >= 1) {
			saldo = saldo + valor;
		}else {
			System.out.println("adicionar uma exceptions aqui");
		}
			
    return saldo;
		
   }
}
