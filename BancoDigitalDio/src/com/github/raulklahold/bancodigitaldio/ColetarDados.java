package com.github.raulklahold.bancodigitaldio;

public class ColetarDados {
	private String Nome;
	private String agencia;
	private String Numeroconta;
	private double valor;
	private double saldo;
	private ExecutarDeposito deposito;
	private ExecutarTRasnferencia transferencia;
	private ExecutarSaque saque;

	public ExecutarDeposito getDeposito() {
		return deposito;
	}

	public void setDeposito(ExecutarDeposito deposito) {
		this.deposito = deposito;
	}

	public ExecutarTRasnferencia getTransferencia() {
		return transferencia;
	}

	public void setTransferencia(ExecutarTRasnferencia transferencia) {
		this.transferencia = transferencia;
	}

	public ExecutarSaque getSaque() {
		return saque;
	}

	public void setSaque(ExecutarSaque saque) {
		this.saque = saque;
	}

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
