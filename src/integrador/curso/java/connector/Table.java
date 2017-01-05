package integrador.curso.java.connector;

import integrador.curso.java.util.Log;
import integrador.curso.java.util.X;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Table {
    private static Connection con;
    public static void connect(){
        try {
            con = Connector.getConnection();
        } catch (Exception e) {
            Log.set(e);
        }
    }
    
    public static void close(){
        try {
            con.close();
        } catch (Exception e) {
            Log.set(e);
        }
    }
    /**
     * Ejecuta consultas de actualización (insert, delete, update)
     * @param query consulta que va a ser ejecutada
     */
    public static void execute(String query){
        connect();
        X.title("Query");
        X.print(query);
        X.line();
        try {
            con.createStatement().execute(query);
        } catch (Exception e) {
            Log.set(e);
        }
        close();
    }
    private static String query;

    private static int execute() {
        connect();
        X.setLineLength(query.length());
        X.title("Update query");
        X.print(query);
        X.line();
        X.setLineLength(55);
        int x = 0;
        try {
            x = con.createStatement().executeUpdate(query);
        } catch (Exception e) {
            Log.set(e);
        }
        close();
        return x;
    }
    
    public static int delete(String table, String filtro) {
        query = "delete from " + table + " where " + filtro;
        return execute();
    }
    public static int insert(String table, String fields, String values){
        query = "insert into "+table+" ("+fields+") values ("+values+")" ;
        return execute();
    }
    public static int update(String table, String filtro, String set){
        query = "update "+table+" set "+set+" where "+filtro;
        return execute();
    }
    
    public static ResultSet select(String table){
        //return select(table, "1=1");
        return select(table, "TRUE");
    }
    /**
     * Obtiene los datos de una tabla con un filtro where
     * @param table tabla que va a buscar
     * @param filtro el parametro que va a buscar por ejemplo "ID"
     * @return 
     */
    public static ResultSet select(String table, String filtro){
        String query = "select * from "+table+" where "+filtro;
        ResultSet rs = null;
        connect();
        try {
            rs = con.createStatement().executeQuery(query);
        } catch (Exception e) {
            Log.set(e);
        }
        // close(); // El usuario debe cerrar la conexión
        return rs;
    }
    
    public static List<Object> getList(String table){
        return getList(table, "TRUE");
    }
    public static List<Object> getList(String table, String filtro){
        List<Object> lista = new ArrayList();
        ResultSet rs = null;
        String query = "select * from "+table+" where "+filtro;
        connect();
        int cant;
        try {
            rs = con.createStatement().executeQuery(query);
            cant = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                Object[] obj = new Object[cant];
                for (int a = 0; a < cant; a++) {
                    obj[a] = rs.getObject(a + 1);
                }
                lista.add(obj);
            }
            rs.close();
        } catch (Exception e) {
            Log.set(e);
        }
        close();
        return lista;
    }
}
