package apresentacao;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import negocio.Uf;

public class VisaoPessoa extends JFrame{
	//Propriedades da classe
	private static final long serialVersionUID = 1L;
	
	//Cadastrar nome
	private JLabel lblNome = new JLabel ("Nome") ;
	private JTextField txtNome  = new JTextField () ;
	
	//Cadastrar sexo
	private JLabel lblSexo = new JLabel ("Sexo") ;
	private ButtonGroup btgSexo = new ButtonGroup();
	private JRadioButton optMasculino = new JRadioButton("Masculino");
	private JRadioButton optFeminino = new JRadioButton("Feminino");
	private JRadioButton optNaoInformado = new JRadioButton("Não Informado");
	
	//Cadastrar endereço
	private JLabel lblEndereco = new JLabel  ("Endereço") ;	
	private JTextField txtEndereco = new JTextField();
	
	//Cadastrar Uf
	private JLabel lblUf = new JLabel("UF") ;
	private JComboBox<String> cboUf = new JComboBox<String>();
	
	//Cadastrar botões
	private JButton btnGravar = new JButton("Gravar");
	private JButton btnLimpar = new JButton("Limpar");
	private JButton btnSair = new JButton("Sair");
	
	//Método principal de execução da classe
	public static void main(String[]args) {
		new VisaoPessoa().setVisible(true);
			
	}
	//Método construtor da classe
	public VisaoPessoa() {
		//Configuração da janela
		setTitle("Cadastro de Pessoas");
		setSize(400, 290);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
		//Configuração do nome
		lblNome.setBounds(10,10,200,20);
		add(lblNome);
		txtNome.setBounds(10,30,365,20);
		add(txtNome);
		
		//Configuração sexo
		lblSexo.setBounds(10,60,200,20);
		add(lblSexo);
		optMasculino.setBounds(10, 80,100, 20);
		add(optMasculino);
		optFeminino.setBounds(110, 80, 100, 20);
		add(optFeminino);
		optNaoInformado.setBounds(210, 80, 150, 20);
		add(optNaoInformado);
		btgSexo.add(optMasculino);
		btgSexo.add(optFeminino);
		btgSexo.add(optNaoInformado);
		optMasculino.setSelected(true);
		
		//Configuração do endereço
		lblEndereco.setBounds(10,110, 200, 20);
		add(lblEndereco);
		txtEndereco.setBounds(10,130, 365, 20);
		add(txtEndereco);
		
		//Configuração da UF
		lblUf.setBounds(10	, 160 , 200, 20);
		add(lblUf);
		cboUf.setBounds(10, 180, 60, 20);
		add(cboUf);
		cboUf.addItem("---");
		try {
			for(Uf objUf : Uf.getTodos()) {
				cboUf.addItem(objUf.getSigla());
			}
		}catch(Exception erro) {
			JOptionPane.showMessageDialog(null, erro);
		}
		//Configuração dos botões
		btnGravar.setBounds(20, 210, 100, 30);
		add(btnGravar);
		btnGravar.addActionListener(new ControladorGravar(txtNome, optMasculino, optFeminino, txtEndereco, cboUf));
		
		btnLimpar.setBounds(140, 210, 100, 30);
		add(btnLimpar);
		btnLimpar.addActionListener(new ControladorLimpar(txtNome, optMasculino, txtEndereco, cboUf));
		
		
		btnSair.setBounds(260, 210, 100, 30);
		add(btnSair);
		btnSair.addActionListener(new ControladorSair());
		
	}
}
