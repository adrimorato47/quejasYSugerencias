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

			String consulta = "DELETE FROM" + TABLA + " WHERE id = ? ";
			ps = db.connection_.prepareStatement(consulta);
			ps.setInt(1, id);
			ps.executeUpdate(consulta);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
