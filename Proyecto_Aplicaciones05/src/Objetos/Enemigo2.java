package Objetos;

public class Enemigo2 extends Enemigo{

//Esqueleto
	protected double espada = 1.3;

	
	
	public Enemigo2(Boolean tieneLlave, int objeto, int salud, int ataque, int defensa, int experiencia, double espada) {
	super(tieneLlave, objeto, salud, ataque, defensa, experiencia);
	this.espada = espada;
}

	public double getEspada() {
		return espada;
	}

	public void setEspada(double espada) {
		this.espada = espada;
	}

	public void defender() {
		double recib2 = this.salud-Personaje.golpe*this.defensa;
	}
	public void atacar() {
		double ataq2 = this.ataque*this.espada;
	}
}
