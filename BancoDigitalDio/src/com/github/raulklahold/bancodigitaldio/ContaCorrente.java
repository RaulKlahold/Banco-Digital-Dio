package com.github.raulklahold.bancodigitaldio;

public class ContaCorrente {
       public static String Contacorrente(ColetarDados ColetarDados) {
    	   String nome = ColetarDados.getNome();
    	   int agencia = ColetarDados.getAgencia();
    	   String numeroconta = ColetarDados.getNumeroconta();
    	   double saldo = ColetarDados.getSaldo();
    	   if(nome.length() < 3) {
   			throw new ExceptionNome();
   		}
   		else if(agencia.length() < 4 && agencia.length() > 5) {
   			throw new ExceptionAgencia();
   			
   		}
   		else if(numeroconta.length() < 7) {
   			throw new ExceptionPedido();
   		}
   		else {

    	   String credencial = "Olá, " + nome + " Tudo bem?\n" +
                               "Sua agência é: " + agencia + "\n" +
                               "Sua conta é: " + numeroconta + "\n" +
                               "E seu saldo é: " + saldo;
    	   
    	   System.out.println(credencial);
    	   
    	   return credencial;
       }
}}
