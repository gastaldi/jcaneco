package com.george.caneco;

import java.util.List;

public interface Resultado {
	public abstract int getValorMaximo();
	public abstract int calcularPontos(List<Dado> dados);
}
