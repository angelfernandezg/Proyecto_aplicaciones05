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
	protected JButton volver;
	protected Log_in login;
	protected VentanaInicial ventanainicial;
	
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
			
		volver = new JButton("Volver");
		volver.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ventanainicial.setVisible(true);
				CargarPartida.this.setVisible(false);
				
			}
		
		
		});
		
		rutapartida.setSize(300,100);
		aceptar.setSize(300,100);
		volver.setSize(120,40);
		
		rutapartida.setLocation(275, 100);
		aceptar.setLocation(275, 250);
		volver.setLocation(0,800);
		
		getContentPane().add(rutapartida);
		getContentPane().add(aceptar);
		getContentPane().add(volver);
		

		this.setTitle("Cargar Partida");
		this.setSize(800,400);
		this.setDefaultCloseOperation(HIDE_ON_CLOSE);
		this.setVisible(false);
		this.setLocationRelativeTo(null);
	}
}
