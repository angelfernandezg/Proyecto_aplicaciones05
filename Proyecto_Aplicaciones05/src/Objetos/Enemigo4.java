package Objetos;

public class Enemigo4 extends Enemigo{

//Orco 
	protected int mazo;

	public Enemigo4(Boolean tieneLlave, int objeto, int salud, int ataque, int defensa, int experiencia, int mazo) {
		super(tieneLlave, objeto, salud, ataque, defensa, experiencia);
		this.mazo = mazo;
	}
	
}
