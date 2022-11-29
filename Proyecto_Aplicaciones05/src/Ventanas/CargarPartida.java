package Ventanas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CargarPartida extends JFrame{

	private static final long serialVersionUID = 1L;
	protected JTextField rutapartida;
	protected JButton aceptar;
	protected Log_in login;
	
	public CargarPartida() {
		
		login = new Log_in();
		
		getContentPane().setLayout(null);
		
		rutapartida = new JTextField("Introduce la ruta de tu partida");
		aceptar = new JButton("Aceptar");
		aceptar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				login.setVisible(true);
				
			}
		});
		
		rutapartida.setSize(300,100);
		aceptar.setSize(300,100);
		
		rutapartida.setLocation(275, 100);
		aceptar.setLocation(275, 250);
		
		getContentPane().add(rutapartida);
		getContentPane().add(aceptar);
		
		this.setTitle("Cargar Partida");
		this.setSize(800,400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(false);
		this.setLocationRelativeTo(null);
	}
}
