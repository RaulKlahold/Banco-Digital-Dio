package com.github.raulklahold.bancodigitaldio;

@SuppressWarnings("serial")

public class ExceptionAgencia extends Exception {
	public ExceptionAgencia() {
		super("O nome precisa ter no minimo 3 caracteres: ");
	}

	public ExceptionAgencia(String message) {
		super(message);
	}
}

