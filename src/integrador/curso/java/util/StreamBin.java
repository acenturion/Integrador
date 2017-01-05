package integrador.curso.java.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
/**
 * Clase que permite trabajar con streaming de archivos binarios.
 *
 * @author Miguel (curso Java 1 - SMATA centro8)
 */
public class StreamBin {

    public static void copiar(String origen, String destino) {
        FileInputStream in;
        FileOutputStream out;
        int b; // byte
        try {
            in = new FileInputStream(origen);
            out = new FileOutputStream(destino);
            while ((b = in.read()) != -1) {
                out.write(b);
            }
            out.close();
            in.close();
        } catch (Exception e) {
            Log.set(e);
        }
    }

    public static boolean comparar(String filename1, String filename2) {
        FileInputStream in1, in2;
        int b1, b2;
        try {
            in1 = new FileInputStream(filename1);
            in2 = new FileInputStream(filename2);
            while ((b1 = in1.read()) != -1 && (b2 = in2.read()) != -1) {
                if (b1 != b2) {
                    in1.close();
                    in2.close();
                    return false;
                }
            }
            in1.close();
            in2.close();
        } catch (Exception e) {
            Log.set(e);
            return false;
        }
        return true;
    }
}