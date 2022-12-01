package Objetos;

import java.util.Scanner;

public class Sala2{
	protected int cofre;
	protected int llave;
	protected int diadema;
	protected int guante;
	

	public Sala2(int cofre, int llave, int diadema, int guante) {
		super();
		// TODO Auto-generated constructor stub
		this.cofre = cofre;
		this.llave = llave;
		this.diadema = diadema;
		this.guante = guante;
	}
	
	int coleccionable = Cofre.objetoAleatorio();
	
	public void haycofre() {
		if(Enemigo2.salud <= 0) {
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
				System.out.println("Has encontrado la diadema de Rowena Ravenclaw, di equipar para lucirla");
				Scanner scanner2 = new Scanner(System.in);
				String respuesta2 = scanner2.nextLine();
				scanner2.close();
				if (respuesta2 == "equipar") {
					System.out.println("Parece que brilla tanto que va a delatarte frente\nal enemigo"
							+ "mejor la guardo en mi mochila.");
				}
			}
			
			if (coleccionable == 1) {
				System.out.println("Has encontrado el poderoso guantelete de ezreal , di equipar para poder utilizarlo");
				Scanner scanner3 = new Scanner(System.in);
				String respuesta3 = scanner3.nextLine();
				scanner3.close();
				if (respuesta3 == "equipar") {
					System.out.println("¡Encaja perfectamente, parece que estuviera hecho para mi!\nahora"
							+ "sabran de lo que es bueno");
				}
			}
		
		}
		
			
	}
		
	
}
