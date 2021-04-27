package Ej3;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ConsultaSocio {

	private JFrame frame;
	private JTextField IDTEXT;
	private JTextField NombreText;
	private JTextField EstaturaText;
	private JTextField EdadTEXT;
	private JTextField LocalidadTXT;
	private JTextField buscarText;
	private JButton btnBuscar;
	private JButton btnSiguiente;
	private JButton btnAnterior;
	private ResultSet rst;
	private AccesoBDatos adb;
	private int filas=0, posicion=0;;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaSocio window = new ConsultaSocio();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ConsultaSocio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 565, 383);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lIDLabel = new JLabel("Socio ID");
		lIDLabel.setBounds(45, 82, 46, 14);
		frame.getContentPane().add(lIDLabel);
		
		JLabel NombreLBL = new JLabel("Nombre");
		NombreLBL.setBounds(45, 107, 46, 14);
		frame.getContentPane().add(NombreLBL);
		
		JLabel Estaturalbl = new JLabel("Estatura");
		Estaturalbl.setBounds(45, 132, 46, 14);
		frame.getContentPane().add(Estaturalbl);
		
		JLabel Edadlbl = new JLabel("Edad");
		Edadlbl.setBounds(45, 157, 46, 14);
		frame.getContentPane().add(Edadlbl);
		
		JLabel Localidadlbl = new JLabel("Localidad");
		Localidadlbl.setBounds(45, 182, 46, 14);
		frame.getContentPane().add(Localidadlbl);
		
		IDTEXT = new JTextField();
		IDTEXT.setEditable(false);
		IDTEXT.setBounds(127, 79, 46, 20);
		frame.getContentPane().add(IDTEXT);
		IDTEXT.setColumns(10);
		
		NombreText = new JTextField();
		NombreText.setEditable(false);
		NombreText.setBounds(127, 104, 189, 20);
		frame.getContentPane().add(NombreText);
		NombreText.setColumns(10);
		
		EstaturaText = new JTextField();
		EstaturaText.setEditable(false);
		EstaturaText.setBounds(127, 129, 38, 20);
		frame.getContentPane().add(EstaturaText);
		EstaturaText.setColumns(10);
		
		EdadTEXT = new JTextField();
		EdadTEXT.setEditable(false);
		EdadTEXT.setBounds(127, 154, 38, 20);
		frame.getContentPane().add(EdadTEXT);
		EdadTEXT.setColumns(10);
		
		LocalidadTXT = new JTextField();
		LocalidadTXT.setEditable(false);
		LocalidadTXT.setBounds(127, 179, 86, 20);
		frame.getContentPane().add(LocalidadTXT);
		LocalidadTXT.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("En CM");
		lblNewLabel.setBounds(175, 132, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("A\u00F1os");
		lblNewLabel_1.setBounds(175, 157, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		buscarText = new JTextField();
		buscarText.setBounds(350, 30, 86, 20);
		frame.getContentPane().add(buscarText);
		buscarText.setColumns(10);
		
		btnAnterior = new JButton("Anterior");
		btnAnterior.setEnabled(false);
		btnAnterior.setBounds(191, 250, 89, 23);
		//btnAnterior.addActionListener(new Oyente1());
		frame.getContentPane().add(btnAnterior);
		
		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setEnabled(false);
		btnSiguiente.setBounds(316, 250, 89, 23);
		//btnSiguiente.addActionListener(new Oyente2());
		frame.getContentPane().add(btnSiguiente);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(350, 61, 89, 23);
		//btnBuscar.addActionListener(new Oyente3());
		frame.getContentPane().add(btnBuscar);
	}

		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource()==btnBuscar) {
				String cadenaSQL="Select * from socio";
				if (!buscarText.getText().isEmpty()) {
					cadenaSQL = cadenaSQL+"WHERE localidad='"+buscarText.getText()+"'";
					
				}
			}
			
		}
}
