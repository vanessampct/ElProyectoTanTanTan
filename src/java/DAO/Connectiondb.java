
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connectiondb {
   
    private Connectiondb Conn = null;
    
    public Connectiondb getInstance() {
        
        if (Conn != null) {
            Conn = new Connectiondb();
        }
        return Conn;
    }
    
    
    
    private String dbname;
    private String user;
    private String password;
    private String port;
    private String driver;
    private String url;
    private Connection conn;
    
    public Connectiondb () {
        
        this.dbname = "db_inventariosusherrajes";
        this.user = "root";
        this.password = "";
        this.port = "3306";
        this.driver = "com.mysql.jdbc.Driver";
        this.url = "jdbc:mysql://localhost:" + port + "/" + dbname;       
        
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión realizada :D");  
        } catch (SQLException ex) {
            System.out.println("Excepción en la conexión: " + ex);
        } catch (ClassNotFoundException ex) {
            System.out.println("Excepción en la clase: " + ex);
        }
    }
    
    public Connection getConnect() {
        System.out.println(conn);
        return conn;
    }
    
    public void closeConnect() {
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Connectiondb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        Connectiondb conx = new Connectiondb();
        
        System.out.println(conx.getConnect());
    }
}
