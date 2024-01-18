package com.github.raulklahold.bancodigitaldio;

public class ContaCorrente {
	public static String Contacorrente(ColetarDados ColetarDados) {
		String nome = ColetarDados.getNome();
		int agencia = ColetarDados.getAgencia();
		String numeroconta = ColetarDados.getNumeroconta();
		double saldo = ColetarDados.getSaldo();

		String credencial = "Olá, " + nome + " Tudo bem?\n" + "Sua agência é: " + agencia + "\n" + "Sua conta é: "
				+ numeroconta + "\n" + "E seu saldo é: " + saldo;

		System.out.println(credencial);

		return credencial;
	}
}
