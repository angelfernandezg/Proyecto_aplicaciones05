package Ventanas;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
public class Inventario extends JFrame{

	public Inventario() {

		setTitle("Inventario");
		this.setSize(1200,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		String[] columnas = {"Objeto", "Clase", "Cantidad"};

		Object[][] datos = {};

		getContentPane().setLayout(getLayout());
		JTable tablainventario = new JTable(datos, columnas);
		JScrollPane scrollinventario = new JScrollPane(tablainventario);
		add(new JScrollPane(tablainventario), BorderLayout.CENTER);
		getContentPane().add(scrollinventario);	
	}
}