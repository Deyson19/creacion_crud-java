
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conectar {
    
    Connection cn;
    
    public Connection conexion(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/empleados","root","");
            System.out.println("Conectado");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return cn;
    }
    
}
