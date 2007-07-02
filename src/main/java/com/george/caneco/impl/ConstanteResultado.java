package com.george.caneco.impl;

import java.util.List;

import com.george.caneco.Dado;
import com.george.caneco.Resultado;

public class ConstanteResultado implements Resultado {
	private int num;
	
	public int getValorMaximo() {
		return num * 5;
	}
	public ConstanteResultado(int num) {
		this.num = num;
	}

	public int calcularPontos(List<Dado> dados) {
		int pontos = 0; 
		for (Dado dado: dados) {
			if (dado.getNumero() == num) {
				pontos+=num;
			}
		}
		return pontos;
	}
	
	@Override
	public String toString() {
		return String.valueOf(num);
	}
}
