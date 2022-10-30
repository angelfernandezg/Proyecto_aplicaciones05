package Ventanas;

import javax.swing.JFrame;
import javax.swing.JTable;

public class Inventario extends JFrame{

	public Inventario() {
		
		JTable tablaInventario = new JTable();
		
		this.setLocationRelativeTo(null);
		this.setSize(1200,600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(false);
	}
}

