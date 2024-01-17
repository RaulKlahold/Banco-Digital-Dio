package com.github.raulklahold.bancodigitaldio;

public class ColetarDados {
	private String Nome;
	private int agencia;
	private String Numeroconta;
	private double valor;
	private double saldo;
	private ExecutarDeposito deposito;
	private ExecutarTRasnferencia transferencia;
	private ExecutarSaque saque;
	private ContaCorrente conta;
	private Poupanca poupanca;

	public ContaCorrente getConta() {
		return conta;
	}

	public void setConta(ContaCorrente conta) {
		this.conta = conta;
	}

	public Poupanca getPoupanca() {
		return poupanca;
	}

	public void setPoupanca(Poupanca poupanca) {
		this.poupanca = poupanca;
	}

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
