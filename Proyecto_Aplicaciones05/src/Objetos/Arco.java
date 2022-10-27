package Objetos;

public class Arco extends Arma{

	protected Boolean cargado;
	
	public String recargar() {
		if (this.cargado == false) {
			this.cargado = true;
			return "Recargas";
		} else {
			return "Ya esta cargado";
		}
	}
}
