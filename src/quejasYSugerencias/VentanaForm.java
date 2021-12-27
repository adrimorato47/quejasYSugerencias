package quejasYSugerencias;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.Component;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class VentanaForm extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textApellidos;
	private JTextField textFecha_deteccion;
	private JTextField textMedio_respuesta;
	private JTextField textFecha_realizacion_sugerencia;
	private JTextField textFecha_comunicacion_responsable_proceso;
	private JTextField textFecha_respuesta;
	private JTextField textDescripcion;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
	private JTextField textFecha;
	public TextArea textAreaDescripcion;
	public TextArea textAreaContestacion;
	public TextArea textAreaPropuesta_mejora;
	public JComboBox<?> estamento;
	private JTextField textEstamento;
	private JTextField textPropuesta_mejora;
	private JTextField textContestacion;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaForm frame = new VentanaForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1219, 658);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 46, 74, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellidos:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(192, 42, 74, 22);
		contentPane.add(lblNewLabel_1);
		
		/*JComboBox comboBoxEstamento = new JComboBox();
		comboBoxEstamento.setFont(new Font("Arial", Font.PLAIN, 16));
		comboBoxEstamento.setModel(new DefaultComboBoxModel(new String[] {"Otro", "PAS", "Estudiante", "Profesor"}));
		comboBoxEstamento.setBounds(438, 42, 111, 22);
		contentPane.add(comboBoxEstamento);
		String estamento1 = comboBoxEstamento.toString();*/
		
		/*estamento1 = comboBoxEstamento.toString();*/
		
		JLabel lblNewLabel_2 = new JLabel("Estamento:");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(358, 46, 90, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Descripci\u00F3n:");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(10, 129, 90, 22);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u00BFCuando se detect\u00F3?");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(559, 42, 158, 22);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Propuesta de mejora:");
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(10, 286, 150, 22);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Medio de respuesta:");
		lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_6.setBounds(834, 42, 145, 22);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Fecha de realizaci\u00F3n de sugerencia:");
		lblNewLabel_7.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_7.setBounds(179, 96, 256, 22);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Fecha de comunicaci\u00F3n ");
		lblNewLabel_8.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_8.setBounds(556, 75, 170, 26);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Fecha de respuesta:");
		lblNewLabel_9.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_9.setBounds(868, 98, 145, 19);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Contestaci\u00F3n");
		lblNewLabel_10.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_10.setBounds(10, 429, 102, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_12 = new JLabel("Fecha:");
		lblNewLabel_12.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_12.setBounds(10, 102, 53, 14);
		contentPane.add(lblNewLabel_12);
		
		textFecha = new JTextField();
		textFecha.setColumns(10);
		textFecha.setBounds(58, 99, 111, 19);
		contentPane.add(textFecha);
		String fecha1 = textFecha.getText();
		
		textNombre = new JTextField();
		textNombre.setBounds(70, 45, 111, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		String nombre1 = textNombre.getText();
		
		textApellidos = new JTextField();
		textApellidos.setBounds(262, 45, 86, 20);
		contentPane.add(textApellidos);
		textApellidos.setColumns(10);
		String apellidos1 = textApellidos.getText();
		
		
		textDescripcion = new JTextField();
		textDescripcion.setBounds(10, 155, 1152, 131);
		contentPane.add(textDescripcion);
		textDescripcion.setColumns(10);
		String descripcion1 = textDescripcion.getText();
		/*JTextArea textAreaDescripcion = new JTextArea();
		textAreaDescripcion.setBounds(10, 155, 1152, 109);
		contentPane.add(textAreaDescripcion);
		String descripcion1 = textAreaDescripcion.toString();*/
		
		textFecha_deteccion = new JTextField();
		textFecha_deteccion.setBounds(713, 45, 111, 19);
		contentPane.add(textFecha_deteccion);
		textFecha_deteccion.setColumns(10);
		String fecha_deteccion1 = textFecha_deteccion.getText();
		
		textMedio_respuesta = new JTextField();
		textMedio_respuesta.setBounds(979, 45, 183, 20);
		contentPane.add(textMedio_respuesta);
		textMedio_respuesta.setColumns(10);
		String medio_respuesta1 = textMedio_respuesta.getText();
		
		textFecha_realizacion_sugerencia = new JTextField();
		textFecha_realizacion_sugerencia.setBounds(435, 99, 111, 20);
		contentPane.add(textFecha_realizacion_sugerencia);
		textFecha_realizacion_sugerencia.setColumns(10);
		String fecha_realizacion_sugerencia1 = textFecha_realizacion_sugerencia.getText();
		
		JLabel lblNewLabel_11 = new JLabel("al responsable del proceso:");
		lblNewLabel_11.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_11.setBounds(556, 96, 200, 22);
		contentPane.add(lblNewLabel_11);
		
		textFecha_comunicacion_responsable_proceso = new JTextField();
		textFecha_comunicacion_responsable_proceso.setColumns(10);
		textFecha_comunicacion_responsable_proceso.setBounds(754, 99, 111, 20);
		contentPane.add(textFecha_comunicacion_responsable_proceso);
		String fecha_comunicacion_responsable_proceso1 = textFecha_comunicacion_responsable_proceso.getText();
		
		textFecha_respuesta = new JTextField();
		textFecha_respuesta.setColumns(10);
		textFecha_respuesta.setBounds(1015, 99, 111, 20);
		contentPane.add(textFecha_respuesta);
		String fecha_respuesta1 = textFecha_respuesta.getText();
		
		
		
		/*JTextArea textAreaPropuesta_mejora = new JTextArea();
		textAreaPropuesta_mejora.setBounds(10, 309, 1152, 109);
		contentPane.add(textAreaPropuesta_mejora);
		String propuestaMejora1 = textAreaPropuesta_mejora.toString();*/
		
		/*JTextArea textAreaContestacion = new JTextArea();
		textAreaContestacion.setBounds(10, 454, 1152, 109);
		contentPane.add(textAreaContestacion);
		String contestacion1 = textAreaContestacion.toString();*/
		
		textEstamento = new JTextField();
		textEstamento.setBounds(435, 45, 124, 20);
		contentPane.add(textEstamento);
		textEstamento.setColumns(10);
		String estamento1 = textEstamento.getText();
		
		textPropuesta_mejora = new JTextField();
		textPropuesta_mejora.setBounds(10, 307, 1152, 111);
		contentPane.add(textPropuesta_mejora);
		textPropuesta_mejora.setColumns(10);
		String propuestaMejora1 = textPropuesta_mejora.getText();
		
		textContestacion = new JTextField();
		textContestacion.setColumns(10);
		textContestacion.setBounds(10, 454, 1152, 111);
		contentPane.add(textContestacion);
		String contestacion1 = textContestacion.getText();
		
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConnectionJDBC conn = new ConnectionJDBC();
				
				conn.ConnectionJDBC();
				String sql;
				PreparedStatement ps;
				System.out.println("Datos de la variable fecha1: " + fecha1);
				System.out.println("Datos del JTextField fecha: "+ textFecha);
				System.out.println("Datos de getFecha: " + getTextFecha());
				
				try {
					
					/*sql = "INSERT INTO qys(fecha, nombre, apellidos, estamento, descripcion, fecha_deteccion, propuesta_mejora,"
							+ " medio_respuesta, fecha_realizacion_sugerencia, fecha_comunicacion_responsable_proceso,"
							+ " fecha_respuesta, contestacion) "
							+ "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
					
					ps = conn.connection_.prepareStatement(sql);*/			

					/*https://codigosdeprogramacion.com/cursos/?lesson=3-crud-en-java-y-mysql */
						
					/*ps.setString(1, fecha1);
					ps.setString(2, nombre1);
					ps.setString(3, apellidos1);
					ps.setString(4, estamento1);
					ps.setString(5, descripcion1);
					ps.setString(6, fecha_deteccion1);
					ps.setString(7, propuestaMejora1);
					ps.setString(8, medio_respuesta1);
					ps.setString(9, fecha_realizacion_sugerencia1);
					ps.setString(10, fecha_comunicacion_responsable_proceso1);
					ps.setString(11, fecha_respuesta1);
					ps.setString(12, contestacion1);*/
					
					String consulta = fecha1+","+nombre1+","+apellidos1+","+estamento1+","+descripcion1+","+fecha_deteccion1+","+propuestaMejora1+","+medio_respuesta1+","+fecha_realizacion_sugerencia1+
							","+medio_respuesta1+","+fecha_realizacion_sugerencia1+","+fecha_comunicacion_responsable_proceso1+","+fecha_respuesta1+","+contestacion1;
					
					sql = "INSERT INTO qys(fecha, nombre, apellidos, estamento, descripcion, fecha_deteccion, propuesta_mejora,"
							+ " medio_respuesta, fecha_realizacion_sugerencia, fecha_comunicacion_responsable_proceso,"
							+ " fecha_respuesta, contestacion VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
					ResultSet rs = conn. 
					
					
					
					
					/*ps.executeUpdate();*/
					System.out.println("Fecha: "+fecha1);
					System.out.println("2. Nombre: "+nombre1);
					System.out.println("3. Apellidos: "+apellidos1);
					System.out.println("4. Estamento: "+estamento1);
					System.out.println("5. Descripcion: "+descripcion1);
					System.out.println("6. Fecha deteccion: "+fecha_deteccion1);
					System.out.println("7. Propuesta de mejora: "+propuestaMejora1);
					System.out.println("8. Medio de respuesta: "+medio_respuesta1);
					System.out.println("9. Fecha de realizacion de sugerencia: "+fecha_realizacion_sugerencia1);
					System.out.println("10. Fecha de comunicacion al responsable del proceso: "+fecha_comunicacion_responsable_proceso1);
					System.out.println("11. Fecha de respuesta: "+fecha_respuesta1);
					System.out.println("12. Contestacion: "+contestacion1);
					ps.executeQuery(sql);
			        JOptionPane.showMessageDialog(null, "Se han insertado los datos");
				}catch(SQLException error){
		            //JOptionPane.showMessageDialog(null, "Error de conexión:");
					/*JOptionPane.showMessageDialog(null, "No se han insertado los datos: "+ error);*/
					System.out.println("No se han introducido los datos: " + error);
				}
				/*Insert i = new Insert();
			
				i.insertar(fecha1, nombre1, apellidos1, estamento1, descripcion1, fecha_deteccion1, propuestaMejora1, medio_respuesta1,
						fecha_realizacion_sugerencia1, fecha_comunicacion_responsable_proceso1, fecha_respuesta1, contestacion1);*/
				VentanaPrincipal vp = new VentanaPrincipal();
				
				vp.setVisible(true);
				dispose();
			}
		});
		btnEnviar.setAction(action_1);
		btnEnviar.setFont(new Font("Arial", Font.BOLD, 16));
		btnEnviar.setBounds(1073, 587, 89, 23);
		contentPane.add(btnEnviar);
		
		JButton btnAtras = new JButton("Atr\u00E1s");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaPrincipal vp = new VentanaPrincipal();
				vp.setVisible(true);
				dispose();
			}
		});
		btnAtras.setAction(action);
		btnAtras.setFont(new Font("Arial", Font.BOLD, 16));
		btnAtras.setBounds(974, 587, 89, 23);
		contentPane.add(btnAtras);
		
		
		
		
	}
	
	//getters y setters
	
	public JTextField getTextDescripcion () {
		return textDescripcion;
	}
	
	public JTextField getTextContestacion () {
		return textContestacion;
	}
	
	public JTextField getTextPropuesta_mejora () {
		return textPropuesta_mejora;
	}
	
	/*public String getDescripcion () {
		String descripcion1 = textAreaDescripcion.toString();
		return descripcion1;
	}*/
	
	public JTextField getTextEstamento() {
		return textEstamento;
	}


	public String getContestacion () {
		String contestacion1 = textAreaContestacion.toString();
		return contestacion1;
	}
	
	public String getPropuestaMejora() {
		String propuestaMejora1 = textAreaPropuesta_mejora.toString();
		return propuestaMejora1;
	}
	
	/*public String getEstamento() {
		String estamento1 = estamento.toString();
		return estamento1;
	}*/
	
	public JTextField getTextNombre() {
		return textNombre;
	}

	public JTextField getTextApellidos() {
		return textApellidos;
	}

	public JTextField getTextFecha_deteccion() {
		return textFecha_deteccion;
	}

	public JTextField getTextMedio_respuesta() {
		return textMedio_respuesta;
	}

	public JTextField getTextFecha_realizacion_sugerencia() {
		return textFecha_realizacion_sugerencia;
	}

	public JTextField getTextFecha_comunicacion_responsable_proceso() {
		return textFecha_comunicacion_responsable_proceso;
	}

	public JTextField getTextFecha_respuesta() {
		return textFecha_respuesta;
	}

	public JTextField getTextFecha() {
		return textFecha;
	}
	
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Atrás");
			putValue(SHORT_DESCRIPTION, "Volver a la pantalla principal");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Enviar");
			putValue(SHORT_DESCRIPTION, "Enviar formulario");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
