package Ventanas;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel; 

public class VentanaInicial extends JFrame{

	protected JButton nuevapartida;
	protected JButton cargarpartida;
	
	public VentanaInicial() {
		
		getContentPane().setLayout(null);
		
		nuevapartida = new JButton("Nueva Partda");
		cargarpartida = new JButton("Cargar Partida");
		
		nuevapartida.setSize(200, 50);
		cargarpartida.setSize(200, 50);
		
		nuevapartida.setLocation(300, 80);
		cargarpartida.setLocation(300, 180);
		
		getContentPane().add(nuevapartida);
		getContentPane().add(cargarpartida);
		
		this.setTitle("Inicio");
		this.setLocationRelativeTo(null);
		this.setSize(800, 400);
		this.setDefaultCloseOperation(HIDE_ON_CLOSE);
		this.setVisible(false);
		
	}
}
