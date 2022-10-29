package Ventanas;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Log_in extends JFrame{

	protected JTextField usuario;
	protected JTextField contrasenya;
	
	public Log_in() {
		
		getContentPane().setLayout(null);
		
		usuario = new JTextField("Usuario");
		contrasenya = new JTextField("Contrasenya");
		
		usuario.setSize(200,50);
		contrasenya.setSize(200,50);
		
		usuario.setLocation(300,80);
		contrasenya.setLocation(300,180);
		
		getContentPane().add(usuario);
		getContentPane().add(contrasenya);
		
		this.setTitle("Log in");
		this.setLocationRelativeTo(null);
		this.setSize(800, 400);
		this.setDefaultCloseOperation(HIDE_ON_CLOSE);
		this.setVisible(false);
	}
	
}
