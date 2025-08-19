package entities;

public class Triangulo extends FigurasPlanas implements FiguraGeometrica{
	private double baseTriangulo;
	private double alturaTriangulo;
	
	public Triangulo() {
		// TODO Auto-generated constructor stub
	}
	
	public Triangulo(double baseTriangulo, double alturaTriangulo) {
		super();
		this.baseTriangulo = baseTriangulo;
		this.alturaTriangulo = alturaTriangulo;
	}
	
	public double getBaseTriangulo() {
		return baseTriangulo;
	}

	public void setBaseTriangulo(double baseTriangulo) {
		this.baseTriangulo = baseTriangulo;
	}

	public double getAlturaTriangulo() {
		return alturaTriangulo;
	}

	public void setAlturaTriangulo(double alturaTriangulo) {
		this.alturaTriangulo = alturaTriangulo;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return (baseTriangulo * alturaTriangulo)/2.0;
	}

	@Override
	public void relatorio() {
		
		System.out.println("FIGURA PLANA: TRIÂNGULO");
		//System.out.print("Nome: " + getNome());
		System.out.println("Altura: " + getAlturaTriangulo());
		System.out.println("Base: " + getBaseTriangulo());
		System.out.println("Área: " + calcularArea());	
		
	}

}
