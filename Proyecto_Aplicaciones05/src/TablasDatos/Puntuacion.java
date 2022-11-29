package TablasDatos;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JTable;

import Objetos.Personaje;
import Ventanas.NuevaPartida;

public class Puntuacion extends JTable {
	
	
	private static final long serialVersionUID = 1L;
	static ArrayList<String> nick = new ArrayList<String>();
	static ArrayList<Integer> puntos = new ArrayList<Integer>();
	static ArrayList<Long> tiempo = new ArrayList<Long>();
	
	
	public Puntuacion (){
		nick.add(NuevaPartida.getNick());
		puntos.add(Personaje.getExperiencia());
		tiempo.add(NuevaPartida.getTiempoTotal());
	}
	
	public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:test.db");
        Statement stat = conn.createStatement();
        stat.executeUpdate("drop table if exists people;");
        stat.executeUpdate("create table partida (nick, puntuaje, tiempo);");
        PreparedStatement prep = conn.prepareStatement(
            "insert into partida values (?, ?);");

        prep.setArray(1, (Array) nick);
        prep.setArray(2, (Array) puntos);
        prep.setArray(3, (Array) tiempo);
        prep.addBatch();
        conn.setAutoCommit(false);
        prep.executeBatch();
        conn.setAutoCommit(true);

        ResultSet rs = stat.executeQuery("select * from partida;");
        while (rs.next()) {
            System.out.println("Nick = " + rs.getString("nick"));
            System.out.println("Puntuaje = " + rs.getString("puntuaje"));
            System.out.println("Tiempo = " + rs.getString("tiempo"));
        }
        rs.close();
        conn.close();
    }
	

	public static ArrayList<String> getNick() {
		return nick;
	}



	public void setNick(ArrayList<String> nick) {
		Puntuacion.nick = nick;
	}



	public static ArrayList<Integer> getPuntos() {
		return puntos;
	}



	public void setPuntos(ArrayList<Integer> puntos) {
		Puntuacion.puntos = puntos;
	}



	public static ArrayList<Long> getTiempo() {
		return tiempo;
	}



	public void setTiempo(ArrayList<Long> tiempo) {
		Puntuacion.tiempo = tiempo;
	}

	
	
}


		