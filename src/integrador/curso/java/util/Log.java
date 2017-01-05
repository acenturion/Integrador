package integrador.curso.java.util;

import java.net.InetAddress;
import java.util.Date;

public class Log {
    private static final String FILE = "log.csv";
    private static void append(Exception ex){
        Date date = new Date();
        String user = System.getProperty("user.name");
        InetAddress host = null; // puede arrojar "unknown host exception"
        try {
            host = InetAddress.getLocalHost();
        } catch (Exception e) {
            System.out.println(e);
        }
        String registro = date+";"+host+";"+user+";"+ex+"\n";
        Stream.append(FILE, registro);
    }
    /**
     * Método Set log para usar en entornos de escritorio o aplicaciones de consola
     * @param ex Excepción
     */
    public static void set(Exception ex){
        append(ex);
        Box.error("Ocurrió un error.");
    }
    /**
     * Método Set log para usar en entorno web donde componentes de entorno
     * gráfico como "Swing" o "Fx" no compilan
     * @param ex Excepción
     */
    public static void setS(Exception ex){
        append(ex);
        X.print("Ocurrió un error.");
    }
}
