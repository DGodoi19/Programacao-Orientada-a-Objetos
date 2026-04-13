package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import negocio.Pessoa;
import negocio.Uf;

public class ControladorGravar implements ActionListener {
//Propriedades da classe
	private JTextField txtNome = null;
	private JRadioButton optMasculino = null;
	private JRadioButton optFeminino= null;
	private JTextField txtEndereco= null;
	private JComboBox<String> cboUf = null;
	
	//Método construtor cheio 
	
	

	public ControladorGravar(JTextField txtNome, JRadioButton optMasculino, JRadioButton optFeminino,
			JTextField txtEndereco, JComboBox<String> cboUf) {
		super();
		this.txtNome = txtNome;
		this.optMasculino = optMasculino;
		this.optFeminino = optFeminino;
		this.txtEndereco = txtEndereco;
		this.cboUf = cboUf;
	}

	public void actionPerformed(ActionEvent e) {
		//Crítica de dados
		if (txtNome.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Campo nome obrigatório!");
			return;
		}
		if (txtEndereco.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Campo endereço obrigatório!");
			return;
		}
		if (cboUf.getSelectedIndex() == 0){
			JOptionPane.showMessageDialog(null, "Campo uf obrigatório!");
			return;
		}
		//Gravação propriamente dita
		Pessoa objPessoa = new Pessoa();
		objPessoa.setNome(txtNome.getText());
		objPessoa.setSexo(optMasculino.isSelected() ? "Masculino": optFeminino.isSelected() ? "Feminino" : "Não Informado");
		objPessoa.setEndereco(txtEndereco.getText());
		objPessoa.setObjUf(new Uf(cboUf.getSelectedItem().toString()));
		
		JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso\n\n"+ 
											"Nome: " + objPessoa.getNome()+"\n" + 
											"Sexo: " +objPessoa.getSexo() +"\n"+
											"Endereço: " +objPessoa.getEndereco() +"\n"+
											"UF: " + objPessoa.getObjUf().getSigla());
	}
}
