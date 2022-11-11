package Objetos;

public class Sala3 extends Cofre{
	protected int cofre;
	protected int llave;
	protected int capa;
	protected int espadayoda;
	protected int guante;
	

	public Sala3(Boolean tieneLlave, int objeto, int cofre, int llave, int capa, int espadayoda) {
		super(tieneLlave, objeto);
		// TODO Auto-generated constructor stub
		this.cofre = cofre;
		this.llave = llave;
		this.capa = capa;
		this.espadayoda = espadayoda;
	}
	
	int objeto = objetoAleatorio();
	
	public void haycofre() {
		Cofre cofre1 = new Cofre(tieneLlave, cofre);
		cofre1.getObjeto();
		if (this.cofre == 1) {
			abrirCofre();
		}
		else {
			System.out.println("Parece que el cofre no se encuentra por aquí");
			}
		
		if (objeto == 1) {
			System.out.println("Has encontrado la capa de superman, di equipar para lucirla");
		}
		
		if (objeto == 1) {
			System.out.println("Has encontrado la espada de el maestro jedi Yoda  , di equipar para poder utilizarlo");
		}
	}
	
}
