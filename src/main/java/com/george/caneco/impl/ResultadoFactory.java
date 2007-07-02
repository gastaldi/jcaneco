package com.george.caneco.impl;

import com.george.caneco.Resultado;

public class ResultadoFactory {
	public static final int TOTAL_RODADAS = 9; 
	
	// Resultados comuns
	public static final Resultado RESULTADO_UM 	 	= new ConstanteResultado(1);
	public static final Resultado RESULTADO_DOIS 	= new ConstanteResultado(2);
	public static final Resultado RESULTADO_TRES 	= new ConstanteResultado(3);
	public static final Resultado RESULTADO_QUATRO 	= new ConstanteResultado(4);
	public static final Resultado RESULTADO_CINCO 	= new ConstanteResultado(5);
	public static final Resultado RESULTADO_SEIS 	= new ConstanteResultado(6);
	
	// Resultados avançados
	public static final Resultado RESULTADO_QUADRA  = new QuadraResultado();
	public static final Resultado RESULTADO_FULA    = new FulaResultado();
	public static final Resultado RESULTADO_QUINA   = new QuinaResultado();

}
