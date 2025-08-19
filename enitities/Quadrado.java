package entities;

public class Quadrado  extends FigurasPlanas implements FiguraGeometrica{
	private int lado;
	

	public Quadrado(int lado) {
		super();
		this.lado = lado;
	}
	public int getLado() {
		return lado;
	}
	public void setLado(int lado) {
		this.lado = lado;
	}
	@Override
	public double calcularArea() {
		return lado * lado;
	}
	
	@Override
	public void relatorio() {
		// TODO Auto-generated method stub
		System.out.println("FIGURA PLANA: QUADRADO");
	
		System.out.println("Lado: " + getLado());
		System.out.println("Área: " + calcularArea());
	}
}
