package entities;

public class Losango  extends FigurasPlanas implements FiguraGeometrica{
	private double diagonal1;
	private double diagonal2;
	
	public Losango() {
		// TODO Auto-generated constructor stub
	}
	
	public Losango(double diagonal1, double diagonal2) {
		super();
		this.diagonal1 = diagonal1;
		this.diagonal2 = diagonal2;
	}
	
	public double getDiagonal1() {
		return diagonal1;
	}

	public void setDiagonal1(double diagonal1) {
		this.diagonal1 = diagonal1;
	}

	public double getDiagonal2() {
		return diagonal2;
	}

	public void setDiagonal2(double diagonal2) {
		this.diagonal2 = diagonal2;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return (diagonal1*diagonal2)/2.0;
	}
	

	@Override
	public void relatorio() {
		System.out.println("FIGURA PLANA: LOSANGO");
		System.out.println("Diagonal 1: " + getDiagonal1());
		System.out.println("Diagonal 2: " + getDiagonal2());
		System.out.println("Área: " + calcularArea());	
		
	}
	

}
