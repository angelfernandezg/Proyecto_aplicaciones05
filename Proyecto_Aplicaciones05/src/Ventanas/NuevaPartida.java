package Ventanas;




import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class NuevaPartida extends JFrame{

	private static final long serialVersionUID = 1L;
	protected JTextField nombre;
	protected JTextField contrasenya;
	protected JTextField carpetaguardado;
	protected JButton crearpartida;
	protected static String nick;
	protected static long TiempoTotal;
	
	public NuevaPartida() {
		getContentPane().setLayout(null);
		
		nombre = new JTextField("Introduzca el nombre, use solo letras");
		nombre.setSize(200,50);
		contrasenya = new JTextField("Introduzca una contrasenya");
		contrasenya.setSize(200,50);
		carpetaguardado = new JTextField("Introduzca la carpeta en la que desea guardar sus datos de partida");
		carpetaguardado.setSize(200,50);
		crearpartida = new JButton("Crear partida");
		crearpartida.setSize(200,50);
		NuevaPartida.nick = nombre.getText();
		
		nombre.setLocation(400,100);
		contrasenya.setLocation(400,220);
		carpetaguardado.setLocation(400,360);
		crearpartida.setLocation(400,480);
		
		getContentPane().add(nombre);
		getContentPane().add(contrasenya);
		getContentPane().add(carpetaguardado);
		getContentPane().add(crearpartida);
		
		this.setTitle("Crear Partida");
		this.setSize(800,400);
		this.setDefaultCloseOperation(HIDE_ON_CLOSE);
		this.setVisible(false);
		this.setLocationRelativeTo(null);
		
		
	}

	public JButton getCrearpartida() {
		return crearpartida;
	}

	public void setCrearpartida(JButton crearpartida) {
		this.crearpartida = crearpartida;
	}

	public static String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		NuevaPartida.nick = nick;
	}
	
	long time_start, time_end;{
		time_start = System.currentTimeMillis();
		this.getCrearpartida(); 
		time_end = System.currentTimeMillis();
		long tiempo_total = time_start - time_end;
		NuevaPartida.TiempoTotal = tiempo_total;
	}
	public static long getTiempoTotal() {
		return TiempoTotal;
	}

	public void setTiempoTotal(long TiempoTotal) {
		NuevaPartida.TiempoTotal = TiempoTotal;
	}
	
	
}
