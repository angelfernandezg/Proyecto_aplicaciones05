package Ventanas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Log_in extends JFrame{

	protected JTextField usuario;
	protected JTextField contrasenya;
	protected JButton aceptar;
	protected Ventana_del_Juego ventanadeljuego;
	
	public Log_in() {
		
		ventanadeljuego = new Ventana_del_Juego();
		
		getContentPane().setLayout(null);
		
		usuario = new JTextField("Usuario");
		contrasenya = new JTextField("Contrasenya");
		aceptar = new JButton("Aceptar");
		aceptar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ventanadeljuego.setVisible(true);
			}
		});
		
		usuario.setSize(200,50);
		contrasenya.setSize(200,50);
		aceptar.setSize(100,50);
		
		usuario.setLocation(300,275);
		contrasenya.setLocation(600,275);
		aceptar.setLocation(900,275);
		
		getContentPane().add(usuario);
		getContentPane().add(contrasenya);
		
		this.setTitle("Log in");
		this.setLocationRelativeTo(null);
		this.setSize(1200, 600);
		this.setDefaultCloseOperation(HIDE_ON_CLOSE);
		this.setVisible(false);
	}
	
}
