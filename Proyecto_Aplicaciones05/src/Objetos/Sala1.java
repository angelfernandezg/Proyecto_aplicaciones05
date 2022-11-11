package Objetos;

public class Sala1 extends Cofre  {
	
	protected int cofre;
	protected int llave;
	protected int libro;
	protected int anillo;
	

	public Sala1(Boolean tieneLlave, int objeto, int cofre, int llave, int libro, int anillo) {
		super(tieneLlave, objeto);
		// TODO Auto-generated constructor stub
		this.cofre = cofre;
		this.llave = llave;
		this.libro = libro;
		this.anillo = anillo;
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
			System.out.println("Has encontrado el libro de la leyenda de Ulises, di abrir para leerlo");
		}
		
		if (objeto == 1) {
			System.out.println("Has encontrado el anillo único , di equipar para poder utilizarlo");
		}
	}
	
	
	
	
}
