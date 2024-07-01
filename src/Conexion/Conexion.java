/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author joelv
 */
public class Conexion {
    Connection con;
    
    public Connection Conectar() {
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/practicvisual", "root", "");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la Conexión de la BD: " + ex);
        }
        
        return con;
    }
    
    public static void main(String[] args) {
        Conexion con = new Conexion();
        con.Conectar();
    }
}
