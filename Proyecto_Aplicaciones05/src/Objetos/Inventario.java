package Objetos;

public class Inventario {
	
	private Objeto[][] objetos;
	
	public Inventario(int filas, int columnas) {
		objetos = new Objeto[4][3];
	}
	
	public void agregarObjeto(Objeto objeto, int fila, int columna) {
	    objetos[fila][columna] = objeto;
	  }
	
	 public void eliminarObjeto(int fila, int columna) {
		    objetos[fila][columna] = null;
		  }
}
		