package Ventanas;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TablaComandos extends JFrame{
	
	protected JTable tablacomandos;
	protected JScrollPane Scrollcomandos;

	public TablaComandos() {
		
		getContentPane().setLayout(null);
		
		String[] columnas = {"Comandos", "Explicacion"};
		
		Object[][] datos = {};
	
		JTable tablacomandos = new JTable(datos, columnas);
		JScrollPane scrollcomandos = new JScrollPane(tablacomandos);
		getContentPane().add(scrollcomandos);
		
		this.setLocationRelativeTo(null);
		this.setSize(1200,600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(false);
	}
}
