package negocio;

import java.util.Collection;
import java.util.LinkedList;

public class Tipo {
	private String descricao = "";

	public Tipo(String descricao) {
		super();
		this.descricao = descricao;
	}

	public Tipo() {
		super();
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	//Métodos da classe 
	public static Collection<Tipo> getTodos() throws Exception{
		LinkedList<Tipo> colecao = new LinkedList<Tipo>();
		colecao.add(new Tipo ("Eletrônico"));
		colecao.add(new Tipo ("Vestuário"));
		colecao.add(new Tipo ("Livro"));
		colecao.add(new Tipo ("Produto de Beleza"));
		colecao.add(new Tipo ("Ferramenta"));
		
		return colecao;
	}
			
}
