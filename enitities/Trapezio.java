package entities;

public class Trapezio extends FigurasPlanas implements FiguraGeometrica {
	private double baseMaior;
	private double baseMenor;
	private double alturaTrapezio;
	
	public Trapezio() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Trapezio(double baseMaior, double baseMenor, double alturaTrapezio) {
		super();
		this.baseMaior = baseMaior;
		this.baseMenor = baseMenor;
		this.alturaTrapezio = alturaTrapezio;
	}

	

	public double getBaseMaior() {
		return baseMaior;
	}



	public void setBaseMaior(double baseMaior) {
		this.baseMaior = baseMaior;
	}



	public double getBaseMenor() {
		return baseMenor;
	}



	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}



	public double getAlturaTrapezio() {
		return alturaTrapezio;
	}



	public void setAlturaTrapezio(double alturaTrapezio) {
		this.alturaTrapezio = alturaTrapezio;
	}



	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return ((baseMaior+baseMenor)*alturaTrapezio)/2.0;
	}

	@Override
	public void relatorio() {
		System.out.println("FIGURA PLANA: TRAPÉZIO");
		//System.out.print("Nome: " + getNome());
		System.out.println("Altura: " + getAlturaTrapezio());
		System.out.println("Base Maior: " + getBaseMaior());
		System.out.println("Base Menor: " + getBaseMenor());
		System.out.println("Área: " + calcularArea());	
		
	}

}
