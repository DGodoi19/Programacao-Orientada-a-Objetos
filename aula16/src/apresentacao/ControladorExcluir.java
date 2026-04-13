package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JList;
import javax.swing.JOptionPane;

import negocio.Compra;

public class ControladorExcluir implements ActionListener {
	//propriedades da classe
	private JList<String> lstCompra = null;
	
	public ControladorExcluir(JList<String> lstCompra) {
		super();
		this.lstCompra = lstCompra;
	}

	public void actionPerformed(ActionEvent e) {
		try {
			Compra.getTodos().get(lstCompra.getSelectedIndex()).despersisir();
			JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!");
			
		}catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro);
		}
		
	}

}
