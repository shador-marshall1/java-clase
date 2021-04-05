package resueltos;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class PanelDatos extends JPanel {

	JTextField campoNombre,campoApellidos;
	
	public PanelDatos() {
	setLayout(new GridLayout(4,2));
	JLabel etiquetaNombre = new JLabel(" Nombre: ", JLabel.RIGHT);
	campoNombre = new JTextField();
	add( etiquetaNombre);
	add( campoNombre);
	JLabel etiquetaApellidos = new JLabel(" Apellidos:", JLabel.RIGHT);
	campoApellidos = new JTextField();
	add( etiquetaApellidos);
	add( campoApellidos);
	JLabel etiquetaNP = new JLabel(" N�mero Matr�cula:", JLabel.RIGHT);
	JTextField campoNP = new JTextField();
	add( etiquetaNP);
	add( campoNP);
	ButtonGroup grupoBotones = new ButtonGroup();
	JRadioButton ma�ana = new JRadioButton(" Grupo Ma�ana", true);
	JRadioButton tarde = new JRadioButton(" Grupo Tarde");
	grupoBotones. add( ma�ana);
	grupoBotones. add( tarde);
	add( ma�ana);
	add( tarde); 
	}
	
	
}


public class Ejercicio11 extends JFrame implements ActionListener
	
	{
	
		Container p;
		List lista;
		JButton a;
		PanelDatos pd;
		
		public Ejercicio11() {
			super("Lista Alumnos");
			a = new JButton("A�adir");
			a.addActionListener(this);
			lista = new List(10);
			p= getContentPane();
			p.setLayout( new FlowLayout());
			p.add(a);
			p.add(lista);
 			{
 			
 			}
                     
     }
     
     	public void actionPerformed(ActionEvent ae){
     		
     		pd = new PanelDatos();
     		pd.setVisible(true);
     
     		if (JOptionPane.showConfirmDialog( this, pd, "Introduzca datos:",JOptionPane. OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE ) == JOptionPane.OK_OPTION) 
             {
             	String nom = pd.campoNombre.getText();
             	String ape = pd.campoApellidos.getText();
                lista.add("    " +nom + " "+ape);
             	} 
            
  
     		}
     

		public static void main( String[] args) { 
			Ejercicio11 ag = new Ejercicio11();
			ag.setSize(200,200);
			ag.setVisible(true); 
			ag.setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			
		}
}

