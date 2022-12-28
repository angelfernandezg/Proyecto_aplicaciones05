package Ventanas;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Inventario extends JFrame{
	
	protected JTable tablainventario;
	protected JScrollPane scrollinventario;

	public Inventario() {
		
		String[] columnas = {"Objeto", "Clase", "Cantidad"};
		
		Object[][] datos = {};
		
		getContentPane().setLayout(getLayout());
		JTable tablainventario = new JTable(datos, columnas);
		
		JScrollPane scrollinventario = new JScrollPane(tablainventario);
		
		getContentPane().add(scrollinventario);
		
		this.setLocationRelativeTo(null);
		this.setSize(1200,600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(false);
	}
}