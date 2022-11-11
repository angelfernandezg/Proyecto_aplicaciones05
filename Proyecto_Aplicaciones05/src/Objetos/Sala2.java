package Objetos;

public class Sala2 extends Cofre{
	protected int cofre;
	protected int llave;
	protected int diadema;
	protected int guante;
	

	public Sala2(Boolean tieneLlave, int objeto, int cofre, int llave, int diadema, int guante) {
		super(tieneLlave, objeto);
		// TODO Auto-generated constructor stub
		this.cofre = cofre;
		this.llave = llave;
		this.diadema = diadema;
		this.guante = guante;
	}
	
	int objeto = objetoAleatorio();
	
	public void haycofre() {
		Cofre cofre1 = new Cofre(tieneLlave, cofre);
		cofre1.getObjeto();
		if (this.cofre == 1) {
			abrirCofre();
		}
		else {
			System.out.println("Parece que el cofre no está por aquí");
			}
		
		if (objeto == 1) {
			System.out.println("Has encontrado la diadema de Rowena Ravenclaw, di equipar para lucirla");
		}
		
		if (objeto == 1) {
			System.out.println("Has encontrado el poderoso guantelete de ezreal , di equipar para poder utilizarlo");
		}
	}
	
}
