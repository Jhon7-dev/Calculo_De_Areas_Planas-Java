package application;

import entities.Circulo;
import entities.FiguraGeometrica;
import entities.Losango;
import entities.Quadrado;
import entities.Retangulo;
import entities.Trapezio;
import entities.Triangulo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//Scanner scn = new Scanner(System.in);
				 
				Quadrado fig = new Quadrado(6);
				fig.calcularArea();
				fig.relatorio();
				
				Circulo cir = new Circulo(4.0);
				//cir.calcularArea();
				cir.relatorio();
				
				Retangulo ret = new Retangulo(10,10);
				//ret.calcularArea();
				ret.relatorio();
				
				Triangulo tri = new Triangulo(4.0,3.0);
				tri.relatorio();
				
				Losango los = new Losango (4.0,8.0);
				los.relatorio();
				
				Trapezio trap = new Trapezio(15.0, 5.0,10.0 );
				trap.relatorio();
				
	}

}
