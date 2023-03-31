package edu.tecjerez.topicos.figuras;

public class Triangulo {

	private double lados[] = new double[3];
	
	public Triangulo(double la, double lb, double lc) {
		lados[0] = la;
		lados[1] = lb;
		lados[2] = lc;
	}
	
	public double area() {
		
		double semiperimetro = (lados[0]+lados[1]+lados[2])/2;
		
		return Math.sqrt(semiperimetro*(semiperimetro-lados[0])*(semiperimetro-lados[1])*(semiperimetro-lados[2]));
	}
	
    public double perimetro() {
		
		return lados[0]+lados[1]+lados[2];
		
	}
	
}