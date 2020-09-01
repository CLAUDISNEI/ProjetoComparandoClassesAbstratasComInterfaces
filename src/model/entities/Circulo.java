package model.entities;

import model.services.Cores;

public class Circulo extends Formas {
	private Double raio;


	public Circulo(Double raio, Cores cor) {
		super(cor);
		this.raio = raio;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	@Override
	public Double area() {
		
		return Math.PI * Math.pow(raio, 2);
	}
	
	
	
}
