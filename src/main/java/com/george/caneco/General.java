package com.george.caneco;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.george.caneco.impl.ResultadoFactory;

public class General {
	private List<Jogador> jogadores = new ArrayList<Jogador>();
	private List<Dado> dadosSeparados = new ArrayList<Dado>();
	private Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		General gen = new General();
		gen.criarNovoJogador("George Gastaldi");
		gen.jogar();
	}

	public void criarNovoJogador(String nome) {
		Jogador jog = new Jogador(nome);
		jogadores.add(jog);
	}

	public void jogar() {
		Caneco c = new Caneco();
		for (int i = 0; i < ResultadoFactory.TOTAL_RODADAS; i++) {
			for (Jogador jog : jogadores) {
				Tabela tab = jog.getTabela();
				c.chacoalhar();
				List<Dado> dados = c.getDados();
				Map<Resultado, Integer> resultados = tab.getResultadosDisponiveis(dados);
				c.retirarDados(separarDados(dados, c));
				renderizaTabela(resultados);
			}
		}
	}

	private int separarDados(List<Dado> dados, Caneco c) {
		System.out.println("Dados: "+dados);
		return 0;
	}

	public void renderizaTabela(Map<Resultado, Integer> resultados) {
		System.out.println("Você tem essas opçoes: " + resultados);
	}
}
