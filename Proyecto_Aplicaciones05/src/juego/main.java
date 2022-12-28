package juego;

import javax.swing.*;
import Objetos.*;
import Ventanas.*;
import java.awt.*;
import java.awt.event.*;

public class main {
	System.out.println("Inspeccionar \n Abrir inventario");
	
	Personaje personaje = new Personaje();
	private Enemigo enemigo;
	Sala1 sala1 = new Sala1();
	Sala1 sala2 = new Sala2();
	Sala1 sala3 = new Sala3();
	Sala1 sala4 = new Sala4();
	static NuevaPartida nuevaspartida = new NuevaPartida();
	static JButton crearpartida = nuevapartida.getCrearpartida();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(crearpartida.isSelected()) {
			
			private JLabel etiqueta;
			private String texto = "Bienvenido al Templo de los Dioses Olvidados" + "\n"
			 + "Te encuentras en la sala principal, donde siempre puedes volver tras tus"
			 + "peleas y descansar, \n pero recuerda, este no es solo un juego de habilidad "
			 + "sino también de rapidez,\n así que recuerda no dormirte por los laureles";
			
			private int indice = 0;
			private Timer temporizador;
			  
			JFrame ventanajuego = new JFrame();
			
			ventanajuego.setLayout(null);
			ventanajuego.setBackground(java.awt.Color.black);
			ventanajuego.setSize(800, 400);
		    ventanajuego.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    ventanajuego.setVisible(true);
		    etiqueta = new JLabel();
		    add(etiqueta);
			etiqueta.setForeground(Color.white);
		    
		    // Creación del temporizador
		    temporizador = new Timer(100, new ActionListener() {
		      @Override
		      public void actionPerformed(ActionEvent e) {
		        if (indice < texto.length()) {
		          // Añade la siguiente letra al texto de la etiqueta
		          etiqueta.setText(etiqueta.getText() + texto.charAt(indice));
		          indice++;
		        } else {
		          // Detiene el temporizador
		          temporizador.stop();
		        }
		      }
		    });
		    temporizador.start();
		  }
		inicio()
	}

}
