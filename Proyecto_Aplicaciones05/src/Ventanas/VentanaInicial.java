package Ventanas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame; 

public class VentanaInicial extends JFrame{
	
	private static final long serialVersionUID = 1L;
	protected JButton botonnuevapartida;
	protected JButton botoncargarpartida;
	protected NuevaPartida nuevapartida;
	protected CargarPartida cargarpartida;
	protected JButton botonpuntuacion;
	protected VentanaPuntuacion puntuacion;
	
	public VentanaInicial() {
		
		
		nuevapartida = new NuevaPartida();
		cargarpartida = new CargarPartida();
		puntuacion = new VentanaPuntuacion();
		
		getContentPane().setLayout(null);
		
		botonnuevapartida = new JButton("Nueva Partda");
		botonnuevapartida.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				nuevapartida.setVisible(true);
				VentanaInicial.this.setVisible(false);
				
				
			}
		});
		botoncargarpartida = new JButton("Cargar Partida");
		botoncargarpartida.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cargarpartida.setVisible(true);
				VentanaInicial.this.setVisible(false);
				
			}
		
		});
		botonpuntuacion = new JButton("Puntuacion");
		botonpuntuacion.addActionListener(new ActionListener() {

			
			@Override
			public void actionPerformed(ActionEvent e) {
				puntuacion.setVisible(true);
				VentanaInicial.this.setVisible(false);
				
			
				
			}
			
		});
		
		
		botonnuevapartida.setSize(200, 50);
		botoncargarpartida.setSize(200, 50);
		botonpuntuacion.setSize(200, 50);
		
		botonnuevapartida.setLocation(300, 80);
		botoncargarpartida.setLocation(300, 180);
		botonpuntuacion.setLocation(300, 280);
		
		getContentPane().add(botonnuevapartida);
		getContentPane().add(botoncargarpartida);
		getContentPane().add(botonpuntuacion);
		
		
		this.setTitle("Inicio");		
		this.setSize(800, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(false);
		this.setLocationRelativeTo(null);
		
		
	}
}
