package Objetos;
import java.util.Random;

public class Cofre extends Objeto {
	public static void main(String[] args) {
		
		objetoAleatorio();
		

	}
	protected Boolean tieneLlave;
	protected int objeto;
	
	public Boolean getTieneLlave() {
		return tieneLlave;
	}

	public void setTieneLlave(Boolean tieneLlave) {
		this.tieneLlave = tieneLlave;
	}

	public int getObjeto() {
		return objeto;
	}

	public void setObjeto(int objeto) {
		this.objeto = objeto;
	}
	
	public Cofre(Boolean tieneLlave, int objeto) {
		super();
		this.tieneLlave = tieneLlave;
		this.objeto = objeto;
	}

	static Random random = new Random();
	public static int objetoAleatorio() {	
		int x = random.nextInt(2);
		random.nextInt();
		if (x==0) {
//			sumPocCur();
		}
		if (x==1) {
//			sumPocAtac();
		}
		return x;
	}
	
	public String abrirCofre() {
		if (this.tieneLlave == true) {
			int o = objetoAleatorio();
			System.out.println("¡Enhorabuena, has abierto el cofre!");
			if (o==0) {
				System.out.println("Has obtenido una poción de curación");
			}else {
				System.out.println("Has obtenido una poción de ataque");
			}
		}else {
			return "Lo siento, pero no tienes la llave para abrir el cofre";
		}
	}

}
