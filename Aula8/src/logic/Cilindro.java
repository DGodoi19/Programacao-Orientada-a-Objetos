package logic;

public class Cilindro implements solido{
	private double raio = 0;
	private double altura = 0;
	
	private double pi = 3.14;
	
	public Cilindro() {
		super();
	}

	public Cilindro(double raio, double altura) {
		super();
		this.raio = raio;
		this.altura = altura;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	//metodos implements
	
	public double calcularArea() {
		return ((2*pi*getRaio())*getAltura() + (pi*getRaio()*getRaio())*2);
		 //return ((2 * Math.PI * Math.pow(getRaio(), 2)) + (2 * Math.PI * getRaio() * getAltura()));
	}
	
	public double calcularVolume() {
		return ((pi*getRaio()*getRaio()) * getAltura());
		// return (Math.PI * Math.pow(getRaio(), 2) * getAltura());
	}
}
