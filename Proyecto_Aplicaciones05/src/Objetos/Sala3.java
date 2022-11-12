package Objetos;

import java.util.Scanner;

public class Sala3 extends Cofre implements inspeccionar{
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
	}
		
		public void getInspecionarsala(inspeccionar I) {
			
			Scanner scanner = new Scanner(System.in);
			String respuesta = scanner.nextLine();
			scanner.close();
			if (respuesta == "i" | respuesta == "inspeccionar"){
				if (objeto == 1) {
					System.out.println("Has encontrado la capa de superman, di equipar para lucirla");
					Scanner scanner2 = new Scanner(System.in);
					String respuesta2 = scanner2.nextLine();
					scanner2.close();
					if (respuesta2 == "equipar") {
						System.out.println("¡Qué bien queda me la voy a quedar! Aparte seguro que da fps extra.");
					}
				}
				
				if (objeto == 1) {
					System.out.println("Has encontrado la espada de el maestro jedi Yoda  , di equipar para poder utilizarlo");
					Scanner scanner3 = new Scanner(System.in);
					String respuesta3 = scanner3.nextLine();
					scanner3.close();
					if (respuesta3 == "equipar") {
						System.out.println("Parece muy inestable, mejor la guardo y ya aprenderé a usarla\nmás adelante,"
								+ "cuando no halla tanto peligro.");
					}
				}
			}
				
	}
	
}
