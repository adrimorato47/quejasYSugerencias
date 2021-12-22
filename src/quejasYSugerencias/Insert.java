package quejasYSugerencias;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Insert {
	
	ConnectionJDBC db = new ConnectionJDBC();
	VentanaForm vf = new VentanaForm();
	static final String TABLA = "qys";
	
	/*public void insertar(String fecha, String nombre, String apellidos, String estamento, String descripcion, String fecha_deteccion,
			String propuesta_mejora, String medio_respuesta, String fecha_realizacion_sugerencia, String fecha_comunicacion_responsable_proceso, 
			String fecha_respuesta, String contestacion) {*/
	public void insertar(String fecha, String nombre, String apellidos, String estamento, String descripcion, String fecha_deteccion,
			String propuesta_mejora, String medio_respuesta, String fecha_realizacion_sugerencia, String fecha_comunicacion_responsable_proceso, 
			String fecha_respuesta, String contestacion) {
		
		PreparedStatement ps;
		String sql;
		
		Scanner sc =new Scanner(System.in);
		
		try {
			
			sql = "INSERT INTO qys(fecha, nombre, apellidos, estamento, descripcion, fecha_deteccion, propuesta_mejora,"
					+ " medio_respuesta, fecha_realizacion_sugerencia, fecha_comunicacion_responsable_proceso,"
					+ " fecha_respuesta, contestacion) "
					+ "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
			ps = db.connection_.prepareStatement(sql);
			
			/*System.out.println("Fecha");
			fecha = sc.nextLine();
			System.out.println("Nombre");
			nombre = sc.nextLine();
			System.out.println("Apellidos");
			apellidos = sc.nextLine();
			System.out.println("Estamento");
			estamento = sc.nextLine();
			System.out.println("Descripción");
			descripcion = sc.nextLine();
			System.out.println("Fecha de detección");
			fecha_deteccion = sc.nextLine();
			System.out.println("Propuesta de mejora");
			propuesta_mejora = sc.nextLine();
			System.out.println("Medio de respuesta");
			medio_respuesta = sc.nextLine();
			System.out.println("Fecha de realización de la sugerencia");
			fecha_realizacion_sugerencia = sc.nextLine();
			System.out.println("Fecha de comunicacion al responsable del proceso");
			fecha_comunicacion_responsable_proceso = sc.nextLine();
			System.out.println("Fecha de respuesta");
			fecha_respuesta = sc.nextLine();
			System.out.println("Contestación");
			contestacion = sc.nextLine();*/
			

			String fecha1 = vf.getTextFecha().getText();
			fecha = fecha1;
			
			String nombre1 = vf.getTextNombre().getText();
			nombre = nombre1;
			
			String apellidos1 = vf.getTextApellidos().getText();
			apellidos = apellidos1;
			
			String estamento1 = vf.getEstamento();
			estamento = estamento1;
			
			String descripcion1 = vf.getDescripcion();
			descripcion = descripcion1;
			
			String fecha_deteccion1 = vf.getTextFecha_deteccion().toString();
			fecha_deteccion = fecha_deteccion1;
			
			String propuesta_mejora1 = vf.getPropuestaMejora().toString();
			propuesta_mejora = propuesta_mejora1;
			
			String medio_respuesta1 = vf.getTextMedio_respuesta().toString();
			medio_respuesta = medio_respuesta1;
			
			String fecha_realizacion_sugerencia1 = vf.getTextFecha_realizacion_sugerencia().toString();
			fecha_realizacion_sugerencia = fecha_realizacion_sugerencia1;
			
			String fecha_comunicacion_responsable_proceso1 = vf.getTextFecha_comunicacion_responsable_proceso().toString();
			fecha_comunicacion_responsable_proceso = fecha_comunicacion_responsable_proceso1;
			
			String fecha_respuesta1 = vf.getTextFecha_respuesta().toString();
			fecha_respuesta = fecha_respuesta1;
			
			String contestacion1 = vf.getContestacion();
			contestacion = contestacion1;	
			
		/*	https://codigosdeprogramacion.com/cursos/?lesson=3-crud-en-java-y-mysql */
				
			ps.setString(1, fecha);
			ps.setString(2, nombre);
			ps.setString(3, apellidos);
			ps.setString(4, estamento);
			ps.setString(5, descripcion);
			ps.setString(6, fecha_deteccion);
			ps.setString(7, propuesta_mejora);
			ps.setString(8, medio_respuesta);
			ps.setString(9, fecha_realizacion_sugerencia);
			ps.setString(10, fecha_comunicacion_responsable_proceso);
			ps.setString(11, fecha_respuesta);
			ps.setString(12, contestacion);
			
			
			ps.executeUpdate();
	        JOptionPane.showMessageDialog(null, "Se han insertado los datos");
		}catch(SQLException error){
            //JOptionPane.showMessageDialog(null, "Error de conexión:");
			JOptionPane.showMessageDialog(null, "No se han insertado los datos: "+ error);
			System.out.println("No se han introducido los datos: " + error);
		}
	}
}
