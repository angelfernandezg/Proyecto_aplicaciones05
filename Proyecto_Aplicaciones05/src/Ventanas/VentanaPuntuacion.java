package Ventanas;

import java.awt.BorderLayout;
import java.util.ArrayList;


import javax.swing.JFrame;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import TablasDatos.Puntuacion;


	public class VentanaPuntuacion extends JFrame{
		
		public ArrayList<String> nick = Puntuacion.getNick();
		public ArrayList<Integer> puntos = Puntuacion.getPuntos();
		public ArrayList<Long> tiempo = Puntuacion.getTiempo();

		private static final long serialVersionUID = 1L;

		public static void main(String[] args) {   
			
			JFrame puntuacion=new JFrame() ;
		
			puntuacion.setDefaultCloseOperation(HIDE_ON_CLOSE);
			puntuacion.setVisible(false) ;
			puntuacion.setTitle("Puntuacion");
	        puntuacion.setSize(800,400);
	        puntuacion.setLocationRelativeTo(null);
		}

	}

	class PPartida extends JFrame {
	
		private static final long serialVersionUID = 1L;
		Object[] columnNames = {"Nick", "Puntuación", "Tiempo"};
	    private Object [][] cells = {
	    		 {"Paco", 3455, "10:23"},			 
	    };
		public PPartida() {

			TableModel model = new DefaultTableModel(cells, columnNames);
	        JTable table = new JTable (model);
	        add(table.getTableHeader(), BorderLayout.PAGE_START);
	        add(table, BorderLayout.CENTER);
	        setLayout(new BorderLayout());
	        setVisible(true);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	         
		}
	     
	 }
	         
	         
	
	
		 
        	
        
        
        
	
	

             
	    
	
		
		
	
	

