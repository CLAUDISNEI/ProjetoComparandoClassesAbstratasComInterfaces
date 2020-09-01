package model.entities;

import model.services.Cores;

public abstract class Formas {
	private Cores Cor;

	public Formas(Cores Cor) {
		this.Cor = Cor;
	}

	public Cores getCor() {
		return Cor;
	}

	public void setCor(Cores Cor) {
		this.Cor = Cor;
	}
	
	public abstract Double area();
		
}
