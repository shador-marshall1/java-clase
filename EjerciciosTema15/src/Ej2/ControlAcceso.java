package Ej2;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class ControlAcceso {

	private JFrame frmControlDeAcceso;
	private JTextField textoUsuario;
	private JPasswordField passwordTexto;
	JLabel lblSaludo;
	JLabel lblImagen ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ControlAcceso window = new ControlAcceso();
					window.frmControlDeAcceso.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ControlAcceso() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmControlDeAcceso = new JFrame();
		frmControlDeAcceso.setTitle("Control de Acceso DAM 2021");
		frmControlDeAcceso.setBounds(100, 100, 450, 300);
		frmControlDeAcceso.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmControlDeAcceso.getContentPane().setLayout(null);
		
		JLabel Usuariolbl = new JLabel("Usuario: ");
		Usuariolbl.setBounds(27, 46, 46, 14);
		frmControlDeAcceso.getContentPane().add(Usuariolbl);
		
		JLabel Contraseñalbl = new JLabel("Contrase\u00F1a: ");
		Contraseñalbl.setBounds(27, 71, 70, 14);
		frmControlDeAcceso.getContentPane().add(Contraseñalbl);
		
		textoUsuario = new JTextField();
		textoUsuario.setBounds(116, 43, 86, 20);
		frmControlDeAcceso.getContentPane().add(textoUsuario);
		textoUsuario.setColumns(10);
		
		passwordTexto = new JPasswordField();
		passwordTexto.setBounds(116, 68, 86, 20);
		frmControlDeAcceso.getContentPane().add(passwordTexto);
		
		JButton aceptarbtn = new JButton("Aceptar");
		aceptarbtn.setBounds(283, 67, 89, 23);
		frmControlDeAcceso.getContentPane().add(aceptarbtn);
		aceptarbtn.addActionListener(new Oyente1());
		
		JLabel lblImagen = new JLabel("");
		lblImagen.setBounds(137, 95, 56, 76);
		Image img = new ImageIcon ("Imagenes/candado_cerrado.png").getImage();
		ImageIcon img2= new ImageIcon(img.getScaledInstance(56, 76, Image.SCALE_SMOOTH));
		lblImagen.setIcon(img2);
		//frame.getContentPane().add(lblImagen);
	
	}
	class Oyente1 implements ActionListener {
		//Usuarios us1;
		public void actionPerformed(ActionEvent e) {
		
			lblSaludo.setText("");
			lblImagen.setText("");
			
			String nombre = null;
			try {
				nombre = buscar (textoUsuario.getText(), passwordTexto.getText());
			} catch (SQLException e1) {
				e1.printStackTrace();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			if (nombre!=null) {
				Image img= new ImageIcon("Imagenes\\candado_abierto.png").getImage();
				ImageIcon img2=new ImageIcon(img.getScaledInstance(56, 76, Image.SCALE_SMOOTH));
				lblSaludo.setText("Bienvenido/a "+ nombre);
				lblImagen.setIcon(img2);
			}
			else {
				Image img= new ImageIcon("Imagenes\\candado_cerrado.png").getImage();
				ImageIcon img2=new ImageIcon(img.getScaledInstance(56, 76, Image.SCALE_SMOOTH));
				lblSaludo.setText("No existe el Usuario / Contraseña");
				lblImagen.setIcon(img2);
			}
		}
		
	}
	private String buscar (String username, String password) throws Exception, SQLException {
		conector conector1 = new conector();
		conector1.conectar();
		try {
			Statement consulta = conector1.conecta.createStatement();
			ResultSet rst = consulta.executeQuery("Select username, password from sample where username ="+username+ " and password="+password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
