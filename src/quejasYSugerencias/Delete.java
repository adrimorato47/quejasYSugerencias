package quejasYSugerencias;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete {

	ConnectionJDBC db = new ConnectionJDBC();
	static final String TABLA = "qys";
	
	int delete, num;
	
	public int numero() {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("¿Qué fila quieres eliminar");
		delete = sc.nextInt();
		num = delete;

		return num;
	}
 
	public void eliminar(int id) {
		
		PreparedStatement ps; 
		
		try {

			String sql = "DELETE FROM " + TABLA + " WHERE id = "+id;
			ps = ConnectionJDBC.connection_.prepareStatement(sql);
			ps.executeUpdate(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
}
