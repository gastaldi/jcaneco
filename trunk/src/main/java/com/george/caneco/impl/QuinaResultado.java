package com.george.caneco.impl;

import java.util.List;

import com.george.caneco.Dado;
import com.george.caneco.Resultado;

public class QuinaResultado implements Resultado {

	public int calcularPontos(List<Dado> dados) {
		boolean result = true;
		int num = dados.get(0).getNumero();
		for (int i=1;result && i<dados.size();i++) {
			int numComp = dados.get(i).getNumero();
			if (numComp != num) {
				result = false;
			}
		}
		return (result ? getValorMaximo() : 0);
	}
	
	public int getValorMaximo() {
		return 50;
	}
	
	@Override
	public String toString() {
		return "Quina";
	}

}
