package logic;

public class Cubo implements solido {
	private double aresta = 0;

	public Cubo() {
		super();
	}

	public Cubo(double aresta) {
		super();
		this.aresta = aresta;
	}

	public double getAresta() {
		return aresta;
	}

	public void setAresta(double aresta) {
		this.aresta = aresta;
	}
	
	//metodos implementados da interface
	
	public double calcularArea() {
		return (getAresta()*getAresta()*6);
		// return (Math.pow(getAresta(), 2) * 6);
	}
	
	public double calcularVolume() {
		return (getAresta()*getAresta()*getAresta());
		// return (Math.pow(getAresta(), 3));
	}
}
