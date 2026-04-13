package logica;

public class Cachorro extends Mamifero {
	private double forcaMordida = 0;

	public Cachorro() {

	}

	public Cachorro(double peso, double altura, String nome, double litrosLeite, double forcaMordida) {
		super(peso, altura, nome, litrosLeite);
		this.forcaMordida = forcaMordida;
	}

	public double getForcaMordida() {
		return forcaMordida;
	}

	public void setForcaMordida(double forcaMordida) {
		this.forcaMordida = forcaMordida;
	}
	
	public void morder() {
		System.out.println("Woof Woof");
	}

}
