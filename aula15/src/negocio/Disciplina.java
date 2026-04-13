package negocio;

import java.util.Collection;

import persistencia.DisciplinaDAO;

public class Disciplina {
	//Propriedades da calsse
	private int id = 0;
	private String nome = "";
	public Disciplina(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	public Disciplina() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//Métodos construtores da classe
	
	//Método da classe
	public static Collection<Disciplina>getTodos() throws Exception {
		return new DisciplinaDAO().getTodos();
	}
	
}

