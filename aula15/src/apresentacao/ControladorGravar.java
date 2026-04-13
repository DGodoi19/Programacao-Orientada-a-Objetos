package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import negocio.Disciplina;
import negocio.Professor;
import negocio.Turma;


public class ControladorGravar implements ActionListener {
	//Propriedades da classe
	private JComboBox<String> cboDisciplina= null;
	private JComboBox<String> cboProfessor = null;
	private JTextField txtLetra = null;
	//Método construtor cheio da classe
	public ControladorGravar(JComboBox<String> cboDisciplina, JComboBox<String> cboProfessor, JTextField txtLetra) {
		super();
		this.cboDisciplina = cboDisciplina;
		this.cboProfessor = cboProfessor;
		this.txtLetra = txtLetra;
	}
	//Método implementado da interface
	


	public void actionPerformed(ActionEvent e) {
		if(cboDisciplina.getSelectedIndex()==0) {
			JOptionPane.showMessageDialog(null, "Disciplina Obrigatória");
			return;
		}
		if(cboProfessor.getSelectedIndex()==0) {
			JOptionPane.showMessageDialog(null, "Professor Obrigatório");
			return;
		}
		if(txtLetra.getText().equals("")) {
			JOptionPane.showMessageDialog(null,"Letra Obrigatória");
			return;
		}try {
			Turma objTurma = new Turma();
			
			objTurma.setObjDisciplina((Disciplina)Disciplina.getTodos().toArray()[cboDisciplina.getSelectedIndex()-1]);
			objTurma.setObjProfessor((Professor)Professor.getTodos().toArray()[cboProfessor.getSelectedIndex()-1]);
			objTurma.setLetra(txtLetra.getText());
			
			
			
			objTurma.persistir();
			JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!");
		}catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro);
		}
	}
	

}