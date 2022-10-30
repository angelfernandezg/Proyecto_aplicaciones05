package Ventanas;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel; 

public class VentanaInicial extends JFrame{

	protected JButton botonnuevapartida;
	protected JButton botoncargarpartida;
	protected NuevaPartida nuevapartida;
	protected CargarPartida cargarpartida;
	
	public VentanaInicial() {
		
		nuevapartida = new NuevaPartida();
		cargarpartida = new CargarPartida();
		
		getContentPane().setLayout(null);
		
		botonnuevapartida = new JButton("Nueva Partda");
		botonnuevapartida.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				nuevapartida.setVisible(true);
			}
		});
		botoncargarpartida = new JButton("Cargar Partida");
		botoncargarpartida.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cargarpartida.setVisible(true);
			}
		});
		
		botonnuevapartida.setSize(200, 50);
		botoncargarpartida.setSize(200, 50);
		
		botonnuevapartida.setLocation(300, 80);
		botoncargarpartida.setLocation(300, 180);
		
		getContentPane().add(botonnuevapartida);
		getContentPane().add(botoncargarpartida);
		
		this.setTitle("Inicio");
		this.setLocationRelativeTo(null);
		this.setSize(800, 400);
		this.setDefaultCloseOperation(HIDE_ON_CLOSE);
		this.setVisible(false);
		
	}
}
