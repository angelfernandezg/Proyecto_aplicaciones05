package Objetos;

public class Espada extends Arma implements acciones{

	protected static Boolean eequipado;
	protected static double daño = 1.5;	
	
	public static Boolean getEequipado() {
		return eequipado;
	}
	public static void setEequipado(Boolean eequipado) {
		Espada.eequipado = eequipado;
	}
	public double getDaño() {
		return daño;
	}
	public void setDaño(double daño) {
		Espada.daño = daño;
	}
	

}
