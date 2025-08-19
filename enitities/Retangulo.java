package entities;

public class Retangulo extends FigurasPlanas implements FiguraGeometrica{
	
	private double base;
	private double altura;
	
	public Retangulo() {
		// TODO Auto-generated constructor stub
	}
	public Retangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	

	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return base * altura;
	}

	@Override
	public void relatorio() {
		// TODO Auto-generated method stub
				System.out.println("FIGURA PLANA: RETÂNGULO");
				//System.out.print("Nome: " + getNome());
				System.out.println("Altura: " + getAltura());
				System.out.println("Base: " + getBase());
				System.out.println("Área: " + calcularArea());
	}
}
