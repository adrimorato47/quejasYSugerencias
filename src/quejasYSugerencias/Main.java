package quejasYSugerencias;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		ConnectionJDBC conn = new ConnectionJDBC();
		
		
		VentanaPrincipal vp = new VentanaPrincipal();
		vp.setVisible(true);
		
		conn.ConnectionJDBC();
		
		Statement mStm = null;
        try {
            mStm = conn.connection_.createStatement();
            System.out.println("conectado");
        } catch (SQLException error) {
            System.out.println("Error al establecer declaración de conexión MySQL/MariaDB: " + error.getMessage());
        }
	
		//Ejecutamos una consulta SQL contra el statement anterior
        //El resultado se guardará en el ResultSet
        ResultSet mRS = null;
	}
}
