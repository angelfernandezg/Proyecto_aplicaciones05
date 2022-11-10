package Ventanas;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

public class InfoDeLaPartida extends JFrame{

	public InfoDeLaPartida() {
		
		getContentPane().setLayout(null);
		
		String[] columnasrecuento= {"Accion", "Cantidad"};
		Object[][] datosrecuento= {};
		
		String[] columnasacciones = {"Paso", "Realizado"};
		Object[][] datosacciones = {};
		
		JTabbedPane pestañas = new JTabbedPane();
		JTable recuento = new JTable(datosrecuento, columnasrecuento);
		JTable acciones = new JTable(datosacciones, columnasacciones);
		
		pestañas.add("Recuento", recuento);
		acciones.add("Acciones", acciones);
		
		this.setTitle("Informacion de la partida");
		this.setLocationRelativeTo(null);
		this.setSize(1200,600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(false);
	}
}
