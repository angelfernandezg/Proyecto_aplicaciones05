package Objetos;

public class Sala4 extends Cofre{
	protected int cofre;
	protected int llave;
	protected int libro;
	protected int guante;
	

	public Sala4(Boolean tieneLlave, int objeto, int cofre, int llave, int libro, int guante) {
		super(tieneLlave, objeto);
		// TODO Auto-generated constructor stub
		this.cofre = cofre;
		this.llave = llave;
		this.libro = libro;
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
			System.out.println("Has encontrado el libro de la leyenda de Troya, di abrir para leerlo");
		}
		
		if (objeto == 1) {
			System.out.println("Has encontrado los guante de Freddy Krueger , di equipar para poder utilizarlo");
		}
	}
	
}
