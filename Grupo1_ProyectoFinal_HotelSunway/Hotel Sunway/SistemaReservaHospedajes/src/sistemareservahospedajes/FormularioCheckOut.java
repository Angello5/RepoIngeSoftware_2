/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistemareservahospedajes;

import Controller.Reserva;
import Controller.Habitacion;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alejandro
 */
public class FormularioCheckOut extends javax.swing.JFrame {

    /**
     * Creates new form FormularioCheckOut
     */
    List<Habitacion> lstHabDisponibles = new ArrayList<Habitacion>();
    List<Reserva> lstHabOcupadas = new ArrayList<Reserva>();
    List<Reserva> lstDatosReserva = new ArrayList<Reserva>();
    
    
    String datos[][]={};
    String columna[]={"Codigo","Habitacion","Tipo","Costo","Monto Total","Estado","Fecha de Ingreso","Fecha de salida"};        
    DefaultTableModel modeloTabla = new DefaultTableModel(datos,columna)
    {
        @Override
        public boolean isCellEditable(int row, int column)
        {
            return false;
        }
    };
    
    Date fechaActual = new Date();
    SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
    
    public FormularioCheckOut() {
        initComponents();
        this.setLocationRelativeTo(null);
        leeHabitacionesDisponibles();
        leeDatosHabOcupadas();
        leeDatosReservaHabitacion();
        generarTabla();
        
        jDateCancelacion.setDate(fechaActual);
        jDateCancelacion.setMinSelectableDate(fechaActual);
        jDateCancelacion.setMaxSelectableDate(fechaActual);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHabOcupados = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jDateCancelacion = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        btnProcesar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtFechaReserva = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNomReserva = new javax.swing.JTextField();
        txtDniReserva = new javax.swing.JTextField();
        txtApeReserva = new javax.swing.JTextField();
        txtTelefReserva = new javax.swing.JTextField();
        btnMenu = new javax.swing.JButton();
        btnFinalizarHab = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaHabOcupados.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaHabOcupados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaHabOcupadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaHabOcupados);

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 16)); // NOI18N
        jLabel1.setText("CHECKOUT  -  HABITACIONES");

        jLabel2.setText("Fecha de cancelación de habitación:");

        btnProcesar.setText("Cobro por habitacion");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });

        jLabel3.setText("Fecha que se realizó la reserva:");

        txtFechaReserva.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFechaReserva.setEnabled(false);
        txtFechaReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaReservaActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombre: ");

        jLabel5.setText("DNI:");

        jLabel6.setText("Apellidos:");

        jLabel7.setText("Telefono:");

        txtNomReserva.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNomReserva.setEnabled(false);

        txtDniReserva.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtDniReserva.setEnabled(false);

        txtApeReserva.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtApeReserva.setEnabled(false);

        txtTelefReserva.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTelefReserva.setEnabled(false);

        btnMenu.setText("Volver al menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        btnFinalizarHab.setText("Finalizar habitacion");
        btnFinalizarHab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFinalizarHabMouseClicked(evt);
            }
        });
        btnFinalizarHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarHabActionPerformed(evt);
            }
        });

        jLabel8.setText("**Cambiar el estado de habitacion");

        jLabel9.setText("de Ocupado a Disponible**");

        jLabel10.setText("**Para poder cobrar por la habitación reservada**");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(132, 132, 132)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jDateCancelacion, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFechaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(119, 119, 119)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNomReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDniReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(45, 45, 45)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(txtTelefReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtApeReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnFinalizarHab, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(44, 44, 44))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtFechaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFinalizarHab, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateCancelacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(txtNomReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApeReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(txtDniReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        // TODO add your handling code here:
        int filaObtenida= tablaHabOcupados.getSelectedRow();
        
        String fReserva = txtFechaReserva.getText();
        String fIngresoReserva = lstHabOcupadas.get(filaObtenida).getFechaIngreso();
        String fSalidaReserva = lstHabOcupadas.get(filaObtenida).getFechaSalida();
        String fCancelacion = formatoFecha.format(jDateCancelacion.getDate());
        String HabitacionReserva = lstHabOcupadas.get(filaObtenida).getNumeroHabitacion();
        String tipoHabReserva = lstHabOcupadas.get(filaObtenida).getTipoHabitacion();
        float costoReserva = lstHabOcupadas.get(filaObtenida).getCostoHabitacion();
        float montoTotalReserva = lstHabOcupadas.get(filaObtenida).getMontoTotal();
        String nombreReserva = txtNomReserva.getText();
        String apellidosReserva = txtApeReserva.getText();
        String dniReserva = txtDniReserva.getText();
        String telefonoReserva = txtTelefReserva.getText();
        
        Reserva reserva = new Reserva(fReserva,fIngresoReserva,fSalidaReserva,fCancelacion,HabitacionReserva,tipoHabReserva,
                        costoReserva,nombreReserva,apellidosReserva,dniReserva,telefonoReserva,montoTotalReserva);
        
        lstDatosReserva.add(reserva);
        
        generaArchivoDatosReserva();
        generarReporteReservas();
        JOptionPane.showMessageDialog(null, "El CheckOut de la habitación ha sido realizado satisfactoriamente.");
        
        
        /*String habCambiar;
        for(int i=0;i<lstHabDisponibles.size();i++)
        {
            for(int j=0;j<lstHabOcupadas.size();j++)
                {
                    habCambiar = lstHabDisponibles.get(i).getNumeroHabitacion();
                    if(habCambiar.equals(lstHabOcupadas.get(j).getNumeroHabitacion()))
                    {
                        System.out.println(lstHabOcupadas.get(j).getNumeroHabitacion());
                        //this.lstHabDisponibles.remove(i);
                    }
                }
        }*/
                
    }//GEN-LAST:event_btnProcesarActionPerformed

    private void txtFechaReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaReservaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtFechaReservaActionPerformed

    private void tablaHabOcupadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaHabOcupadosMouseClicked
        // TODO add your handling code here:
        int filaSeleccionada = tablaHabOcupados.getSelectedRow();
        
        txtFechaReserva.setText(lstHabOcupadas.get(filaSeleccionada).getFechaReserva());
        txtNomReserva.setText(lstHabOcupadas.get(filaSeleccionada).getNombre());
        txtApeReserva.setText(lstHabOcupadas.get(filaSeleccionada).getApellidos());
        txtDniReserva.setText(lstHabOcupadas.get(filaSeleccionada).getDni());
        txtTelefReserva.setText(lstHabOcupadas.get(filaSeleccionada).getTelefono());
    }//GEN-LAST:event_tablaHabOcupadosMouseClicked

    private void btnFinalizarHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarHabActionPerformed
        // TODO add your handling code here:
        boolean estado1=false;
        int filaSelect = tablaHabOcupados.getSelectedRow();
        
        if(filaSelect>=0)
        {
        String habCambiar;
        for(int i=0;i<lstHabDisponibles.size();i++)
        {
            habCambiar = lstHabOcupadas.get(filaSelect).getNumeroHabitacion();
            if(habCambiar.equals(this.lstHabDisponibles.get(i).getNumeroHabitacion()))
            {
                this.lstHabDisponibles.get(i).setEstado("Disponible");
                estado1=true;
            }   
        }
        //Para evitar un error en el arraList
        if(estado1==true)
        {
            lstHabOcupadas.remove(filaSelect);
        }
        
        generaArchivoHabOcupadas();
        generaArchivoHabitacionDisponible();    
                
            JOptionPane.showMessageDialog(this, "La habitación escogida ha dejado de estar ocupada."); 
            FormularioVerHabitaciones menu = new FormularioVerHabitaciones();
            menu.setVisible(true);
            this.dispose(); 
        }
        else{
            JOptionPane.showMessageDialog(this, "Seleccionar una fila con los datos de la reserva.");
        }
    }//GEN-LAST:event_btnFinalizarHabActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
               
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnFinalizarHabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinalizarHabMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFinalizarHabMouseClicked

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
            java.util.logging.Logger.getLogger(FormularioCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioCheckOut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizarHab;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnProcesar;
    private com.toedter.calendar.JDateChooser jDateCancelacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaHabOcupados;
    private javax.swing.JTextField txtApeReserva;
    private javax.swing.JTextField txtDniReserva;
    private javax.swing.JTextField txtFechaReserva;
    private javax.swing.JTextField txtNomReserva;
    private javax.swing.JTextField txtTelefReserva;
    // End of variables declaration//GEN-END:variables
    public void leeHabitacionesDisponibles()
    {
        try
        {
            String estado = "";
            String numeroHab="";
            String tipoHab = "";
            float costoHab = 0;
            File archivo= new File("HabDisponibles.txt");
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            
            String linea1;
            br.readLine();
            while((linea1 = br.readLine())!=null)
            {
                Habitacion habitacion = new Habitacion(estado,numeroHab,tipoHab,costoHab);
                
                habitacion.setEstado(linea1);
                habitacion.setNumeroHabitacion(br.readLine());
                habitacion.setTipoHabitacion(br.readLine());
                habitacion.setCostoHabitacion(Float.parseFloat(br.readLine()));
                this.lstHabDisponibles.add(habitacion);
            }
            fr.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error al cargar datos.");
            e.printStackTrace();
        }
    }
    
    public void generaArchivoHabitacionDisponible()
    {
        try
        {
            PrintWriter writer = new PrintWriter("HabDisponibles.txt");
            
            
            writer.println("Habitaciones Disponibles: ");
            for(int i=0;i<this.lstHabDisponibles.size();i++)
            {
                writer.println(this.lstHabDisponibles.get(i).getEstado());
                writer.println(this.lstHabDisponibles.get(i).getNumeroHabitacion());
                writer.println(this.lstHabDisponibles.get(i).getTipoHabitacion());
                writer.println(this.lstHabDisponibles.get(i).getCostoHabitacion());
            }
            writer.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error en el sistema");
            e.printStackTrace();
        }
    }
    
    public void leeDatosHabOcupadas() 
    {
        try{
            String codigo = "";
            String fechaReserva = "";
            String fechaIngreso = "";
            String fechaSalida = "";
            String numeroHabitacion = "";
            String tipoHabitacion = "";
            float costoHabitacion = 0;
            float montoTotal = 0;
            String nombre = "";
            String apellidos = "";
            String dni = "";
            String telefono = "";

            

            File archivo = new File("HabOcupadas.txt");
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);   

            String lineaDatos1;
            String lineaDatos2;
            //si no hay nada para leer en el archivo txt, entonces esta parte se omitirá
            //hasta que por fin se agregue los datos de las reservas y se guarden en el archivo
            if((lineaDatos1=br.readLine()) != null)
            {   
                while((lineaDatos2=br.readLine())!=null)
                {
                    Reserva reserva = new Reserva(codigo, fechaReserva, fechaIngreso, fechaSalida,numeroHabitacion,
                            tipoHabitacion,costoHabitacion,montoTotal,nombre,apellidos,dni,telefono);
                    reserva.setCodigoReserva(lineaDatos2);
                    reserva.setFechaReserva(br.readLine());
                    reserva.setFechaIngreso(br.readLine());
                    reserva.setFechaSalida(br.readLine());
                    reserva.setNumeroHabitacion(br.readLine());
                    reserva.setTipoHabitacion(br.readLine());
                    reserva.setCostoHabitacion(Float.parseFloat(br.readLine()));
                    reserva.setMontoTotal(Float.parseFloat(br.readLine()));
                    reserva.setNombre(br.readLine());
                    reserva.setApellidos(br.readLine());
                    reserva.setDni(br.readLine());
                    reserva.setTelefono(br.readLine());
                    this.lstHabOcupadas.add(reserva);
                    br.readLine();
                }
                fr.close();    
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al cargar datos.");
            e.printStackTrace();
        }
    }
    
    public void generaArchivoHabOcupadas()
    {
        try{
            PrintWriter writer = new PrintWriter("HabOcupadas.txt");
            
            for(int i=0;i<this.lstHabOcupadas.size();i++)
            {

                writer.println("Habitaciones Ocupadas #"+(i+1));
                writer.println(i+1);
                writer.println(this.lstHabOcupadas.get(i).getFechaReserva());
                writer.println(this.lstHabOcupadas.get(i).getFechaIngreso());
                writer.println(this.lstHabOcupadas.get(i).getFechaSalida());
                writer.println(this.lstHabOcupadas.get(i).getNumeroHabitacion());
                writer.println(this.lstHabOcupadas.get(i).getTipoHabitacion());
                writer.println(this.lstHabOcupadas.get(i).getCostoHabitacion());
                writer.println(this.lstHabOcupadas.get(i).getMontoTotal());
                writer.println(this.lstHabOcupadas.get(i).getNombre());
                writer.println(this.lstHabOcupadas.get(i).getApellidos());
                writer.println(this.lstHabOcupadas.get(i).getDni());
                writer.println(this.lstHabOcupadas.get(i).getTelefono());
            }
            writer.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en el sistema");
            e.printStackTrace();
        }
    }
    
    
    public void leeDatosReservaHabitacion()
    {
        try{
            String codigoHabReserva = "";
            String fHabReserva = "";
            String fIngresoReserva = "";
            String fSalidaReserva = "";
            String fCancelacionReserva = "";
            String numeroHabReserva = "";
            String tipoHabReserva = "";
            float costoHabReserva = 0;
            float montoTotalReserva = 0;
            String nombreReserva = "";
            String apellidosReserva = "";
            String dniReserva = "";
            String telefonoReserva = "";

            

            File archivo = new File("DatosReservaHabitacion.txt");
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);   
            
            String lineaDatos1;
            String lineaDatos2;
            //si no hay nada para leer en el archivo txt, entonces esta parte se omitirá
            //hasta que por fin se agregue los datos de las reservas y se guarden en el archivo
            if((lineaDatos1=br.readLine()) != null)
            {   
                while((lineaDatos2=br.readLine())!=null)
                {
                    Reserva reserva = new Reserva(codigoHabReserva, fHabReserva, fIngresoReserva, fSalidaReserva,fCancelacionReserva ,numeroHabReserva,
                            tipoHabReserva,costoHabReserva ,nombreReserva,apellidosReserva,dniReserva,telefonoReserva,montoTotalReserva);
                    reserva.setCodigoReserva(lineaDatos2);
                    reserva.setFechaReserva(br.readLine());
                    reserva.setFechaIngreso(br.readLine());
                    reserva.setFechaSalida(br.readLine());
                    reserva.setFechaCancelacion(br.readLine());
                    reserva.setNumeroHabitacion(br.readLine());
                    reserva.setTipoHabitacion(br.readLine());
                    reserva.setCostoHabitacion(Float.parseFloat(br.readLine()));
                    reserva.setNombre(br.readLine());
                    reserva.setApellidos(br.readLine());
                    reserva.setDni(br.readLine());
                    reserva.setTelefono(br.readLine());
                    reserva.setMontoTotal(Float.parseFloat(br.readLine()));
                    this.lstDatosReserva.add(reserva);
                    br.readLine();
                }
                fr.close();    
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al cargar datos.");
            e.printStackTrace();
        }
    }
    
    public void generaArchivoDatosReserva()
    {
                try{
            PrintWriter writer = new PrintWriter("DatosReservaHabitacion.txt");
            
            for(int i=0;i<this.lstDatosReserva.size();i++)
            {

                writer.println("Registro de habitación reservada #"+(i+1));
                writer.println(i+1);
                writer.println(this.lstDatosReserva.get(i).getFechaReserva());
                writer.println(this.lstDatosReserva.get(i).getFechaIngreso());
                writer.println(this.lstDatosReserva.get(i).getFechaSalida());
                writer.println(this.lstDatosReserva.get(i).getFechaCancelacion());
                writer.println(this.lstDatosReserva.get(i).getNumeroHabitacion());
                writer.println(this.lstDatosReserva.get(i).getTipoHabitacion());
                writer.println(this.lstDatosReserva.get(i).getCostoHabitacion());
                writer.println(this.lstDatosReserva.get(i).getNombre());
                writer.println(this.lstDatosReserva.get(i).getApellidos());
                writer.println(this.lstDatosReserva.get(i).getDni());
                writer.println(this.lstDatosReserva.get(i).getTelefono());
                writer.println(this.lstDatosReserva.get(i).getMontoTotal());
            }
            writer.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en el sistema");
            e.printStackTrace();
        }
    }
    
    private void generarReporteReservas() {
        try {
            PrintWriter writer = new PrintWriter("ReporteReservasHabitaciones.csv");

            writer.append("Cod").append(";");
            writer.append("F. de Reserva").append(";");
            writer.append("F. de Ingreso").append(";");
            writer.append("F. de Salida").append(";");
            writer.append("F. de Cancelacion").append(";");
            writer.append("# Habitacion").append(";");
            writer.append("Tipo").append(";");
            writer.append("Costo").append(";");
            writer.append("Nombre").append(";");
            writer.append("Apellidos").append(";");
            writer.append("DNI").append(";");
            writer.append("Telefono").append(";");
            writer.append("Monto total").append("\n");
            
            for(int i=0;i<this.lstDatosReserva.size();i++)
            {

                writer.append(i+1+";");
                writer.append(this.lstDatosReserva.get(i).getFechaReserva()+";");
                writer.append(this.lstDatosReserva.get(i).getFechaIngreso()+";");
                writer.append(this.lstDatosReserva.get(i).getFechaSalida()+";");
                writer.append(this.lstDatosReserva.get(i).getFechaCancelacion()+";");
                writer.append(this.lstDatosReserva.get(i).getNumeroHabitacion()+";");
                writer.append(this.lstDatosReserva.get(i).getTipoHabitacion()+";");
                writer.append(this.lstDatosReserva.get(i).getCostoHabitacion()+";");
                writer.append(this.lstDatosReserva.get(i).getNombre()+";");
                writer.append(this.lstDatosReserva.get(i).getApellidos()+";");
                writer.append(this.lstDatosReserva.get(i).getDni()+";");
                writer.append(this.lstDatosReserva.get(i).getTelefono()+";");
                writer.append(this.lstDatosReserva.get(i).getMontoTotal()+"\n");
            }
            
            writer.close();
        
            
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "¡Hubo un ERROR al generar el reporte!");
            e.printStackTrace();
        }
    }
    
    
    public void generarTabla(){
        DefaultTableCellRenderer alinear = new DefaultTableCellRenderer();
        alinear.setHorizontalAlignment(SwingConstants.CENTER);
        
        tablaHabOcupados.setModel(modeloTabla);
        tablaHabOcupados.getColumnModel().getColumn(0).setPreferredWidth(35);
        tablaHabOcupados.getColumnModel().getColumn(0).setResizable(false);
        tablaHabOcupados.getColumnModel().getColumn(0).setCellRenderer(alinear);
        tablaHabOcupados.getColumnModel().getColumn(1).setPreferredWidth(50);
        tablaHabOcupados.getColumnModel().getColumn(1).setResizable(false);
        tablaHabOcupados.getColumnModel().getColumn(1).setCellRenderer(alinear);
        tablaHabOcupados.getColumnModel().getColumn(2).setPreferredWidth(60);
        tablaHabOcupados.getColumnModel().getColumn(2).setResizable(false);
        tablaHabOcupados.getColumnModel().getColumn(2).setCellRenderer(alinear);
        tablaHabOcupados.getColumnModel().getColumn(3).setPreferredWidth(45);
        tablaHabOcupados.getColumnModel().getColumn(3).setResizable(false);
        tablaHabOcupados.getColumnModel().getColumn(3).setCellRenderer(alinear);
        tablaHabOcupados.getColumnModel().getColumn(4).setPreferredWidth(70);
        tablaHabOcupados.getColumnModel().getColumn(4).setResizable(false);
        tablaHabOcupados.getColumnModel().getColumn(4).setCellRenderer(alinear);
        tablaHabOcupados.getColumnModel().getColumn(5).setPreferredWidth(40);
        tablaHabOcupados.getColumnModel().getColumn(5).setResizable(false);
        tablaHabOcupados.getColumnModel().getColumn(5).setCellRenderer(alinear);
        tablaHabOcupados.getColumnModel().getColumn(6).setPreferredWidth(70);
        tablaHabOcupados.getColumnModel().getColumn(6).setResizable(false);
        tablaHabOcupados.getColumnModel().getColumn(6).setCellRenderer(alinear);
        tablaHabOcupados.getColumnModel().getColumn(7).setPreferredWidth(70);
        tablaHabOcupados.getColumnModel().getColumn(7).setResizable(false);
        tablaHabOcupados.getColumnModel().getColumn(7).setCellRenderer(alinear);

             
        for(int i=0;i<lstHabOcupadas.size();i++)
        {
            modeloTabla.insertRow(i, new Object[]{});
            modeloTabla.setValueAt(lstHabOcupadas.get(i).getCodigoReserva(), i, 0);
            modeloTabla.setValueAt(lstHabOcupadas.get(i).getNumeroHabitacion(), i, 1);
            modeloTabla.setValueAt(lstHabOcupadas.get(i).getTipoHabitacion(), i, 2);
            modeloTabla.setValueAt(lstHabOcupadas.get(i).getCostoHabitacion(), i, 3);
            modeloTabla.setValueAt(String.valueOf(lstHabOcupadas.get(i).getMontoTotal()), i, 4);
            modeloTabla.setValueAt("Ocupado", i, 5);
            modeloTabla.setValueAt(lstHabOcupadas.get(i).getFechaIngreso(), i, 6);
            modeloTabla.setValueAt(lstHabOcupadas.get(i).getFechaSalida(), i, 7);            
        }
    }
}