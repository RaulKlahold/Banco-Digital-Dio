package com.github.raulklahold.bancodigitaldio;

public class ColetarDados {
	private String Nome;
	private String agencia;
	private String Numeroconta;
	private double valor;
	private double saldo;
	
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
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
