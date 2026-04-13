package negocio;

public class Compra {
	//propriedades da calsse
	private  Produto objProduto = null;
	private int quantidade = 0;
	private String data = "";
	private String cartao = "";

public Compra() {

	
	//Métodos Contrutores da classe
	
	
}

public Compra(Produto objProduto, int quantidade, String data, String cartao) {
	super();
	this.objProduto = objProduto;
	this.quantidade = quantidade;
	this.data = data;
	this.cartao = cartao;
}
//Métodos de acesso


public Produto getObjProduto() {
	return objProduto;
}

public void setObjProduto(Produto objProduto) {
	this.objProduto = objProduto;
}

public int getQuantidade() {
	return quantidade;
}

public void setQuantidade(int quantidade) {
	this.quantidade = quantidade;
}

public String getData() {
	return data;
}

public void setData(String data) {
	this.data = data;
}

public String getCartao() {
	return cartao;
}

public void setCartao(String cartao) {
	this.cartao = cartao;
}

	

}