package com.github.raulklahold.bancodigitaldio;

public class ExecutarDeposito {
   public static double Deposito (ColetarDados ColetarDados) {
	   
	   double saldo = ColetarDados.getSaldo();
		double valor = ColetarDados.getValor();
       double valo = 0;
       
		if (saldo >= valor) {
			valorsacado = saldo - valor;
		}else {
			System.out.println("adicionar uma exceptions aqui");
		}
			
    return valorsacado;
		
   }
}
