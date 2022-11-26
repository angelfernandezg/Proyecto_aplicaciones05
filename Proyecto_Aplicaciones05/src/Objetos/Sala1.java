package Objetos;
import java.util.Scanner;

public class Sala1 extends Enemigo  {
	
	protected int cofre;
	protected int llave;
	protected int libro;
	protected int anillo;
	

	public Sala1(Boolean tieneLlave, int objeto, int cofre, int llave, int libro, int anillo, int ataque, int salud, int defensa, int experiencia) {
		super(tieneLlave, objeto, ataque, salud, defensa, experiencia);
		// TODO Auto-generated constructor stub
		this.cofre = cofre;
		this.llave = llave;
		this.libro = libro;
		this.anillo = anillo;
	}
	
	
	int coleccionable = objetoAleatorio();
	
	public void haycofre() {
		if(salud <= 0) {
			Cofre cofre1 = new Cofre(tieneLlave, cofre);
			cofre1.getObjeto();
			if (this.cofre == 1) {
				abrirCofre();
			}
			else {
				System.out.println("Parece que el cofre no está por aquí");
				}
			
		}
		
	}
		
		public void getInspecionarsala(inspeccionar I) {
			
			System.out.println("Para ver que oculta esta sala di inspecionar o i");
			
			Scanner scanner = new Scanner(System.in);
			String respuesta = scanner.nextLine();
			scanner.close();
			if (respuesta == "i" | respuesta == "inspeccionar"){
				
				if (coleccionable == 1) {
					System.out.println("Has encontrado el libro de la leyenda de Ulises, di abrir para leerlo");
					Scanner scanner2 = new Scanner(System.in);
					String respuesta2 = scanner2.nextLine();
					scanner2.close();
					if (respuesta2 == "abrir") {
						System.out.println("Parece que me he dejado las gafas de leer en casa.\nUna pena"
								+ "no poder leer esta obra de arte, otra vez será.");
					}
					
				}
				
				if (coleccionable == 1) {
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
