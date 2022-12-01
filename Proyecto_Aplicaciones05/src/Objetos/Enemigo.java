package Objetos;

public class Enemigo extends Cofre{
	
	protected static int salud = 100;
	protected int ataque = 15;
	protected int defensa;
	protected int Experiencia;
	
	
	public Enemigo(Boolean tieneLlave, int objeto, int salud, int ataque, int defensa, int experiencia) {
		super(tieneLlave, objeto);
		Enemigo.salud = salud;
		this.ataque = ataque;
		this.defensa = defensa;
		Experiencia = experiencia;
	}
	public int getSalud() {
		return salud;
	}
	public void setSalud(int salud) {
		Enemigo.salud = salud;
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
	public int getExperiencia() {
		return Experiencia;
	}
	public void setExperiencia(int experiencia) {
		Experiencia = experiencia;
	}
	
}
