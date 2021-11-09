package Login;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {


    public static Connection getConexion() {
            String url = "jdbc:sqlserver://DESKTOP-9G9OQ59:1433;"+"databaseName=sarabank;"
                   +"user=sa;"
                   +"password=hosama421;"
                   +"loginTimeout=30"; // con esta linea le damos un limite de tiempo para que java se conecte a la DB
        try {
           
            Connection con = DriverManager.getConnection(url);
            return con;
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
  
    }  

}
