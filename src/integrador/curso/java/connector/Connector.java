package integrador.curso.java.connector;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connector {
    private static String driver = "com.mysql.jdbc.Driver";
    private static String vendor = "mysql";
    private static String server = "localhost";
    private static String port = "3306";
    private static String db = "integrador";
    private static String user = "root";
    private static String pass = "1234";
    
    private static String url = "jdbc:"+vendor+"://"+server+":"+port+"/"+db;
    
    public static Connection getConnection() throws Exception{
        Class.forName(driver).newInstance();
        return DriverManager.getConnection(url, user, pass);
    }
    
}
