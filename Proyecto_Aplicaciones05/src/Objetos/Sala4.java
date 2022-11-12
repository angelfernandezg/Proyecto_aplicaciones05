package Objetos;

import java.util.Scanner;

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
	}
		
		
		public void getInspecionarsala(inspeccionar I) {
			
			Scanner scanner = new Scanner(System.in);
			String respuesta = scanner.nextLine();
			scanner.close();
			if (respuesta == "i" | respuesta == "inspeccionar"){
				if (objeto == 1) {
					System.out.println("Has encontrado el libro de la leyenda de Troya, di abrir para leerlo");
					Scanner scanner2 = new Scanner(System.in);
					String respuesta2 = scanner2.nextLine();
					scanner2.close();
					if (respuesta2 == "leer") {
						System.out.println("Parece que como conquistaron los troyanos este libro esta "
								+ "escondido bajo un caballo. Ya averiguaremos lo entenderemos");
					}
				}
				
				if (objeto == 1) {
					System.out.println("Has encontrado los guante de Freddy Krueger , di equipar para poder utilizarlo");
					Scanner scanner3 = new Scanner(System.in);
					String respuesta3 = scanner3.nextLine();
					scanner3.close();
					if (respuesta3 == "equipar") {
						System.out.println("Parecen peligrosas. ¡Qué bien ya no se me acercarán");
					}
				}
			}
		
		
	}
	
}
