package Objetos;

public class Enemigo4 extends Enemigo{

//Orco 
	protected double mazo = 2;
	
	public Enemigo4(Boolean tieneLlave, int objeto, int salud, int ataque, int defensa, int experiencia, double mazo) {
	super(tieneLlave, objeto, salud, ataque, defensa, experiencia);
	this.mazo = mazo;
}

	public double getMazo() {
		return mazo;
	}

	public void setMazo(double mazo) {
		this.mazo = mazo;
	}

	public void defender() {
		double recib4 = this.salud-Personaje.golpe*this.defensa;
	}
	public void atacar() {
		double ataq4 = this.ataque*this.mazo;
	}
}
