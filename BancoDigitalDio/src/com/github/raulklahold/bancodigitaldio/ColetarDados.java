package com.github.raulklahold.bancodigitaldio;

public class ColetarDados {
	private String Nome;
	private int agencia;
	private String Numeroconta;
	private double valor;
	private double saldo;
	public ExecutarDeposito deposito;
	public ExecutarTRasnferencia transferencia;
	public ExecutarSaque saque;
	public ContaCorrente conta;
	public Poupanca poupanca;

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String getNumeroconta() {
		return Numeroconta;
	}

	public void setNumeroconta(String numeroconta) {
		Numeroconta = numeroconta;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
