package Sesion4;
import java.sql.*;
public class Main1 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        AccesoBDatos abd = new AccesoBDatos();
        abd.conectar();
        abd.categoriaMinimo();
        System.out.println("---------------------------------");
        abd.numeroPedido();
        System.out.println("---------------------------------");
        abd.cambioPrecio();
    }


}
