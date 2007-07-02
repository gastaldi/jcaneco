package com.george.caneco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Caneco {
	private List<Dado> dados= new ArrayList<Dado>();
	private Random random;
	private int totalDados = 5;
	
	public Caneco(Random randomizer) {
		this.random =randomizer;
	}
	public Caneco() {
		this.random = new Random();
	}
	public void reset() {
		this.totalDados = 5;
	}

	public void chacoalhar() {
		dados.clear();
		Dado[] d = Dado.values();
		for (int i=0;i<totalDados;i++) {
			dados.add(d[random.nextInt(6)]);
		}
	}
	public void retirarDados(int total) {
		this.totalDados -= total;
	}
	
	public List<Dado> getDados() {
		return Collections.unmodifiableList(dados);
	}
	
}
