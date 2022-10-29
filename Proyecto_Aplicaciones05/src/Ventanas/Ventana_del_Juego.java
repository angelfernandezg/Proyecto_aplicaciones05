package Ventanas;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ventana_del_Juego extends JFrame{

	protected JButton inventario;
	protected JButton mapa;
	protected JButton personaje;
	protected JButton tablacomandos;
	
	public Ventana_del_Juego() {
		
		getContentPane().setLayout(null);
		
		inventario = new JButton("");
		mapa = new JButton("");
		personaje = new JButton("");
		tablacomandos = new JButton("");
		
		inventario.setSize(30,30);
		mapa.setSize(30,30);
		personaje.setSize(30,30);
		tablacomandos.setSize(30,30);
		
		inventario.setLocation(1450,60);
		mapa.setLocation(1480,60);
		personaje.setLocation(1510,60);
		tablacomandos.setLocation(1540,60);
		
		getContentPane().add(inventario);
		getContentPane().add(mapa);
		getContentPane().add(personaje);
		getContentPane().add(tablacomandos);
		
		this.setTitle("Ventana_del_Juego");
		this.setLocationRelativeTo(null);
		this.setSize(1600, 800);
		this.setDefaultCloseOperation(HIDE_ON_CLOSE);
		this.setVisible(false);
	}
}
