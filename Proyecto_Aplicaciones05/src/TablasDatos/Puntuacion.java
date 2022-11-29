package TablasDatos;


import java.util.ArrayList;
import javax.swing.JTable;

public class Puntuacion extends JTable {
	
	
	private static final long serialVersionUID = 1L;
	protected JTable tablapuntos;
	ArrayList<String> puntos = new ArrayList<String>();
	
	
	public Puntuacion (){
		
	}


	
	public void tablapuntos(JTable tablapuntos) {
		this.tablapuntos = tablapuntos;
	}

}
