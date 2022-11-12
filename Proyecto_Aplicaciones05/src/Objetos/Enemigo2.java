package Objetos;

public class Enemigo2 extends Enemigo{

//Esqueleto
	protected int espada;

	public Enemigo2(Boolean tieneLlave, int objeto, int salud, int ataque, int defensa, int experiencia, int espada) {
		super(tieneLlave, objeto, salud, ataque, defensa, experiencia);
		this.espada = espada;
	}
	
}
