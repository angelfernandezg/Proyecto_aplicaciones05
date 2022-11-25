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
	
	public void recibir() {
		this.salud = this.salud - 3; //daño enemigo
	}

//	public void usarPocion(Consumible x) {
//	if (x = ) {
//		x; //accion de la pocion
//	}
//}
//

	
	public int getSalud() {
		return salud;
	}

	public void setSalud(int salud) {
		this.salud = salud;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	public ArrayList<Objeto> getInventario() {
		return inventario;
	}

	public void setInventario(ArrayList<Objeto> inventario) {
		this.inventario = inventario;
	}
	

	
}
