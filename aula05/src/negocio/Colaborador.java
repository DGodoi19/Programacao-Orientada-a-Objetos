package negocio;

public class Colaborador {

	//propriedades da classe
	private int Matricula = 0;
	private String nome = "";
	private double salario = 0;
	
	//Métodos construtores da classe 
	public Colaborador(int matricula, String nome, double salario) {
		super();
		Matricula = matricula;
		this.nome = nome;
		this.salario = salario;
	}
	public Colaborador() {
		super();
		
		// Métodos de acesso da classe
	}
	public int getMatricula() {
		return Matricula;
	}
	public void setMatricula(int matricula) {
		Matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	
	
}
