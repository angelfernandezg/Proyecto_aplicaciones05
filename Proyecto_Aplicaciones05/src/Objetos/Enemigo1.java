package Objetos;

public class Enemigo1 extends Enemigo{

//Elfo	
	protected int arco;

	public Enemigo1(Boolean tieneLlave, int objeto, int salud, int ataque, int defensa, int experiencia, int arco) {
		super(tieneLlave, objeto, salud, ataque, defensa, experiencia);
		this.arco = arco;
	}
	
	
}
