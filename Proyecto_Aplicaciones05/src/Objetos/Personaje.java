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
			public double golpe = this.ataque + Arco.daño;
		}else if (Espada.eequipado) {
			public double golpe = this.ataque + Espada.daño;
		}
	}
	
	public void recibir() {
		this.salud = this.salud - 3; //daño enemigo
	}
	
//	public void usarPocion(Consumible x) {
//		if (x = ) {
//			x; //accion de la pocion
//		}
//	}
//	
	
}
