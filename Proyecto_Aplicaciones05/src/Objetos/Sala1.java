package Objetos;
import java.util.Scanner;

public class Sala1 {
	
	protected int cofre;
	protected int llave;
	protected int libro;
	protected int anillo;
	

	public Sala1(int cofre, int llave, int libro, int anillo) {
		super();
		// TODO Auto-generated constructor stub
		this.cofre = cofre;
		this.llave = llave;
		this.libro = libro;
		this.anillo = anillo;
	}
	
	
	int coleccionable = Cofre.objetoAleatorio();
	
	public void haycofre() {
		if(Enemigo1.salud <= 0) {
			Cofre cofre1 = new Cofre(Cofre.tieneLlave, cofre);
			cofre1.getObjeto();
			if (this.cofre == 1) {
				Cofre.abrirCofre();
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
						System.out.println("Parece que me he dejado las gafas de leer en casa.\nUna pena "
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
		
		public void inicio() {
			System.out.println("Te adentras en las profundidades de la mazmorra. Actualmente te encuentras en la primera sala. ¿Que te gustaría hacer?");
			primeraSala();
		}
		public void primeraSala() {
			System.out.println("Inspeccionar \n Inventario");
			Scanner scanner4 = new Scanner(System.in);
			String respuesta4 = scanner4.nextLine();
			if (respuesta4 == "Inspeccionar") {
				System.out.println("Delante \n Derecha \n Izquierda");
				Scanner scanner5 = new Scanner(System.in);
				String respuesta5 = scanner5.nextLine();
				if (respuesta5 == "Delante") {
					System.out.println("x");
				}
				else if (respuesta5 == "Derecha") {
					System.out.println("x");
				}
				else if (respuesta5 == "Izquierda") {
					System.out.println("x");
				}
			}
			else if (respuesta4 == "Inventario") {
				
			}
		}

		private void elif(boolean b) {
			// TODO Auto-generated method stub
			
		}
		
}
