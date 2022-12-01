package Objetos;

public class Enemigo1 extends Enemigo{

//Elfo	
	protected double arco = 1.1;


	
	public Enemigo1(Boolean tieneLlave, int objeto, int salud, int ataque, int defensa, int experiencia, double arco) {
	super(tieneLlave, objeto, salud, ataque, defensa, experiencia);
	this.arco = arco;
}

	public double getArco() {
		return arco;
	}

	public void setArco(double arco) {
		this.arco = arco;
	}

	public void defender() {
		double recib1 = Enemigo1.salud-Personaje.golpe*this.defensa;
	}
	public void atacar() {
		double ataq1 = this.ataque*this.arco;
	}
	
}
