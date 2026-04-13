package negocio;

public class Gerente extends Colaborador {
	//Propriedades da classe
	private double bonus = 0;
	
	//Métodos construtores da classe

	
	public Gerente() {
		super();
	
	}
	public Gerente(int matricula, String nome, double salario, double bonus) {
		super(matricula, nome, salario);
		this.bonus = bonus;
	}
	//Construtores de hierarquia de classes, tem de ser completamente cheios, ou seja, selecionada a combo na caixa do consultor
	//métodos de acesso
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	//métodos sobrescitos da classe
	public double getSalario() {
		return(super.getSalario() + this.getBonus());
	}
	
	
}
