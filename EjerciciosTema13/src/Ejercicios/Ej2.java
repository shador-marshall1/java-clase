package Ejercicios;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.*;

public class Ej2 {

	private JFrame frmClculoreaTringulo;
	private JTextField baseReal;
	private JTextField alturaReal;
	private JTextField resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej2 window = new Ej2();
					window.frmClculoreaTringulo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the application.
	 */
	public Ej2() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmClculoreaTringulo = new JFrame();
		frmClculoreaTringulo.setTitle("C\u00E1lculo \u00C1rea Tri\u00E1ngulo");
		frmClculoreaTringulo.setBounds(100, 100, 450, 300);
		frmClculoreaTringulo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmClculoreaTringulo.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Base:");
		lblNewLabel.setBounds(10, 62, 46, 14);
		frmClculoreaTringulo.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Altura");
		lblNewLabel_1.setBounds(10, 101, 46, 14);
		frmClculoreaTringulo.getContentPane().add(lblNewLabel_1);
		
		baseReal = new JTextField();
		baseReal.setBounds(97, 59, 86, 20);
		frmClculoreaTringulo.getContentPane().add(baseReal);
		baseReal.setColumns(10);
		
		alturaReal = new JTextField();
		alturaReal.setBounds(97, 98, 86, 20);
		frmClculoreaTringulo.getContentPane().add(alturaReal);
		alturaReal.setColumns(10);
		
		JButton AreaBoton = new JButton("Area");
		AreaBoton.setBounds(53, 158, 89, 23);
		frmClculoreaTringulo.getContentPane().add(AreaBoton);
		AreaBoton.addActionListener(new oyente());
		
		resultado = new JTextField();
		resultado.setEditable(false);
		resultado.setBounds(167, 159, 86, 20);
		frmClculoreaTringulo.getContentPane().add(resultado);
		resultado.setColumns(10);
		
	}
	/*
	public static boolean esReal (String r) {
		try {
			Double.parseDouble(r);
			return true;
		}catch (NumberFormatException nfe) {
			return false;
		}
	}*/
	class oyente implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Double resultado1 = Double.parseDouble(baseReal.getText()) * Double.parseDouble(alturaReal.getText())/2;
			resultado1 = Math.rint(resultado1*100)/100;
			resultado.setText(resultado1.toString());
			
		}
		
	}
}
