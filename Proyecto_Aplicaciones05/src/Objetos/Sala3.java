package Objetos;

import java.util.Scanner;

public class Sala3 {
	protected int cofre;
	protected int llave;
	protected int capa;
	protected int espadayoda;
	protected int guante;
	

	public Sala3(int cofre, int llave, int guante, int espadayoda) {
		super();
		// TODO Auto-generated constructor stub
		this.cofre = cofre;
		this.llave = llave;
		this.espadayoda = espadayoda;
		this.guante = guante;
	}
	
	int coleccionable = Cofre.objetoAleatorio();
	
	
	public void haycofre() {
		if(Enemigo3.salud <= 0) {
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
					System.out.println("Has encontrado la capa de superman, di equipar para lucirla");
					Scanner scanner2 = new Scanner(System.in);
					String respuesta2 = scanner2.nextLine();
					scanner2.close();
					if (respuesta2 == "equipar") {
						System.out.println("¡Qué bien queda me la voy a quedar! Aparte seguro que da fps extra.");
					}
				}
				
				if (coleccionable == 1) {
					System.out.println("Has encontrado la espada de el maestro jedi Yoda  , di equipar para poder utilizarlo");
					Scanner scanner3 = new Scanner(System.in);
					String respuesta3 = scanner3.nextLine();
					scanner3.close();
					if (respuesta3 == "equipar") {
						System.out.println("Parece muy inestable, mejor la guardo y ya aprenderé a usarla\nmás adelante,"
								+ "cuando no halla tanto peligro.");
					}
				}
				if (Personaje.getSalud() > 0) {
					Llave.tengoLlave(true);
					System.out.println("Has encontardo la llave, ya la puedes ver en tu inventario");
				}
			}
				
	}
	
}
