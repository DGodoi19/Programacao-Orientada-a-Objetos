	package apresentacao;

	import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import negocio.Disciplina;
import negocio.Professor;

	public class VisaoTurma extends JFrame{
		//Propriedades da classe
		private static final long serialVersionUID = 1L;
		
		private JLabel lblDisciplina = new JLabel ("Disciplina");
		private JComboBox<String> cboDisciplina = new JComboBox<String>();
		

		private JLabel lblProfessor= new JLabel ("Professor");
		private JComboBox<String> cboProfessor= new JComboBox<String>();
		
		private JLabel lblLetra= new JLabel ("Letra");
		private JTextField txtLetra= new JTextField("Letra");
		

		private JButton btnGravar = new JButton("Gravar");
		private JButton btnLimpar = new JButton("Limpar");
		private JButton btnSair = new JButton("Sair");
		
		//Método principaç de execução da classe
		
		public static void main(String[]args) {
			new VisaoTurma().setVisible(true);
			
		}
		
		//Método construtor da classe
		public VisaoTurma() {
			//Configuração do nome
			setTitle("Cadastro de turmas");
			setSize(400, 240);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setLocationRelativeTo(null);
			setLayout(null);
			
			//Configuração do Disciplina
			lblDisciplina.setBounds(10, 10, 200, 20);
			add(lblDisciplina);
			cboDisciplina.setBounds(10, 30, 465, 20);
			add(cboDisciplina);
			cboDisciplina.addItem("--- Selecione a Disciplina---");
			try {
				for (Disciplina objDisciplina : Disciplina.getTodos()) {
					cboDisciplina.addItem(objDisciplina.getNome());
				}
			}catch (Exception erro) {
				JOptionPane.showMessageDialog(null, erro);
			}
			//Configuração do Disciplina
			lblProfessor.setBounds(10, 60, 200, 20);
			add(lblProfessor);
			cboProfessor.setBounds(10, 80, 365, 20);
			add(cboProfessor);
			cboProfessor.addItem("--- Selecione o Professor---");
			try {
				for ( Professor objProfessor : Professor.getTodos()) {
					cboProfessor.addItem(objProfessor.getTitulacao() + objProfessor.getNome());
				}
			}catch (Exception erro) {
				JOptionPane.showMessageDialog(null, erro);
			}
			
			//Configuração Letra
			lblLetra.setBounds(10, 110, 200, 20);
			add(lblLetra);
			txtLetra.setBounds(10, 130, 30, 20);
			add(txtLetra);
			
			
			
			//Configuração do botão
			btnGravar.setBounds(20, 160, 100, 30);
			add(btnGravar);
			btnGravar.addActionListener(new ControladorGravar(cboDisciplina,cboProfessor, txtLetra));
		
			//btnGravar.addActionListener(new ControladorGravar(txtTitulo,cboAutor));
			
			
			btnLimpar.setBounds(140, 160, 100, 30);
			add(btnLimpar);
			btnLimpar.addActionListener(new ControladorLimpar(cboDisciplina,cboProfessor, txtLetra));
			
			btnSair.setBounds(260, 160, 100, 30);
			add(btnSair);
			btnSair.addActionListener(new ControladorSair());
			
		}
}