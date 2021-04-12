package Ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ej3 {

	private JFrame frame;
	private JTextField num1;
	private JTextField num2;
	private JTextField resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej3 window = new Ej3();
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
	public Ej3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Primer N\u00FAmero");
		lblNewLabel.setBounds(10, 69, 73, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Seg. Numero");
		lblNewLabel_1.setBounds(10, 108, 73, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		num1 = new JTextField();
		num1.setBounds(93, 66, 86, 20);
		frame.getContentPane().add(num1);
		num1.setColumns(10);
		
		num2 = new JTextField();
		num2.setBounds(93, 105, 86, 20);
		frame.getContentPane().add(num2);
		num2.setColumns(10);
		
		JButton botonSuma = new JButton("Suma");
		botonSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double resultado2= Double.parseDouble(num1.getText()) + Double.parseDouble(num2.getText());
				resultado.setText(resultado2.toString());
			}
		});
		botonSuma.setBounds(24, 154, 89, 23);
		frame.getContentPane().add(botonSuma);
		
		JButton botonResta = new JButton("Resta");
		botonResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double resultado1 = Double.parseDouble(num1.getText())-Double.parseDouble(num2.getText());
				resultado.setText(resultado1.toString());
			}
		});
		botonResta.setBounds(151, 154, 89, 23);
		frame.getContentPane().add(botonResta);
		
		resultado = new JTextField();
		resultado.setEditable(false);
		resultado.setBounds(93, 188, 86, 20);
		frame.getContentPane().add(resultado);
		resultado.setColumns(10);
	}

}
