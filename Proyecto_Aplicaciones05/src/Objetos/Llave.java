package Objetos;

public class Llave extends Objeto{
	
		protected static boolean llave;
		
		public Llave(boolean llave) {
			super();
			Llave.llave = llave;
		}
		
		
		
		public static boolean getLlave() {
			return llave;
		}



		public static void setLlave(boolean llave) {
			Llave.llave = llave;
		}
		
		public static void tengoLlave(boolean setLlave) {
			setLlave(false);
		}


		

		
	
}
