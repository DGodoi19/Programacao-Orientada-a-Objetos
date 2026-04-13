package negocio;

public class Estante {
	//propriedades da classe
	private int numero = 0;
		//Métodos construtores da classe
	public Estante() {
		
		
	}
	
	public Estante (int numero) {
		this.numero = numero;
	}
	
	//Métodos de acesso da classe
	public int getnumero() {
		return numero;
	}
	public void setNumero (int numero) {
		this.numero = numero;
	}
}
