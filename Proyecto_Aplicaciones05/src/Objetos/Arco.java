package Objetos;

public class Arco extends Arma{

	protected Boolean cargado;
	protected static Boolean aequipado;
	protected static double daño = 1.25;
	
	public String recargar() {
		if (this.cargado == false) {
			this.cargado = true;
			return "Recargas";
		} else {
			return "Ya esta cargado";
		}
	}

	public Boolean getCargado() {
		return cargado;
	}

	public void setCargado(Boolean cargado) {
		this.cargado = cargado;
	}

	public Boolean getEquipado() {
		return aequipado;
	}

	public void setEquipado(Boolean equipado) {
		Arco.aequipado = equipado;
	}

	public double getDaño() {
		return daño;
	}

	public void setDaño(double daño) {
		Arco.daño = daño;
	}
}
