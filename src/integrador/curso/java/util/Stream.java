package integrador.curso.java.util;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Clase que permite trabajar con streaming de caracteres.
 *
 * @author Miguel (curso Java 1 - SMATA centro8)
 */
public class Stream {

    public static void print(String filename) {
        FileReader in;
        int car;
        try {
            in = new FileReader(filename);
            while((car = in.read()) != -1){
                System.out.print((char)car);
            }
            in.close();
        } catch (IOException ex) {
            X.print(ex);
        }
        System.out.println();
    }
    public static String getText(String filename){
        FileReader in;
        int car;
        //String texto = "";
        StringBuffer texto = new StringBuffer();
        try{
            in = new FileReader(filename);
            while((car = in.read()) != -1){
                texto.append((char)car);
            }
            in.close();
        }catch (IOException e){
            X.print(e);
        }
        return texto.toString();
    }
    public static void setText(String filename, String text){
        FileWriter out;
        try {
            out = new FileWriter(filename);
            out.write(text);
            out.close();
        } catch (Exception e) {
            X.print(e);
        }
    }
    public static void append(String filename, String text){
        FileWriter out;
        try {
            out = new FileWriter(filename, true);
            out.write(text);
            out.close();
        } catch (Exception e) {
            X.print(e);
        }
    }
}
