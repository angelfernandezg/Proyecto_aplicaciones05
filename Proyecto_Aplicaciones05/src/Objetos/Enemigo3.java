package Objetos;

public class Enemigo3 extends Enemigo{

//Zombie
	protected double mordida = 1.5;
	
	public Enemigo3(int salud, int ataque, int defensa, int experiencia, double mordida) {
	super(salud, ataque, defensa, experiencia);
	this.mordida = mordida;
}

	public double getMordida() {
		return mordida;
	}

	public void setMordida(double mordida) {
		this.mordida = mordida;
	}

	public void defender() {
		double recib3 = this.salud-Personaje.golpe*this.defensa;
	}
	public void atacar() {
		double ataq3 = this.ataque*this.mordida;
	}
}
