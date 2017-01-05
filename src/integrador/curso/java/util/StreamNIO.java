package integrador.curso.java.util;

import java.io.BufferedWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

/**
 * Stream que usa el paquete NIO y permite concurrencia en la escritura de datos.
 * Muchos pueden acceder al metodo de escritura a la vez
 * @author centro8-aula1
 */
public class StreamNIO {
    //private static Charset charset = Charset.forName(StandardCharsets.UTF_8.toString());
    // equivalente a:
    private static Charset charset = Charset.forName("UTF-8");
    
    public static void setText(String filename, String text){
        Path archivo = Paths.get(filename);
        BufferedWriter out;
        try {
            out = Files.newBufferedWriter(archivo, charset, StandardOpenOption.TRUNCATE_EXISTING);
            out.write(text);
            out.close();
        } catch (Exception e) {
            Log.set(e);
        }
    }
    public static void append(String filename, String text){
        Path archivo = Paths.get(filename);
        BufferedWriter out;
        try {
            out = Files.newBufferedWriter(archivo, charset, StandardOpenOption.APPEND);
            out.write(text);
            out.close();
        } catch (Exception e) {
            Log.set(e);
        }
    }
    
    public static List<String> getText(String filename){
        Path archivo = Paths.get(filename);
        List<String> lineas = new ArrayList();
        try {
            lineas = Files.readAllLines(archivo, charset);
        } catch (Exception e) {
            Log.set(e);
        }
        return lineas;
    }
    
}
