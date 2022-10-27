package Ventanas;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class CargarPartida extends JFrame{

	protected JTextField rutapartida;
	
	public CargarPartida() {
		
		getContentPane().setLayout(null);
		
		rutapartida = new JTextField("Introduce la ruta de tu partida");
		rutapartida.setSize(300,100);
		
		rutapartida.setLocation(275, 100);
		
		getContentPane().add(rutapartida);
		
		this.setTitle("Cargar Partida");
		this.setLocationRelativeTo(null);
		this.setSize(800,400);
		this.setDefaultCloseOperation(HIDE_ON_CLOSE);
		this.setVisible(false);
	}
}
