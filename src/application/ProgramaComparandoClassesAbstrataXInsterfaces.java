package application;

import model.entities.Circulo;
import model.entities.Formas;
import model.entities.Retangulo;
import model.services.Cores;

public class ProgramaComparandoClassesAbstrataXInsterfaces {

	public static void main(String[] args) {
		
		Formas f1 = new Circulo(2.0, Cores.BRANCO);
		Formas f2 = new Retangulo(3.0, 4.0, Cores.BRANCO);
		
		System.out.println("Cor do circulo: " + f1.getCor());
		System.out.println("Area do ciruculo: "+ String.format("%.2f", f1.area()));
		System.out.println("Cor do retângulo: "+ f2.getCor());
		System.out.println("Area do retângulo: "+ String.format("%.2f", f2.area()));
	}
}
