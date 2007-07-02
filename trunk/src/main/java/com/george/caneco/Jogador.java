package com.george.caneco;

public class Jogador {
	private String nome;
	private Tabela tabela;
	
	public Jogador(String nome) {
		this.nome = nome;
		this.tabela = new Tabela();
	}
	
	public String getNome() {
		return nome;
	}
	public Tabela getTabela() {
		return tabela;
	}
	public void setTabela(Tabela tabela) {
		this.tabela = tabela;
	}
}
