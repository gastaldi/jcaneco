package com.george.caneco;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.george.caneco.impl.ResultadoFactory;

public class Tabela {
	private int totalPontos;

	private LinkedHashMap<Resultado, Integer> tabela = new LinkedHashMap<Resultado, Integer>(10,0.75f,true);

	public Tabela() {
		tabela.put(ResultadoFactory.RESULTADO_UM,0);
		tabela.put(ResultadoFactory.RESULTADO_DOIS,0);
		tabela.put(ResultadoFactory.RESULTADO_TRES, 0);
		tabela.put(ResultadoFactory.RESULTADO_QUATRO, 0);
		tabela.put(ResultadoFactory.RESULTADO_CINCO,0);
		tabela.put(ResultadoFactory.RESULTADO_SEIS,0);
		tabela.put(ResultadoFactory.RESULTADO_FULA,0);
		tabela.put(ResultadoFactory.RESULTADO_QUADRA,0);
		tabela.put(ResultadoFactory.RESULTADO_QUINA,0);
	}

	public Map<Resultado, Integer> getResultadosDisponiveis(List<Dado> dados) {
		Map<Resultado, Integer> res = new LinkedHashMap<Resultado, Integer>();
		for (Entry<Resultado, Integer> entry: tabela.entrySet()) {
			if (entry.getValue() == 0) {
				int pontos = entry.getKey().calcularPontos(dados);
				if (pontos > 0) {
					res.put(entry.getKey(), pontos);
				}					
			}
		}
		return res;
	}

	public void marcarResultado(Resultado res, Integer pontos) {
		tabela.put(res, pontos);
		this.totalPontos += pontos;
	}

	public int getTotalPontos() {
		return this.totalPontos;
	}
}
