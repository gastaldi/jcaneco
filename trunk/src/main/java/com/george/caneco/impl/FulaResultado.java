package com.george.caneco.impl;

import java.util.HashSet;
import java.util.List;

import com.george.caneco.Dado;
import com.george.caneco.Resultado;

/**
 * Verificar se o número de dados contém 3 de um valor e 2 de outro para
 * caracterizar uma fula.
 * 
 * @author george
 * 
 */
public class FulaResultado implements Resultado {

	public int calcularPontos(List<Dado> dados) {
		if (new HashSet<Dado>(dados).size() == 2) {
			return getValorMaximo();
		}
		return 0;
	}

	public int getValorMaximo() {
		return 30;
	}
	
	@Override
	public String toString() {
		return "Fula";
	}

}
