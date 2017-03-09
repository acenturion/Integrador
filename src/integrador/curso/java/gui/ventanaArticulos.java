package integrador.curso.java.gui;

import integrador.curso.java.connector.Table;
import integrador.curso.java.util.Box;
import integrador.curso.java.util.SwingTable;
import integrador.curso.java.util.Ventanas;

public class ventanaArticulos extends javax.swing.JInternalFrame {

   
    public ventanaArticulos() {
        super(
                "Articulos",    // Titulo
                false,                  // cambiar de tamaño
                true,                   // Cerrar
                false,                  // Maximizable
                true                    // Minimizable
        );
        initComponents();
        cargar();
    }
    
    public void cargar(){
       SwingTable.cargar(Table.select("articulos"), tblArticulos);
    }
    
    public boolean validar(){
        return true;
    }
    
    public void limpiar(){
        txtCodigoBarra.setText("");
        txtDescripcion.setText("");
        txtNombreArticulo.setText("");
        txtPrecio.setText("");
        txtStock.setText("");
       
        txtCodigoBarra.requestFocus();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCargarArticulo = new javax.swing.JButton();
        btnModificarArticulo = new javax.swing.JButton();
        txtCodigoBarra = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblArticulos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextPane();
        btnLimpiar = new javax.swing.JButton();
        txtNombreArticulo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("Articulos");

        jLabel2.setText("Codigo Barra");

        jLabel3.setText("Descripcion");

        jLabel4.setText("Precio");

        jLabel5.setText("Stock");

        btnCargarArticulo.setText("Cargar");
        btnCargarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarArticuloActionPerformed(evt);
            }
        });

        btnModificarArticulo.setText("Modificar");
        btnModificarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarArticuloActionPerformed(evt);
            }
        });

        tblArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblArticulos);

        jScrollPane2.setViewportView(txtDescripcion);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel8.setText("Nombre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel8))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2)
                                .addComponent(txtCodigoBarra, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                                .addComponent(txtNombreArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel4)
                            .addGap(49, 49, 49)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtStock, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(btnCargarArticulo)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificarArticulo)
                        .addGap(39, 39, 39)
                        .addComponent(btnLimpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigoBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCargarArticulo)
                    .addComponent(btnModificarArticulo)
                    .addComponent(btnLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarArticuloActionPerformed
        //boton modificar articulo 
       
        String idArticulo;
        
        if (tblArticulos.getSelectedRow() != -1) {
            idArticulo= tblArticulos.getValueAt(tblArticulos.getSelectedRow(), 0)+"";
            Ventanas.centrar(getDesktopPane(), new modificarArticulo(idArticulo,this));
           
        } else {
            Box.error(this, "Seleccionar Articulo");
        }
        
    }//GEN-LAST:event_btnModificarArticuloActionPerformed

    private void btnCargarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarArticuloActionPerformed
        // Boton Cargar Articulo
        
        String fields = "codigoBarra,nombre,descripcion,precio,stock";
        String values;

        if (validar()) {
            values = "'" + txtCodigoBarra.getText() + "', '" + txtNombreArticulo.getText()+ "', '" + txtDescripcion.getText()+ "', '" + txtPrecio.getText() + "', '" + txtStock.getText()+"'";
            int x = Table.insert("articulos", fields, values);
            Box.msg(this, "Se ha insertado " + x + " Articulos.");
        }
        cargar();
        limpiar();
    }//GEN-LAST:event_btnCargarArticuloActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // Boton limpiar campos
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarArticulo;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificarArticulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblArticulos;
    private javax.swing.JTextField txtCodigoBarra;
    private javax.swing.JTextPane txtDescripcion;
    private javax.swing.JTextField txtNombreArticulo;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
