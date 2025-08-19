package entities;

public class Circulo extends FigurasPlanas implements FiguraGeometrica{
		private double raio;
		public static double PI = 3.14;
		
		
		
		public Circulo() {
			// TODO Auto-generated constructor stub
		}
		
		public Circulo(double raio) {
			super();
			this.raio = raio;
		}
		
		
		public double getRaio() {
			return raio;
		}

		public void setRaio(double raio) {
			this.raio = raio;
		}

		@Override
		public double calcularArea() {
		
			return (raio*raio) * PI;
		}
		@Override
		public void relatorio() {
			// TODO Auto-generated method stub
			System.out.println("FIGURA PLANA: CÍRCULO");
			//sSystem.out.print("Nome: " + getNome());
			System.out.println("Raio: " + getRaio()) ;
			System.out.println("Área: " + calcularArea());
			
		}
		
}
