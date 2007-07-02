package com.george.caneco.result;

import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;

import com.george.caneco.Dado;
import com.george.caneco.Resultado;
import com.george.caneco.impl.ResultadoFactory;

public class ConstanteTest extends TestCase {
	private Resultado resultado;
	
	@Override
	protected void setUp() throws Exception {
		this.resultado = ResultadoFactory.RESULTADO_UM;
	}
	

	public void testUmUm() throws Exception {
		List<Dado> lista = Arrays.asList(Dado.UM,Dado.DOIS,Dado.DOIS,Dado.DOIS,Dado.DOIS);
		int pontos = resultado.calcularPontos(lista);
		assertEquals(1, pontos);
	}

	public void testUmDois() throws Exception {
		List<Dado> lista = Arrays.asList(Dado.UM,Dado.DOIS,Dado.UM,Dado.DOIS,Dado.DOIS);
		int pontos = resultado.calcularPontos(lista);
		assertEquals(2, pontos);
	}
	
	public void testUmTodos() throws Exception {
		List<Dado> lista = Arrays.asList(Dado.UM,Dado.UM,Dado.UM,Dado.UM,Dado.UM);
		int pontos = resultado.calcularPontos(lista);
		assertEquals(5, pontos);
	}
}
