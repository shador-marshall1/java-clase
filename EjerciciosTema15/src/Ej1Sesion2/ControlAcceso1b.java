package Ej1Sesion2;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class ControlAcceso1b {

	private JFrame frmControlDeAcceso;
	private JTextField usuarioTexto;
	private JPasswordField contraseñaTexto;
	public JLabel lblSaludo;
	public JLabel lblImagen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ControlAcceso1b window = new ControlAcceso1b();
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
	public ControlAcceso1b() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmControlDeAcceso = new JFrame();
		frmControlDeAcceso.setTitle("Control de acceso DAM 2021");
		frmControlDeAcceso.setBounds(100, 100, 450, 300);
		frmControlDeAcceso.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmControlDeAcceso.getContentPane().setLayout(null);
		
		JLabel usernamelbl = new JLabel("Usuario:");
		usernamelbl.setBounds(30, 62, 46, 14);
		frmControlDeAcceso.getContentPane().add(usernamelbl);
		
		JLabel passwordlbl = new JLabel("Contrase\u00F1a:");
		passwordlbl.setBounds(30, 100, 68, 14);
		frmControlDeAcceso.getContentPane().add(passwordlbl);
		
		usuarioTexto = new JTextField();
		usuarioTexto.setBounds(125, 59, 86, 20);
		frmControlDeAcceso.getContentPane().add(usuarioTexto);
		usuarioTexto.setColumns(10);
		
		contraseñaTexto = new JPasswordField();
		contraseñaTexto.setBounds(125, 97, 86, 20);
		frmControlDeAcceso.getContentPane().add(contraseñaTexto);
		
		JButton ACEPTARBOTON = new JButton("Aceptar");
		ACEPTARBOTON.setBounds(289, 78, 89, 23);
		frmControlDeAcceso.getContentPane().add(ACEPTARBOTON);
		ACEPTARBOTON.addActionListener(new Oyente1());
		
		lblImagen = new JLabel("");
		lblImagen.setIcon(new ImageIcon("C:\\Users\\alejo\\git\\java-clase\\EjerciciosTema15\\Imagenes\\candado_cerrado.png"));
		lblImagen.setBounds(30, 128, 100, 122);
		frmControlDeAcceso.getContentPane().add(lblImagen);
		
		lblSaludo = new JLabel("");
		lblSaludo.setBounds(150, 177, 228, 54);
		frmControlDeAcceso.getContentPane().add(lblSaludo);
		
	}
	class Oyente1 implements ActionListener {
		Usuarios us1 = new Usuarios();
		public void actionPerformed(ActionEvent e) {
			try {
				String nombre = buscar(usuarioTexto.getText(), contraseñaTexto.getText());
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
			
			} catch (ClassNotFoundException e1) {e1.printStackTrace();} 
			catch (SQLException e1) {e1.printStackTrace();
			}
			
		}
	}
	public String buscar (String username, String password) throws ClassNotFoundException, SQLException {
		conector conector1 = new conector();
		conector1.conectar();
		try {/*
			Statement consulta = conector1.conecta.createStatement();
			ResultSet rst = consulta.executeQuery("SELECT * FROM Usuario WHERE username = '" + username + "' AND password='" + password + "'");
			*/
			PreparedStatement ps = conector1.conecta.prepareStatement("SELECT * FROM Usuario WHERE username =? AND password=?");
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rst = ps.executeQuery();
			
			if(rst.next()) {
				return rst.getString(3);
			}
			else {
				return null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
		
	}

}
