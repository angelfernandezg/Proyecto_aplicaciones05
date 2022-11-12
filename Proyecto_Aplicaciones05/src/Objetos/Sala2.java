package Objetos;

import java.util.Scanner;

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
		}

	
	public void getInspecionarsala(inspeccionar I) {
		
		Scanner scanner = new Scanner(System.in);
		String respuesta = scanner.nextLine();
		scanner.close();
		if (respuesta == "i" | respuesta == "inspeccionar"){
			
			
			if (objeto == 1) {
				System.out.println("Has encontrado la diadema de Rowena Ravenclaw, di equipar para lucirla");
				Scanner scanner2 = new Scanner(System.in);
				String respuesta2 = scanner2.nextLine();
				scanner2.close();
				if (respuesta2 == "equipar") {
					System.out.println("Parece que brilla tanto que va a delatarte frente\nal enemigo"
							+ "mejor la guardo en mi mochila.");
				}
			}
			
			if (objeto == 1) {
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
