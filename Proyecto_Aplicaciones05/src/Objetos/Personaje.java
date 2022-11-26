package Objetos;

import java.util.ArrayList;

public class Personaje {

	protected int salud = 100;
	protected int experiencia;
	protected int expfalta = 100 + nivel*10;
	public static int nivel;
	protected int ataque = 20 + nivel*10;
	protected int defensa = 20 + nivel*10;
	protected ArrayList<Objeto> inventario;
	public static double golpe;
	
	public void atacar() {
		if (Arco.aequipado) {
			golpe = this.ataque * Arco.daño;
		}else if (Espada.eequipado) {
			golpe = this.ataque * Espada.daño;
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
	public void sumExp(int exp) {
		experiencia = experiencia + exp;
		comprobarNivel(experiencia);
	}
	
	public String comprobarNivel(int exp) {
		if (exp >= expfalta) {
			nivel = nivel+1;
			exp = exp - expfalta;
			return "¡Has subido de nivel! Tu nivel ahora es: " + nivel;
		}else {
			int x = expfalta - exp;
			return "Te faltan" + x + "puntos de experiencia para subir de nivel";
		}
		
	}
	
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
	
	public double getGolpe() {
		return golpe;
	}

	public void setGolpe(double golpe) {
		Personaje.golpe = golpe;
	}
	
}
