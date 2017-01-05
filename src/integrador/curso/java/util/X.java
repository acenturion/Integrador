package integrador.curso.java.util;

import java.util.Scanner;

/**
 * Clase que representa la consola del sistema.
 * Creado: 06/10/2016
 * Modificación:
 * @author Curso de técnicas de programación
 */
public class X {
    private static int deflen = 55;
    private static String c = "─";
    //private static String c = "-"; // 
    private static String t = "═";
    //private static String t = X.c;
    public static void print(Object obj){
        System.out.println(obj);
    }
    public static void setLineLength(int len){
        X.deflen = len;
    }
    public static void title(Object obj){
        title(obj, X.deflen);
    }
    public static void title(Object obj, int len){
        String ret = "";
        if(obj.toString().length() < len-4){
            int x = (int)Math.floor((len-obj.toString().length())/2)-1;
            ret = "";
            for (int a = 1; a < x; a++) {
                ret += X.t;
            }
            ret = ret+" ⨯ "+obj.toString()+" ⨯ ";
            int resto = len-(ret.length());
            for (int a = 0; a < resto; a++) {
                ret += X.t;
            }
            ret +="";
        }else{
            ret = X.t+" "+obj.toString()+" "+X.t;
        }
        System.out.println(ret);
    }
    
    public static void newLine(){
        System.out.println();
    }
    public static void line(){
        line(X.deflen);
    }
    
    public static void line(int cantidad){
        for (int a = 1; a <= cantidad; a++) System.out.print(X.c);
        System.out.println();
    }
    public static String input(String msg){
        System.out.println(msg);
        return new Scanner(System.in).next();
    }
    public static int inputInt(String msg){
        System.out.println(msg);
        return new Scanner(System.in).nextInt();
    }
    public static float inputFloat(String msg){
        System.out.println(msg);
        return new Scanner(System.in).nextFloat();
    }
}
