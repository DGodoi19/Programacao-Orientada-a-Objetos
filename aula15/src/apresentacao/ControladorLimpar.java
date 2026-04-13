package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JTextField;

public class ControladorLimpar implements ActionListener {
	
	//Propriedades da classe
	private JComboBox<String> cboDisciplina = null;
	private JComboBox<String> cboProfessor = null;
	private JTextField txtLetra = null;
	//Métodos construtores da classe
	
	public ControladorLimpar(JComboBox<String> cboDisciplina, JComboBox<String> cboProfessor, JTextField txtLetra) {
		super();
		this.cboDisciplina = cboDisciplina;
		this.cboProfessor = cboProfessor;
		this.txtLetra = txtLetra;
	}

	//Métodos implementados da interface
	public void actionPerformed(ActionEvent e) {
		cboDisciplina.setSelectedIndex(0);
		cboProfessor.setSelectedIndex(0);
		txtLetra.setText("");
	}
	

}