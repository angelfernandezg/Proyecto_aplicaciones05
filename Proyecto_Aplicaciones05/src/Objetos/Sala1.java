package Objetos;
import java.util.Scanner;

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
	}
		
		public void getInspecionarsala(inspeccionar I) {
			
			Scanner scanner = new Scanner(System.in);
			String respuesta = scanner.nextLine();
			scanner.close();
			if (respuesta == "i" | respuesta == "inspeccionar"){
				
				if (objeto == 1) {
					System.out.println("Has encontrado el libro de la leyenda de Ulises, di abrir para leerlo");
					Scanner scanner2 = new Scanner(System.in);
					String respuesta2 = scanner2.nextLine();
					scanner2.close();
					if (respuesta2 == "abrir") {
						System.out.println("Parece que me he dejado las gafas de leer en casa.\nUna pena"
								+ "no poder leer esta obra de arte, otra vez será.");
					}
					
				}
				
				if (objeto == 1) {
					System.out.println("Has encontrado el anillo único , di equipar para poder utilizarlo");
					Scanner scanner3 = new Scanner(System.in);
					String respuesta3 = scanner3.nextLine();
					scanner3.close();
					if (respuesta3 == "equipar") {
						System.out.println("Ya puedes usar el anillo");
						
						
					}	
				}
			}
				
		
		
	
	
	
	}
}
