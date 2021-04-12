package Ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Ej5 {

	private JFrame frame;
	private JTextField dato1;
	private JTextField dato2;
	private JTextField resultado1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej5 window = new Ej5();
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
	public Ej5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("d:\\perfiles\\dam1alu13\\Pictures\\Kent.jpg"));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\perfiles\\dam1alu13\\git\\java-clase\\EjerciciosTema13\\imagenes\\calculadora.jpg"));
		lblNewLabel.setBounds(42, 11, 107, 54);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Dato1");
		lblNewLabel_1.setBounds(10, 76, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Dato2");
		lblNewLabel_2.setBounds(10, 97, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Resultado");
		lblNewLabel_3.setBounds(10, 122, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		dato1 = new JTextField();
		dato1.setBounds(84, 73, 86, 20);
		frame.getContentPane().add(dato1);
		dato1.setColumns(10);
		
		dato2 = new JTextField();
		dato2.setBounds(84, 94, 86, 20);
		frame.getContentPane().add(dato2);
		dato2.setColumns(10);
		
		resultado1 = new JTextField();
		resultado1.setEditable(false);
		resultado1.setBounds(84, 119, 86, 20);
		frame.getContentPane().add(resultado1);
		resultado1.setColumns(10);
		
		JButton btnSuma = new JButton("Suma");
		btnSuma.setBounds(245, 42, 89, 23);
		frame.getContentPane().add(btnSuma);
		btnSuma.addActionListener(new Oyente1());
		
		JButton btnResta = new JButton("Resta");
		btnResta.setBounds(245, 72, 89, 23);
		frame.getContentPane().add(btnResta);
		btnResta.addActionListener(new Oyente2());
		
		JButton btnMulti = new JButton("Multiplicacion");
		btnMulti.setBounds(245, 106, 89, 23);
		frame.getContentPane().add(btnMulti);
		btnMulti.addActionListener(new Oyente3());
		
		JButton btnDiv = new JButton("Division");
		btnDiv.setBounds(245, 140, 89, 23);
		frame.getContentPane().add(btnDiv);
		btnDiv.addActionListener(new Oyente4());
		
		JButton btnSalida = new JButton("");
		btnSalida.setIcon(new ImageIcon("D:\\perfiles\\dam1alu13\\git\\java-clase\\EjerciciosTema13\\imagenes\\puerta.jpg"));
		btnSalida.setBounds(20, 147, 51, 54);
		frame.getContentPane().add(btnSalida);
		btnSalida.addActionListener(new Oyente5());
		
		JButton btnCreditos = new JButton("");
		btnCreditos.setIcon(new ImageIcon("D:\\perfiles\\dam1alu13\\git\\java-clase\\EjerciciosTema13\\imagenes\\hombre.png"));
		btnCreditos.setBounds(84, 154, 46, 47);
		frame.getContentPane().add(btnCreditos);
		//btnCreditos.addActionListener(new Oyente6());
	}
	class Oyente1 implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			Double resultado2= Double.parseDouble(dato1.getText()) + Double.parseDouble(dato2.getText());
			resultado1.setText(resultado2.toString());
			
		}
		
	}
	class Oyente2 implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			Double resultado2= Double.parseDouble(dato1.getText()) - Double.parseDouble(dato2.getText());
			resultado1.setText(resultado2.toString());
			
		}
		
	}
	class Oyente3 implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			Double resultado2= Double.parseDouble(dato1.getText()) * Double.parseDouble(dato2.getText());
			resultado1.setText(resultado2.toString());
			
		}
		
	}
	class Oyente4 implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			Double resultado2= Double.parseDouble(dato1.getText()) / Double.parseDouble(dato2.getText());
			resultado1.setText(resultado2.toString());
			
		}
		
	}
	class Oyente5 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
			
		}
		
	}
}
