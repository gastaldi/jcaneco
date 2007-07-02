package com.george.caneco.impl;

import java.util.List;

import com.george.caneco.Dado;
import com.george.caneco.Resultado;

public class QuadraResultado implements Resultado {

	public int calcularPontos(List<Dado> dados) {
		for (int numeroAtual=1;numeroAtual<=6;numeroAtual++) {
			int testeQuadra = 0;
			for (Dado dado : dados) {
				if (dado.getNumero() == numeroAtual) {
					testeQuadra++;
				}
			}
			if (testeQuadra == 4) {
				return getValorMaximo();
			}
		}
		return 0;
	}

	public int getValorMaximo() {
		return 40;
	}
	
	@Override
	public String toString() {
		return "Quadra";
	}
	

}
