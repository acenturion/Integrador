package integrador.curso.java.util;

import javax.swing.JComponent;

public class Ventanas {
 /**
     * Método para mostrar y centrar nuevas ventanas.
     * 
     * @param desktop  Ventana principal
     * @param va (JInternalFrame) emergente que se va a centrar
     */
    public static void centrar(JComponent desktop, JComponent va) {
        desktop.add(va);
        va.setLocation((desktop.getSize().width - va.getSize().width) / 2, (desktop.getSize().height - va.getSize().height) / 2);
        va.setVisible(true);
    }

}
