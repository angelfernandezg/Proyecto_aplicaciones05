package Ventanas;

import javax.swing.JFrame;
import javax.swing.JTable;

	public class VentanaPuntuacion extends JFrame{
		

		private static final long serialVersionUID = 1L;

		public static void main(String[] args) {   
		
			JFrame puntuacion=new MarcoTabla() ;
		
			puntuacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
			puntuacion.setVisible(false) ;
			puntuacion.setLocationRelativeTo(null);
		
		}

	}

	class MarcoTabla extends JFrame {
	
		private static final long serialVersionUID = 1L;
	
		public MarcoTabla() {
	
	         setTitle("Puntuacion") ;
	         setBounds(200,200,800,400);
	         JTable tabla =new JTable(datosUsuarios, encabezadosColumnas) ;
	         
	         
	    }
	
		private String [] encabezadosColumnas={"Nick", "Puntuacion", "Tiempo"} ;
        private String [] [] datosUsuarios={};
        
	}
	
		
		
	
	

