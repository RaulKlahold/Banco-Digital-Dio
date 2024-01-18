package com.github.raulklahold.bancodigitaldio;

@SuppressWarnings("serial")
public class ExceptionConta extends Exception {
	public ExceptionConta() {
		super("O nome precisa ter no minimo 3 caracteres: ");
	}

	public ExceptionConta(String message) {
		super(message);
	}
}
