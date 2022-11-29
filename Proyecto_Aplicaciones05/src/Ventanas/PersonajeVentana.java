package Ventanas;

import javax.swing.JFrame;

public class PersonajeVentana extends JFrame{

	public PersonajeVentana () {
		
		
		this.setLocationRelativeTo(null);
		this.setSize(1200,600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(false);
	}
}
