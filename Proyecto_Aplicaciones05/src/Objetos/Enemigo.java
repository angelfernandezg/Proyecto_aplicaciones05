package Objetos;

public class Enemigo extends Cofre{
	
	protected int salud;
	protected int ataque;
	protected int defensa;
	protected int Experiencia;
	
	public Enemigo(Boolean tieneLlave, int objeto, int salud, int ataque, int defensa, int experiencia) {
		super(tieneLlave, objeto);
		this.salud = salud;
		this.ataque = ataque;
		this.defensa = defensa;
		Experiencia = experiencia;
	}
	
}
