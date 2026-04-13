	//1 Passo = Extends JFrame
	//2 Passo = Criar serial version UID
	//3 Passo = Cadastrar as propriedades privadas da classe
	//4 passo = criar main
	// 5 passo = configuração da janela
	// 6 passo = 


package apresentacao;

import javax.swing.JFrame;
public class Visao extends JFrame {
	
	//Propriedades da classe
	private static final long serialVersionUID = 1L;
	private Painel objPainel = new Painel();

	
	//Método principal de execução da classe
	public static void main (String[]args) {
		new Visao().setVisible(true);
	}
	//Métodos construtores da classe
	public Visao () {
		//Configuração da janela
		setTitle("Minha Primeira Janela JAVA :-) !!!");
		setSize(800,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
		//Configuração do painel
		setContentPane(objPainel);
	}
}
