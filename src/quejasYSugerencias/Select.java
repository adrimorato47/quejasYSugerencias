package quejasYSugerencias;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select {
	
	ConnectionJDBC db = new ConnectionJDBC();
	static final String TABLA = "qys";
	
	public void Consulta() {
		//Creamos una declaración (statement) de la conexión
        Statement mStm = null;
        try {
            mStm = db.connection_.createStatement();
        } catch (SQLException error) {
            System.out.println("Error al establecer declaración de conexión MySQL/MariaDB: " + error.getMessage());
        }
	
		//Ejecutamos una consulta SQL contra el statement anterior
        //El resultado se guardará en el ResultSet
        ResultSet mRS = null;
        try {
            mRS = mStm.executeQuery("SELECT * FROM "+ TABLA);
            //Recorremos todos los registros del SQL devuelto en el ResultSet
            while (mRS.next()) {
                System.out.println(" id: " + mRS.getString(1) + "\n Fecha: " + mRS.getString(2) + "\n Nombre: " + mRS.getString(3) + "\n Apellidos: " + mRS.getString(4) +  "\n Estamento: " + mRS.getString(5) + 
                				   "\n Descripción: " + mRS.getString(6) + "\n Cuando lo ha detectado: " + mRS.getString(7) + "\n Propuesta de mejora: " + mRS.getString(8) + 
                				   "\n Medio de respuesta: " + mRS.getString(9) + "\n Fecha de realización de la sugerencia: " + mRS.getString(10) +  
                				   "\n Fecha de comunicación al responsable del proceso: " + mRS.getString(11) +  "\n Fecha de respuesta del responsable del proceso: " + mRS.getString(12) +  
                				   "\n Contestación: "+ mRS.getString(13));
            }
        } catch (SQLException error) {
            System.out.println("Error al ejecutar SQL en servidor MySQL/MariaDB: " + error.getMessage());
        }
	}

}
