package quejasYSugerencias;

import java.sql.*;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ConnectionJDBC {
	
	//Atributos de la clase relativos a la BD
	private static String db_ = "quejasYSugerencias";
	private static String login_ = "admin";
	private static String password_ = "Almeria.2018";
	private static String url_ = "jdbc:mysql://10.200.50.54:3307/"+db_;
	//Atributos privados para almacenar la conexi�n MySQL
	protected static Connection connection_;
	protected static Statement st_;
	
	public void ConnectionJDBC() {
		try {
			//Obtener el driver para MySQL
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Obtener la conexi�n
			connection_ = DriverManager.getConnection(url_, login_, password_);
			//Comprobar conexi�n correcta
			if (connection_ != null) {
				st_ = connection_.createStatement();
				System.out.println("Conexi�n a bbdd "+ db_ + " correcta");
			} else {
				System.out.println("Conexi�n fallida");
			}
		}catch (SQLException e) {e.printStackTrace();}
		 catch (ClassNotFoundException e) {e.printStackTrace();}
		 catch (Exception e) {e.printStackTrace();}
	}
	
	
	
	

	
}
