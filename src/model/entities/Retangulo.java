package model.entities;

import model.services.Cores;

public class Retangulo extends Formas {
	
	private Double largura;
	private Double altura;
	private Cores cor;
	
	public Retangulo(Double largura, Double altura, Cores cor) {
		super(cor);
		this.largura = largura;
		this.altura = altura;
	}

	public Double getLargura() {
		return largura;
	}

	public void setLargura(Double largura) {
		this.largura = largura;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	@Override
	public Double area() {
		return largura * altura;
	}
	
	
	
	
	
	
}
