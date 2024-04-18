/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Reportes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Controller.Habitacion;
import sistemareservahospedajes.Menu;

/**
 *
 * @author DELL
 */
public class FormularioReporteHabitacion extends javax.swing.JFrame {

    List<Habitacion> listaDatosHabitaciones = new ArrayList<Habitacion>();
    /**
     * Creates new form FormularioReporteHabitacion
     */
    public FormularioReporteHabitacion() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cmbTipoHabitacion = new javax.swing.JComboBox<>();
        btnVerificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Seleccione la habitación a verficar:");

        cmbTipoHabitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Individual", "Matrimonial", "Doble", "Familiar" }));

        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cmbTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(btnVerificar)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                .addComponent(btnVerificar)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed

        leerArchivoReservas();
        
        if (cmbTipoHabitacion.getSelectedItem().equals("Seleccionar")) {
            JOptionPane.showMessageDialog(null, "Seleccione un item para continuar");
            FormularioReporteHabitacion form = new FormularioReporteHabitacion();
            form.setVisible(true);
            this.dispose();
        }
        else{
        if(cmbTipoHabitacion.getSelectedItem().equals("Individual")){
            verificarTipo("Individual");
        }
        if(cmbTipoHabitacion.getSelectedItem().equals("Matrimonial")){
            verificarTipo("Matrimonial");
        }
        if(cmbTipoHabitacion.getSelectedItem().equals("Doble")){
            verificarTipo("Doble");
        }
        if(cmbTipoHabitacion.getSelectedItem().equals("Familiar")){
            verificarTipo("Familiar");
        }
        
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
        }
        
        /*for(int i=0; i<this.listaDatosHabitaciones.size(); i++){
            String dni = this.listaDatosHabitaciones.get(i).getDni();
            String nom = this.listaDatosHabitaciones.get(i).getNombre();
            String ape = this.listaDatosHabitaciones.get(i).getApellidos();
            String tel = this.listaDatosHabitaciones.get(i).getTelefono();
            String tip = this.listaDatosHabitaciones.get(i).getTipoHabitacion();

            JOptionPane.showMessageDialog(null, "DNI: " + dni);
            JOptionPane.showMessageDialog(null, "Nombre: " + nom);
            JOptionPane.showMessageDialog(null, "Apellido: " + ape);
            JOptionPane.showMessageDialog(null, "tel: " + tel);
            JOptionPane.showMessageDialog(null, "Tipo: " + tip);
        }*/
    }//GEN-LAST:event_btnVerificarActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioReporteHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioReporteHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioReporteHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioReporteHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioReporteHabitacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerificar;
    private javax.swing.JComboBox<String> cmbTipoHabitacion;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

        private void leerArchivoReservas() {
        try{
            File archivo =new File("DatosReservaHabitacion.txt");
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            
           
            String linea;
            while((linea = br.readLine()) !=null){
                br.readLine();
                br.readLine();
                br.readLine();
                br.readLine();
                br.readLine();
                br.readLine();
                String tipoHabitacion = br.readLine();
                
                br.readLine();
                
                String nombre = br.readLine();
                String apellido = br.readLine();
                String dni = br.readLine();
                String telefono = br.readLine();
                br.readLine();
               
                                
               Habitacion habitacion = new Habitacion(tipoHabitacion,nombre,apellido,dni,telefono);
               this.listaDatosHabitaciones.add(habitacion);
                               
            } fr.close();
                        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al leer Archivo");
            e.printStackTrace();
        }        
    }
    
    private void verificarTipo(String tipoVerificar) {
        //System.out.println("Tipo: " + tipoVerificar);
        
        int contador = 0;
        int posicion = 0;
        
        for(int i=0; i<this.listaDatosHabitaciones.size(); i++){
           String tipoHabitacion = this.listaDatosHabitaciones.get(i).getTipoHabitacion();
            
            if(tipoVerificar.equals(tipoHabitacion)){
                contador++;
                posicion = i;
            }
        }
        
        if(contador>=2){
            JOptionPane.showMessageDialog(null, "Es una de las habitaciones más pedidas");
            generarReporteClientesFrecuentes(tipoVerificar,contador);
        }else{
            JOptionPane.showMessageDialog(null, "No es una de las habitaciones más pedidas");
        } 
    }

    private void generarReporteClientesFrecuentes(String tipoHabitacion, int cantidad) {
        try {
            PrintWriter writer = new PrintWriter("ReporteHabitacionMasPedida.csv");

            writer.append("N. DE COINCIDENCIAS").append(";");
            writer.append("TIPO").append("\n");

            writer.append(cantidad + ";");
            writer.append(tipoHabitacion + "\n");

            writer.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "¡Hubo un ERROR al generar el reporte!");
            e.printStackTrace();
        }
    }

}
