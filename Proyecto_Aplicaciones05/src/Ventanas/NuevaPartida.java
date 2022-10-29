package Ventanas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class NuevaPartida extends JFrame{

	protected JTextField nombre;
	protected JTextField contrasenya;
	protected JTextField carpetaguardado;
	protected JButton crearpartida;
	
	public NuevaPartida() {
		
		getContentPane().setLayout(null);
		
		nombre = new JTextField("Introduzca el nombre");
		nombre.setSize(200,50);
		contrasenya = new JTextField("Introduzca una contrasenya");
		contrasenya.setSize(200,50);
		carpetaguardado = new JTextField("Introduzca la carpeta en la que desea guardar sus datos de partida");
		carpetaguardado.setSize(200,50);
		crearpartida = new JButton("Crear partida");
		crearpartida.setSize(200,50);
		
		nombre.setLocation(400,100);
		contrasenya.setLocation(400,220);
		carpetaguardado.setLocation(400,360);
		crearpartida.setLocation(400,480);
		
		getContentPane().add(nombre);
		getContentPane().add(contrasenya);
		getContentPane().add(carpetaguardado);
		getContentPane().add(crearpartida);
		
		this.setTitle("Crear Partida");
		this.setLocationRelativeTo(null);
		this.setSize(1200,600);
		this.setDefaultCloseOperation(HIDE_ON_CLOSE);
		this.setVisible(false);
	}
}
