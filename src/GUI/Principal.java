

package GUI;

import java.awt.BorderLayout;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author MARLON
 */
public class Principal extends javax.swing.JFrame {
    
    public DefaultTableModel modelo;
    public TableRowSorter sorte = new TableRowSorter();
    Conexion con1 = new Conexion();
    
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        
        modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        tabla.setRowSorter(sorte);
        
        
        
        reportes.setSize(836, 423);
        reportes.setResizable(false);
        reportes.setLocationRelativeTo(null);
        
        retirofecha.setSize(382, 285);
        retirofecha.setResizable(false);
        retirofecha.setLocationRelativeTo(null);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        reportes = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        botonCajeros = new javax.swing.JButton();
        botonClientes = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        retirofecha = new javax.swing.JFrame();
        panelfecha = new javax.swing.JPanel();
        boton = new javax.swing.JButton();
        fecha1 = new com.toedter.calendar.JDateChooser();
        fecha2 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabla);

        botonCajeros.setText("Cajeros");
        botonCajeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCajerosActionPerformed(evt);
            }
        });

        botonClientes.setText("Clientes");
        botonClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonClientesActionPerformed(evt);
            }
        });

        jButton1.setText("dinero retirado por cajero");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Retiros");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("retiros por fecha");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("tiempos por tipo cajero");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(botonCajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botonClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(27, 27, 27)
                                .addComponent(jButton3)
                                .addGap(45, 45, 45)
                                .addComponent(jButton4)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCajeros)
                    .addComponent(botonClientes)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout reportesLayout = new javax.swing.GroupLayout(reportes.getContentPane());
        reportes.getContentPane().setLayout(reportesLayout);
        reportesLayout.setHorizontalGroup(
            reportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        reportesLayout.setVerticalGroup(
            reportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        boton.setText("Aceptar");
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });

        jLabel1.setText("Fecha Inicial");

        jLabel2.setText("Fecha Final");

        javax.swing.GroupLayout panelfechaLayout = new javax.swing.GroupLayout(panelfecha);
        panelfecha.setLayout(panelfechaLayout);
        panelfechaLayout.setHorizontalGroup(
            panelfechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelfechaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelfechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(66, 66, 66)
                .addGroup(panelfechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelfechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(boton)
                        .addComponent(fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(171, Short.MAX_VALUE))
        );
        panelfechaLayout.setVerticalGroup(
            panelfechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelfechaLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panelfechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelfechaLayout.createSequentialGroup()
                        .addGroup(panelfechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGap(67, 67, 67)
                .addComponent(boton)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout retirofechaLayout = new javax.swing.GroupLayout(retirofecha.getContentPane());
        retirofecha.getContentPane().setLayout(retirofechaLayout);
        retirofechaLayout.setHorizontalGroup(
            retirofechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelfecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        retirofechaLayout.setVerticalGroup(
            retirofechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelfecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 419, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jMenu1.setText("ver");

        jMenuItem1.setText("reportes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCajerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCajerosActionPerformed
        try {
            VaciarTabla();
            String data[][] = {};
            String col[] = {"ID CAJERO", "CIUDAD", "TIPO", "DINERO", "ESTADO", "RETIROS", "DEPOSITOS"};
            modelo = new DefaultTableModel(data, col);
            sorte.setModel(modelo);
            tabla.setModel(modelo);
            
            con1.ConexionPostgres();
            ResultSet temp = con1.consultar("SELECT * FROM cajeros;");
            
            for (int i = 0; temp.next(); i++) {
                modelo.insertRow(i, new Object[i]);
                modelo.setValueAt(temp.getString(1), i, 0);
                modelo.setValueAt(temp.getString(2), i, 1);
                modelo.setValueAt(temp.getString(3), i, 2);
                modelo.setValueAt(temp.getString(6), i, 3);
                modelo.setValueAt(temp.getBoolean(7) ? "DISPONIBLE" : "OCUPADO", i, 4);
                modelo.setValueAt(temp.getString(8), i, 5);
                modelo.setValueAt(temp.getString(9), i, 6);
            }
            
            con1.cerrar();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonCajerosActionPerformed

    private void botonClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonClientesActionPerformed
        try {
            VaciarTabla();
            String data[][] = {};
            String col[] = {"CLAVE", "NOMBRE", "SALDO", "RETIROS", "CONSIGNACIONES"};
            modelo = new DefaultTableModel(data, col);
            sorte.setModel(modelo);
            tabla.setModel(modelo);
            
            con1.ConexionPostgres();
            ResultSet temp = con1.consultar("SELECT * FROM clientes;");
            
            for (int i = 0; temp.next(); i++) {
                modelo.insertRow(i, new Object[i]);
                modelo.setValueAt(temp.getString(1), i, 0);
                modelo.setValueAt(temp.getString(2), i, 1);
                modelo.setValueAt(temp.getString(3), i, 2);
                modelo.setValueAt(temp.getString(4), i, 3);
                modelo.setValueAt(temp.getString(5), i, 4);
            }
            
            con1.cerrar();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonClientesActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        reportes.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            VaciarTabla();
            String data[][] = {};
            String col[] = {"ID CAJERO", "DINERO RETIRADO"};
            modelo = new DefaultTableModel(data, col);
            sorte.setModel(modelo);
            tabla.setModel(modelo);
            
            con1.ConexionPostgres();
            ResultSet temp = con1.consultar("SELECT cajeros.id_cajero , sum(transacciones.valor) * -1 " +
                    " FROM cajeros, transacciones" +
                    " WHERE cajeros.id_cajero = transacciones.id_cajero and transacciones.valor < 0" +
                    " group by cajeros.id_cajero ;");
            
            for (int i = 0; temp.next(); i++) {
                modelo.insertRow(i, new Object[i]);
                modelo.setValueAt(temp.getString(1), i, 0);
                modelo.setValueAt(temp.getString(2), i, 1);
            }
            
            con1.cerrar();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            VaciarTabla();
            String data[][] = {};
            String col[] = {"ID CAJERO", "CLAVE CLIENTE", "FECHA RETIRO", "DINERO RETIRADO"};
            modelo = new DefaultTableModel(data, col);
            sorte.setModel(modelo);
            tabla.setModel(modelo);
            
            con1.ConexionPostgres();
            ResultSet temp = con1.consultar("SELECT cajeros.id_cajero, clientes.clave, transacciones.fecha, transacciones.valor "
                    + " FROM transacciones, cajeros, clientes "
                    + " WHERE transacciones.clave = clientes.clave AND cajeros.id_cajero = transacciones.id_cajero;");
            
            for (int i = 0; temp.next(); i++) {
                modelo.insertRow(i, new Object[i]);
                modelo.setValueAt(temp.getString(1), i, 0);
                modelo.setValueAt(temp.getString(2), i, 1);
                modelo.setValueAt(temp.getString(3), i, 2);
                modelo.setValueAt(temp.getString(4), i, 3);
                
                //modelo.setValueAt(temp.getString(5), i, 4);
                
            }
            
            con1.cerrar();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        retirofecha.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed
        try {
            VaciarTabla();
            String data[][] = {};
            String col[] = {"ID CAJERO", "CLAVE CLIENTE", "NOMBRE CLIENTE","FECHA RETIRO", "HORA RETIRO", "DINERO RETIRADO"};
            modelo = new DefaultTableModel(data, col);
            sorte.setModel(modelo);
            tabla.setModel(modelo);
            
            String consulta = "SELECT cajeros.id_cajero, clientes.clave, clientes.nombre, transacciones.fecha, transacciones.valor * -1 "
                    + " FROM transacciones, cajeros, clientes "
                    + " WHERE transacciones.clave = clientes.clave AND cajeros.id_cajero = transacciones.id_cajero ";
            
            if (fecha1.getDate()  != null && fecha2.getDate() != null) {
                consulta += "AND fecha >= '" + Formatfecha.convertir_a_string(fecha1.getDate()) + "'  AND fecha <=  '" + Formatfecha.convertir_a_string(fecha2.getDate()) + "'  ; ";
            }
            
            
            con1.ConexionPostgres();
            ResultSet temp = con1.consultar(consulta);
            
            for (int i = 0; temp.next(); i++) {
                modelo.insertRow(i, new Object[i]);
                modelo.setValueAt(temp.getString(1).trim(), i, 0);
                modelo.setValueAt(temp.getString(2).trim(), i, 1);
                modelo.setValueAt(temp.getString(3).trim(), i, 2);
                modelo.setValueAt(temp.getString(4).substring(0, temp.getString(4).indexOf(" ")).trim(), i, 3);
                modelo.setValueAt(temp.getString(4).substring(temp.getString(4).indexOf(" "),
                        temp.getString(4).contains(".")? temp.getString(4).indexOf(".") : temp.getString(4).length()).trim(), i, 4);
                modelo.setValueAt(temp.getString(5).trim(), i, 5);
            }
            
            con1.cerrar();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        retirofecha.setVisible(false);
        
    }//GEN-LAST:event_botonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            VaciarTabla();
            String data[][] = {};
            String col[] = {"TIPO CAJERO", "TIEMPO (milisegundos)"};
            modelo = new DefaultTableModel(data, col);
            sorte.setModel(modelo);
            tabla.setModel(modelo);
            
            con1.ConexionPostgres();
            ResultSet temp = con1.consultar("SELECT sum(transacciones.tiempo), cajeros.tipo_cajero FROM clientes , cajeros, transacciones "
                    + " WHERE transacciones.clave = clientes.clave AND cajeros.id_cajero = transacciones.id_cajero "
                    + " GROUP BY cajeros.tipo_cajero");
            
            for (int i = 0; temp.next(); i++) {
                modelo.insertRow(i, new Object[i]);
                modelo.setValueAt(temp.getString(2), i, 0);
                modelo.setValueAt(temp.getString(1), i, 1);
                
            }
            
            con1.cerrar();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed
    
    
    void VaciarTabla ()
    {
        int filas = modelo.getRowCount();
        for (int i = 0; i < filas; i++) {
            modelo.removeRow(0);
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton;
    private javax.swing.JButton botonCajeros;
    private javax.swing.JButton botonClientes;
    private com.toedter.calendar.JDateChooser fecha1;
    private com.toedter.calendar.JDateChooser fecha2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelfecha;
    private javax.swing.JFrame reportes;
    private javax.swing.JFrame retirofecha;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
