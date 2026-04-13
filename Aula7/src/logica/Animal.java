package logica;

public abstract class Animal {
	private double peso = 0;
	private double altura =0;
	private String nome = "";
	public Animal() {

	}
	public Animal(double peso, double altura, String nome) {
		super();
		this.peso = peso;
		this.altura = altura;
		this.nome = nome;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double calcularImc() {
		return (getPeso()/(getAltura()*getAltura()));
	}
	

}
