package quejasYSugerencias;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 497, 298);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Quejas Y Sugerencias");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel.setBounds(144, 11, 184, 29);
		contentPane.add(lblNewLabel);
		
		JButton btnSelectTodas = new JButton("Ver todas las QYS");
		btnSelectTodas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaConsulta vc = new VentanaConsulta();
				vc.setVisible(true);
				dispose();
			}
		});
		btnSelectTodas.setAction(action);
		btnSelectTodas.setFont(new Font("Arial", Font.PLAIN, 18));
		btnSelectTodas.setBounds(10, 96, 227, 110);
		contentPane.add(btnSelectTodas);
		
		JButton btnInsert = new JButton("Crear nueva QYS");
		btnInsert.setFont(new Font("Arial", Font.PLAIN, 18));
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaForm vf = new VentanaForm();
				vf.setVisible(true);
				dispose();
			}
		});
		btnInsert.setAction(action_1);
		btnInsert.setBounds(247, 96, 227, 110);
		contentPane.add(btnInsert);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Ver todas las QYS");
			putValue(SHORT_DESCRIPTION, "Ver todas las quejas y sugerencias");
		}
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Añadir nueva QYS");
			putValue(SHORT_DESCRIPTION, "Añadir nueva queja y sugerencia");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
