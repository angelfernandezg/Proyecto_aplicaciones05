package Objetos;

public class Enemigo3 extends Enemigo{

//Zombie
	protected int mordida;

	public Enemigo3(Boolean tieneLlave, int objeto, int salud, int ataque, int defensa, int experiencia, int mordida) {
		super(tieneLlave, objeto, salud, ataque, defensa, experiencia);
		this.mordida = mordida;
	}
	
}
