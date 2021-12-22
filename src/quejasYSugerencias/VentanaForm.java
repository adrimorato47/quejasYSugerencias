package quejasYSugerencias;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.Component;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;

public class VentanaForm extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textApellidos;
	private JTextField textFecha_deteccion;
	private JTextField textMedio_respuesta;
	private JTextField textFecha_realizacion_sugerencia;
	private JTextField textFecha_comunicacion_responsable_proceso;
	private JTextField textFecha_respuesta;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
	private JTextField textFecha;
	
	String estamento1 = "";	
	String descripcion1 = "";
	String propuestaMejora1 = "";
	String contestacion1 = "";
	
	String fecha = textFecha.toString();
	String nombre = textNombre.toString();
	String apellidos = textApellidos.toString();
	String fecha_deteccion = textFecha_deteccion.toString();
	String medio_respuesta = textMedio_respuesta.toString();
	String fecha_realizacion_sugerencia = textFecha_realizacion_sugerencia.toString();
	String fecha_comunicacion_responsable_proceso = textFecha_comunicacion_responsable_proceso.toString();
	String fecha_respuesta = textFecha_respuesta.toString();
	String estamento = estamento1;
		/*String fecha = "";
	String nombre = "";
	String apellidos = "";
	String fecha_deteccion = "";
	String medio_respuesta = "";
	String fecha_realizacion_sugerencia = "";
	String fecha_comunicacion_responsable_proceso = "";
	String fecha_respuesta = "";
	String estamento = "";*/
	
	

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
		
		JComboBox comboBoxEstamento = new JComboBox();
		comboBoxEstamento.setFont(new Font("Arial", Font.PLAIN, 16));
		comboBoxEstamento.setModel(new DefaultComboBoxModel(new String[] {"Otro", "PAS", "Estudiante", "Profesor"}));
		comboBoxEstamento.setBounds(438, 42, 111, 22);
		contentPane.add(comboBoxEstamento);
		
		estamento1 = comboBoxEstamento.toString();
		
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
		
		textNombre = new JTextField();
		textNombre.setBounds(70, 45, 111, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		textApellidos = new JTextField();
		textApellidos.setBounds(262, 45, 86, 20);
		contentPane.add(textApellidos);
		textApellidos.setColumns(10);
		
		JTextArea textAreaDescripcion = new JTextArea();
		textAreaDescripcion.setBounds(10, 155, 1152, 109);
		contentPane.add(textAreaDescripcion);
		descripcion1 = textAreaDescripcion.toString();
		
		textFecha_deteccion = new JTextField();
		textFecha_deteccion.setBounds(713, 45, 111, 19);
		contentPane.add(textFecha_deteccion);
		textFecha_deteccion.setColumns(10);
		
		textMedio_respuesta = new JTextField();
		textMedio_respuesta.setBounds(979, 45, 183, 20);
		contentPane.add(textMedio_respuesta);
		textMedio_respuesta.setColumns(10);
		
		textFecha_realizacion_sugerencia = new JTextField();
		textFecha_realizacion_sugerencia.setBounds(435, 99, 111, 20);
		contentPane.add(textFecha_realizacion_sugerencia);
		textFecha_realizacion_sugerencia.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("al responsable del proceso:");
		lblNewLabel_11.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_11.setBounds(556, 96, 200, 22);
		contentPane.add(lblNewLabel_11);
		
		textFecha_comunicacion_responsable_proceso = new JTextField();
		textFecha_comunicacion_responsable_proceso.setColumns(10);
		textFecha_comunicacion_responsable_proceso.setBounds(754, 99, 111, 20);
		contentPane.add(textFecha_comunicacion_responsable_proceso);
		
		textFecha_respuesta = new JTextField();
		textFecha_respuesta.setColumns(10);
		textFecha_respuesta.setBounds(1015, 99, 111, 20);
		contentPane.add(textFecha_respuesta);
		
		JTextArea textAreaPropuesta_mejora = new JTextArea();
		textAreaPropuesta_mejora.setBounds(10, 309, 1152, 109);
		contentPane.add(textAreaPropuesta_mejora);
		propuestaMejora1 = textAreaPropuesta_mejora.toString();
		
		JTextArea textAreaContestacion = new JTextArea();
		textAreaContestacion.setBounds(10, 454, 1152, 109);
		contentPane.add(textAreaContestacion);
		contestacion1 = textAreaContestacion.toString();
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Insert i = new Insert();
				i.insertar(fecha, nombre, apellidos, estamento, descripcion1, fecha_deteccion, propuestaMejora1, medio_respuesta,
						fecha_realizacion_sugerencia, fecha_comunicacion_responsable_proceso, fecha_respuesta, contestacion1);
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
	public String getDescripcion () {
		return descripcion1;
	}
	
	public String getContestacion () {
		return contestacion1;
	}
	
	public String getPropuestaMejora() {
		return propuestaMejora1;
	}
	
	public String getEstamento() {
		return estamento1;
	}
	
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
