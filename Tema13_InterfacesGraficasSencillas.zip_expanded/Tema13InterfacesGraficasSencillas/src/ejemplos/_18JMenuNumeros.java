package ejemplos;

import javax.swing.*;
import java.awt.event.*;

public class _18JMenuNumeros extends JFrame implements ActionListener{
    private JMenuBar mb;
    private JMenu menu1;
    private JMenuItem mi1,mi2;
    private JTextField tf1,tf2;
    public _18JMenuNumeros() {
    	setTitle("Menu N�meros");
    	/*
    	 * En el constructor de la clase llamamos al m�todo heredado de la clase JFrame
    	 * llamado setLayout y le pasamos como par�metro un valor null, con esto estamos
    	 * inform�ndole a la clase JFrame que utilizaremos posicionamiento absoluto para
    	 * los controles visuales dentros del JFrame.
    	 */
        setLayout(null);
        mb=new JMenuBar();
        setJMenuBar(mb);
        menu1=new JMenu("Opciones");
        mb.add(menu1);
        mi1=new JMenuItem("Redimensionar ventana");
        menu1.add(mi1);
        mi1.addActionListener(this);
        mi2=new JMenuItem("Salir");
        menu1.add(mi2);
        mi2.addActionListener(this);
        tf1=new JTextField();
        tf1.setBounds(10,10,100,30);
        add(tf1);
        tf2=new JTextField();
        tf2.setBounds(10,50,100,30);
        add(tf2);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==mi1) {
            String cad1=tf1.getText();
            String cad2=tf2.getText();
            int ancho=Integer.parseInt(cad1);
            int alto=Integer.parseInt(cad2);
            setSize(ancho,alto);
        }
        if (e.getSource()==mi2) {
            System.exit(0);
        }
    }
    
    public static void main(String[] args) {
        _18JMenuNumeros formulario1 = new _18JMenuNumeros();
        formulario1.setBounds(0,0,300,200);
        formulario1.setVisible(true);
    }    
}
