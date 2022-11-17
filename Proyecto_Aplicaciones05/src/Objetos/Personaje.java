package Objetos;

import java.util.ArrayList;

public class Personaje {

	protected int salud = 100;
	protected int experiencia = 0;
	protected int ataque = 20;
	protected int defensa = 20;
	protected ArrayList<Objeto> inventario;
	
	public void atacar() {
		if (Arco.aequipado) {
			double golpe = this.ataque + Arco.daño;
		}else if (Espada.eequipado) {
			double golpe = this.ataque + Espada.daño;
		}
	}
	
	
}
