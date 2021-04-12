package Ejercicios;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Ej4 {

	private JFrame frmIniciarSesin;
	private JTextField Usuario;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej4 window = new Ej4();
					window.frmIniciarSesin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ej4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmIniciarSesin = new JFrame();
		frmIniciarSesin.setTitle("Iniciar Sesi\u00F3n");
		frmIniciarSesin.setBounds(100, 100, 304, 246);
		frmIniciarSesin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmIniciarSesin.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setBounds(10, 62, 46, 14);
		frmIniciarSesin.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contrase\u00F1a");
		lblNewLabel_1.setBounds(10, 97, 46, 14);
		frmIniciarSesin.getContentPane().add(lblNewLabel_1);
		
		Usuario = new JTextField();
		Usuario.setBounds(88, 59, 86, 20);
		frmIniciarSesin.getContentPane().add(Usuario);
		Usuario.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(88, 94, 86, 20);
		frmIniciarSesin.getContentPane().add(password);
		
		JButton btnValidar = new JButton("Validar");
		btnValidar.setBounds(47, 140, 89, 23);
		frmIniciarSesin.getContentPane().add(btnValidar);
		btnValidar.addActionListener(new Oyente());
	}
	class Oyente implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			Boolean resultado=true;
			if (Usuario.getText().equals("dam") && password.getText().equals("1234")) {
				frmIniciarSesin.setTitle("Inicio Correcto");
			}else {
				frmIniciarSesin.setTitle("Inicio Incorrecto");
			}
			
		}
		
	}
}
