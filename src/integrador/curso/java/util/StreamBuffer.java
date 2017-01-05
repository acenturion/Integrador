package integrador.curso.java.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que permite trabajar con streaming por líneas / registros.
 *
 * @author Miguel (curso Java 1 - SMATA centro8)
 */
public class StreamBuffer {
    private static BufferedReader in;
    public static void open(String filename){
        try {
            in = new BufferedReader(new FileReader(filename));
        } catch (Exception e) {
            Log.set(e);
        }
    }
    public static void close(){
        try {
            in.close();
        } catch (Exception e) {
            Log.set(e);
        }
    }
    public static String getLine(){
        try {
            return in.readLine();
        } catch (Exception e) {
            Log.set(e);
            return null;
        }
    }
    public static List<String> getLines(String filename){
        List<String> lista = new ArrayList();
        String linea;
        open(filename);
        while((linea = getLine()) != null){
            lista.add(linea);
        }
        close();
        return lista;
    }
    
    public static void setText(String filename, String text){
        BufferedWriter out;
        try {
            out = new BufferedWriter(new FileWriter(filename));
            out.write(text);
            out.close();
        } catch (Exception e) {
            Log.set(e);
        }
    }
    /**
     * Método que anexa al archivo
     * @param filename
     * @param text 
     */
    public static void append(String filename, String text){
        BufferedWriter out;
        try {
            out = new BufferedWriter(new FileWriter(filename, true));
            out.write(text);
            out.close();
        } catch (Exception e) {
            Log.set(e);
        }
    }
    /**
     * Eliminar una linea del archivo de texto
     * @param filename
     * @param line 
     */
    public static void delete(String filename, String line) {
        List<String> lista = getLines(filename);
        lista.remove(line);
        setText(filename, "");
        lista.forEach(item->append(filename, item+"\n"));
    }
    
}
