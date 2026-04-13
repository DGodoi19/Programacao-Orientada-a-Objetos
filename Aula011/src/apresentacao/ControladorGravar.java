package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import negocio.Produto;
import negocio.Tipo;

public class ControladorGravar implements ActionListener {
	//Propriedades da classe
	private JTextField txtNome = null;
	private JTextField txtPreco = null;
	private JComboBox<String> cboTipo = null;
	private JCheckBox chkPerecivel = null;
	private JTextArea txtDetalhamento = null;

	//Métodos construtores da classe
	
	public ControladorGravar(JTextField txtNome, JTextField txtPreco, JComboBox<String> cboTipo, JCheckBox chkPerecivel,
			JTextArea txtDetalhamento) {
		super();
		this.txtNome = txtNome;
		this.txtPreco = txtPreco;
		this.cboTipo = cboTipo;
		this.chkPerecivel = chkPerecivel;
		this.txtDetalhamento = txtDetalhamento;
	}



	public void actionPerformed(ActionEvent e) {
		if (txtNome.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Campo nome obrigatório !");
			return;
		}
		if (txtPreco.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Campo nome obrigatório !");
			return;
		}
		try {
			Double.parseDouble(txtPreco.getText());
			
		}catch (Exception erro){
			JOptionPane.showMessageDialog(null, "Campo deve" + "ser numérico !");
		}
		if  (cboTipo.getSelectedIndex()==0) {
			JOptionPane.showMessageDialog(null, "Campo Tipo obrigatório !");
			return;
			
		}
		if (txtDetalhamento.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Campo detalhamento obrigatório !");
			return;
		}
		
		//Composição do objeto
		Produto objProduto = new Produto();
		objProduto.setNome(txtNome.getText());
		objProduto.setPreco(Double.parseDouble( txtPreco.getText()));
		objProduto.setObjTipo(new Tipo(cboTipo.getSelectedItem().toString()));
		objProduto.setPerecivel(chkPerecivel.isSelected());
		objProduto.setDetalhamento(txtDetalhamento.getText());
		
		JOptionPane.showMessageDialog(null, 
		"Gravação realizada com sucesso !\n\n" +
		"Nome: " + objProduto.getNome() + "\n" +
		"Preço: R$ " + objProduto.getPreco() + "\n" +
		"Tipo: " + objProduto.getObjTipo().getDescricao() + "\n" +
		"Perecível: " + (objProduto.isPerecivel()? "Sim" : "Não") + "\n" +
		"Detalhamento: " + objProduto.getDetalhamento());
		
		
		
		

	}

}
