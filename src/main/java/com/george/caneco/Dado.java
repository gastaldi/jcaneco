package com.george.caneco;

public enum Dado {
	UM(1),DOIS(2),TRES(3),QUATRO(4),CINCO(5), SEIS(6);
	
	private int numero;
	
	Dado(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return this.numero;
	}
}
