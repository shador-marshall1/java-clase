package Ej3;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class ConsultaSocio {

	private JFrame frame;
	private JTextField IDTEXT;
	private JTextField NombreText;
	private JTextField EstaturaText;
	private JTextField EdadTEXT;
	private JTextField LocalidadTXT;
	private JTextField buscarText;
	public JButton btnBuscar;
	private JButton btnSiguiente;
	private JButton btnAnterior;
	private ResultSet rst;
	private JLabel mensajeError1;
//	private AccesoBDatos adb;
	private static int filas=0, posicion=0;


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
		NombreText.setBounds(127, 104, 244, 20);
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
		LocalidadTXT.setBounds(127, 179, 171, 20);
		frame.getContentPane().add(LocalidadTXT);
		LocalidadTXT.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("En CM");
		lblNewLabel.setBounds(175, 132, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("A\u00F1os");
		lblNewLabel_1.setBounds(175, 157, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		buscarText = new JTextField();
		buscarText.setToolTipText("Por Localidad");
		buscarText.setBounds(350, 30, 86, 20);
		frame.getContentPane().add(buscarText);
		buscarText.setColumns(10);
		
		btnAnterior = new JButton("Anterior");
		btnAnterior.setEnabled(false);
		btnAnterior.setBounds(191, 250, 89, 23);
		btnAnterior.addActionListener(new Oyente1());
		frame.getContentPane().add(btnAnterior);
		
		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setEnabled(false);
		btnSiguiente.setBounds(316, 250, 89, 23);
		btnSiguiente.addActionListener(new Oyente2());
		frame.getContentPane().add(btnSiguiente);
		btnSiguiente.setName("btnSiguiente2");
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(350, 61, 89, 23);
		btnBuscar.addActionListener(new Oyente3());
		frame.getContentPane().add(btnBuscar);
		btnBuscar.setName("btnBuscar1");
		
		mensajeError1 = new JLabel("");
		mensajeError1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		mensajeError1.setBounds(56, 284, 219, 32);
		frame.getContentPane().add(mensajeError1);
	}
	/*
	 * class Oyente3 implements ActionListener {
	 * 
	 * public void actionPerformed(ActionEvent arg0) { AccesoBDatos adb = new
	 * AccesoBDatos(); try { adb.conectar(); } catch (ClassNotFoundException |
	 * SQLException e2) { e2.printStackTrace(); } //if (arg0.getSource()==btnBuscar)
	 * { if (!buscarText.getText().isEmpty()) { String
	 * cadenaSQL="Select * from socio"; String cadenaSQL1 =
	 * cadenaSQL+" WHERE localidad='"+buscarText.getText()+"'"; rst
	 * =adb.buscarLocalidad(cadenaSQL1); try { if (rst.next()) {
	 * 
	 * int ID1 =rst.getInt("socioID"); Nombre1= rst.getString("nombre"); int
	 * Estatura1=rst.getInt("estatura"); int Edad1 = rst.getInt("edad"); Localidad1=
	 * rst.getString("localidad"); ID2=String.valueOf(ID1);
	 * Estatura2=String.valueOf(Estatura1); Edad2=String.valueOf(Edad1);
	 * IDTEXT.setText(ID2); NombreText.setText(Nombre1);
	 * EstaturaText.setText(Estatura2); EdadTEXT.setText(Edad2);
	 * LocalidadTXT.setText(Localidad1); btnSiguiente.setEnabled(true);
	 * btnAnterior.setEnabled(true); mensajeError1.setText("");
	 * if(arg0.getSource()==btnSiguiente) { filas=rst.getRow(); rst.absolute(filas);
	 * IDTEXT.setText(ID2); NombreText.setText(Nombre1);
	 * EstaturaText.setText(Estatura2); EdadTEXT.setText(Edad2);
	 * LocalidadTXT.setText(Localidad1); btnSiguiente.setEnabled(true);
	 * btnAnterior.setEnabled(true); mensajeError1.setText(""); }
	 * 
	 * } if( rst.first()==false) { mensajeError1.setText("La localidad no existe");
	 * } } catch (SQLException e1) {
	 * 
	 * }
	 * 
	 * } } } class Oyente2 implements ActionListener {
	 * 
	 * public void actionPerformed(ActionEvent e) { try { if (rst.next()) {
	 * 
	 * int ID1 =rst.getInt("socioID"); Nombre1= rst.getString("nombre"); int
	 * Estatura1=rst.getInt("estatura"); int Edad1 = rst.getInt("edad"); Localidad1=
	 * rst.getString("localidad"); ID2=String.valueOf(ID1);
	 * Estatura2=String.valueOf(Estatura1); Edad2=String.valueOf(Edad1);
	 * IDTEXT.setText(ID2); NombreText.setText(Nombre1);
	 * EstaturaText.setText(Estatura2); EdadTEXT.setText(Edad2);
	 * LocalidadTXT.setText(Localidad1); btnSiguiente.setEnabled(true);
	 * btnAnterior.setEnabled(true); mensajeError1.setText("");
	 * if(e.getSource()==btnSiguiente) { rst.moveToInsertRow();
	 * System.out.println(rst.getRow()); IDTEXT.setText(ID2);
	 * NombreText.setText(Nombre1); EstaturaText.setText(Estatura2);
	 * EdadTEXT.setText(Edad2); LocalidadTXT.setText(Localidad1);
	 * btnSiguiente.setEnabled(true); btnAnterior.setEnabled(true);
	 * mensajeError1.setText(""); }
	 * 
	 * } if( rst.first()==false) { mensajeError1.setText("La localidad no existe");
	 * } } catch (SQLException e1) {
	 * 
	 * }
	 * 
	 * }
	 * 
	 * } class Oyente1 implements ActionListener {
	 * 
	 * public void actionPerformed(ActionEvent e) { try { if (rst.previous()) {
	 * 
	 * int ID1 =rst.getInt("socioID"); Nombre1= rst.getString("nombre"); int
	 * Estatura1=rst.getInt("estatura"); int Edad1 = rst.getInt("edad"); Localidad1=
	 * rst.getString("localidad"); ID2=String.valueOf(ID1);
	 * Estatura2=String.valueOf(Estatura1); Edad2=String.valueOf(Edad1);
	 * IDTEXT.setText(ID2); NombreText.setText(Nombre1);
	 * EstaturaText.setText(Estatura2); EdadTEXT.setText(Edad2);
	 * LocalidadTXT.setText(Localidad1); btnSiguiente.setEnabled(true);
	 * btnAnterior.setEnabled(true); mensajeError1.setText("");
	 * 
	 * 
	 * }
	 * 
	 * if( rst.first()==false) { mensajeError1.setText("La localidad no existe"); }
	 * } catch (SQLException e1) {
	 * 
	 * }
	 * 
	 * }
	 * 
	 * }
	 */
ArrayList<Socio>list = new ArrayList<Socio>();
class Oyente3 implements ActionListener {
	
	AccesoBDatos adb = new AccesoBDatos();

	public void actionPerformed(ActionEvent e) {
		try {
			adb.conectar();
		} catch (ClassNotFoundException e1) {e1.printStackTrace();
		} catch (SQLException e1) {e1.printStackTrace();}
		if (!buscarText.getText().isEmpty()) { 
			String cadenaSQL="Select * from socio"; 
			String cadenaSQL1 =cadenaSQL+" WHERE localidad='"+buscarText.getText()+"'"; 
			 rst=adb.buscarLocalidad(cadenaSQL1); 
			 try {
				while (rst.next()) {
					 list.add(new Socio(rst.getInt(1), rst.getString(2), rst.getInt(3), rst.getInt(4), rst.getString(5)));
					 String ID1= String.valueOf(rst.getInt(1));
					 String Esta1=String.valueOf(rst.getInt(3));
					 String Edad1=String.valueOf(rst.getInt(4));
					 IDTEXT.setText(ID1);
					 NombreText.setText(rst.getString(2));
					 EstaturaText.setText(Esta1);
					 EdadTEXT.setText(Edad1);
					 LocalidadTXT.setText(rst.getString(5));
					 btnAnterior.setEnabled(true);
					 btnSiguiente.setEnabled(true);
					 posicion = 0;
				 }
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}
	
}
class Oyente2 implements ActionListener {

	public void actionPerformed(ActionEvent e) {
	posicion++;
	IDTEXT.setText(String.valueOf(list.get(posicion).getSocioID()));
	NombreText.setText(list.get(posicion).getNombre());
	EstaturaText.setText(String.valueOf(list.get(posicion).getEstatura()));
	EdadTEXT.setText(String.valueOf(list.get(posicion).getEdad()));
	LocalidadTXT.setText(list.get(posicion).getLocalidad());
	}
	
}
class Oyente1 implements ActionListener {

	public void actionPerformed(ActionEvent e) {
	posicion--;
	IDTEXT.setText(String.valueOf(list.get(posicion).getSocioID()));
	NombreText.setText(list.get(posicion).getNombre());
	EstaturaText.setText(String.valueOf(list.get(posicion).getEstatura()));
	EdadTEXT.setText(String.valueOf(list.get(posicion).getEdad()));
	LocalidadTXT.setText(list.get(posicion).getLocalidad());
	}
	
}
}
