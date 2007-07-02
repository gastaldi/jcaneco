package com.george.caneco.result;

import java.util.Arrays;
import java.util.List;

import com.george.caneco.Dado;
import com.george.caneco.Resultado;
import com.george.caneco.impl.ResultadoFactory;

import junit.framework.TestCase;

public class FulaTest extends TestCase {
	private Resultado resultado;
	@Override
	protected void setUp() throws Exception {
		resultado = ResultadoFactory.RESULTADO_FULA;
	}
	
	public void testFulaValida() throws Exception {
		List<Dado> lista = Arrays.asList(Dado.UM,Dado.UM,Dado.UM,Dado.DOIS,Dado.DOIS);
		int pontos = resultado.calcularPontos(lista);
		assertEquals(30, pontos);
	}
	
	public void testFulaInvalida() throws Exception {
		List<Dado> lista = Arrays.asList(Dado.UM,Dado.UM,Dado.UM,Dado.DOIS,Dado.TRES);
		int pontos = resultado.calcularPontos(lista);
		assertTrue(pontos == 0);	
	}
}
