package Ventanas;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

public class InfoDeLaPartida extends JFrame{

	public InfoDeLaPartida() {
		
		JTabbedPane pestañas = new JTabbedPane();
		JTable recuento = new JTable();
		JTable acciones = new JTable();
		
		pestañas.add("Recuento", recuento);
		acciones.add("Acciones", acciones);
		
		this.setTitle("Informacion de la partida");
		this.setLocationRelativeTo(null);
		this.setSize(1200,600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(false);
	}
}
