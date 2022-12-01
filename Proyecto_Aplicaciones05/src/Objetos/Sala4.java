package Objetos;

import java.util.Scanner;

public class Sala4 {
	protected int cofre;
	protected int llave;
	protected int libro;
	protected int guante;
	

	public Sala4(int cofre, int llave, int guante, int libro) {
		super();
		// TODO Auto-generated constructor stub
		this.cofre = cofre;
		this.llave = llave;
		this.libro = libro;
		this.guante = guante;
	}
	
	int coleccionable = Cofre.objetoAleatorio();
	
	public void haycofre() {
		if(Enemigo4.salud <= 0) {
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
					System.out.println("Has encontrado el libro de la leyenda de Troya, di abrir para leerlo");
					Scanner scanner2 = new Scanner(System.in);
					String respuesta2 = scanner2.nextLine();
					scanner2.close();
					if (respuesta2 == "leer") {
						System.out.println("Parece que como conquistaron los troyanos este libro esta "
								+ "escondido bajo un caballo. Ya averiguaremos lo entenderemos");
					}
				}
				
				if (coleccionable == 1) {
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
