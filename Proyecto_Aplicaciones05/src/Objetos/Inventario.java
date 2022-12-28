package Objetos;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Inventario {
	
	public Objeto objeto;
	Object[][] matriz = new Object[3][9];
	

	for (int i = 0; i < matriz.length; i++) {
	  for (int j = 0; j < matriz[i].length; j++) {
	    matriz[i][j] = objeto;
	  }
	}

	JPanel panel = new JPanel();
	for (int y = 0; y < matriz.length; y++) {
	  for (int z = 0; z < matriz[y].length; z++) {
	    JLabel etiqueta = new JLabel();
	    etiqueta.setSize(10, 10);
	    etiqueta.setBackground(Color.GRAY);
	    etiqueta.setOpaque(true);
	    panel.add(etiqueta);
	  }
	}
}
