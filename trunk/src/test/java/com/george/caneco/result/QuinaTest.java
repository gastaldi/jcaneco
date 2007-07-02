package com.george.caneco.result;

import java.util.Arrays;
import java.util.List;

import com.george.caneco.Dado;
import com.george.caneco.Resultado;
import com.george.caneco.impl.ResultadoFactory;

import junit.framework.TestCase;

public class QuinaTest extends TestCase {
	private Resultado resultado;
	@Override
	protected void setUp() throws Exception {
		resultado = ResultadoFactory.RESULTADO_QUINA;
	}
	
	public void testQuinaValida() throws Exception {
		List<Dado> lista = Arrays.asList(Dado.UM,Dado.UM,Dado.UM,Dado.UM,Dado.UM);
		int pontos = resultado.calcularPontos(lista);
		assertEquals(ResultadoFactory.RESULTADO_QUINA.getValorMaximo(), pontos);
	}
	
	public void testQuinaInvalida() throws Exception {
		List<Dado> lista = Arrays.asList(Dado.UM,Dado.UM,Dado.UM,Dado.DOIS,Dado.TRES);
		int pontos = resultado.calcularPontos(lista);
		assertTrue(pontos == 0);	
	}
}
