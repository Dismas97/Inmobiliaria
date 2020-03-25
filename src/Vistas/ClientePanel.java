/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controllers.ClienteController;
import Controllers.HacerContratoController;
import Modelo.Asesor;
import Modelo.Cliente;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Usuario1
 */
public class ClientePanel extends javax.swing.JPanel implements ClienteView{
    private DefaultTableModel tabla;
    private HashMap<Integer,Cliente> mapC =null;
    private HashMap<Integer,Asesor> mapA=null;
    private int pos; 
    private Cliente clienteSelec=null; 
    public ClientePanel() {
        initComponents();
        (new ClienteController(this)).llenarComboBox(); 
    } 
    private String controlCampos() { 
        String error = "";  
        Pattern patron = Pattern.compile("[^A-Za-z ]");
        Matcher encaja = patron.matcher(fieldNombre.getText());
        if (encaja.find() || fieldNombre.getText().isEmpty()) {
            error = error+ "-El nombre ingresado no es valido\n";  
        }  
        try {
            Integer.parseInt(this.fieldDoc.getText());
        } catch (NumberFormatException e) {
            error = error+ "-El dni ingresado no es valido\n"; 
        }
        try {
            Long.parseLong(this.fieldTel.getText());
        } catch (NumberFormatException e) {
            error = error+ "-El telefono ingresado no es valido.\n"; 
        } 
        if(comboAsesores.getSelectedIndex()==-1){
            error = error+ "-Debe seleccionar el asesor que contactó el cliente.\n"; 
        }
        return error;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jDialog1 = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        fieldNombre = new javax.swing.JTextField();
        fieldContacto = new javax.swing.JTextField();
        radioCUIT = new javax.swing.JRadioButton();
        radioDNI = new javax.swing.JRadioButton();
        fieldDoc = new javax.swing.JTextField();
        fieldTel = new javax.swing.JTextField();
        botonAlta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        jBuscarPorNom = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        botonAltaC = new javax.swing.JButton();
        botonAlta3 = new javax.swing.JButton();
        jRadioID = new javax.swing.JRadioButton();
        jRadioNombre = new javax.swing.JRadioButton();
        botonAlta4 = new javax.swing.JButton();
        comboAsesores = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaInmuebleAlquila = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        botonAlta6 = new javax.swing.JButton();
        botonAlta7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaInmuebleDueño = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 100, 0)), "Seleccione un Cliente (si no ingresar nuevo) ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 100, 0))); // NOI18N
        jPanel3.setLayout(null);

        fieldNombre.setText("NOMBRE");
        jPanel3.add(fieldNombre);
        fieldNombre.setBounds(180, 270, 220, 30);

        fieldContacto.setText("Contacto (FB,INSTA)");
        jPanel3.add(fieldContacto);
        fieldContacto.setBounds(180, 440, 220, 30);

        radioCUIT.setText("CUIT");
        jPanel3.add(radioCUIT);
        radioCUIT.setBounds(300, 310, 100, 30);

        radioDNI.setText("DNI");
        jPanel3.add(radioDNI);
        radioDNI.setBounds(180, 310, 100, 30);

        fieldDoc.setText("DOCUMENTO");
        jPanel3.add(fieldDoc);
        fieldDoc.setBounds(180, 360, 220, 30);

        fieldTel.setText("Telefono");
        jPanel3.add(fieldTel);
        fieldTel.setBounds(180, 400, 220, 30);

        botonAlta.setBackground(new java.awt.Color(255, 255, 255));
        botonAlta.setText("Eliminar");
        botonAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAltaActionPerformed(evt);
            }
        });
        jPanel3.add(botonAlta);
        botonAlta.setBounds(280, 560, 120, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Cliente captado por:");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(30, 230, 140, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Documento :");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(30, 360, 140, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Telefono :");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(30, 400, 140, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Contacto :");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(30, 440, 140, 30);

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "CUIT/DNI"
            }
        ));
        tablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClientesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaClientes);

        jPanel3.add(jScrollPane3);
        jScrollPane3.setBounds(20, 120, 400, 90);

        jBuscarPorNom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 100, 0)));
        jBuscarPorNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jBuscarPorNomKeyReleased(evt);
            }
        });
        jPanel3.add(jBuscarPorNom);
        jBuscarPorNom.setBounds(20, 70, 400, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Tipo Documento :");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(30, 310, 140, 30);

        botonAltaC.setBackground(new java.awt.Color(255, 255, 255));
        botonAltaC.setText("Guardar Cambios");
        botonAltaC.setEnabled(false);
        botonAltaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAltaCActionPerformed(evt);
            }
        });
        jPanel3.add(botonAltaC);
        botonAltaC.setBounds(20, 485, 380, 40);

        botonAlta3.setBackground(new java.awt.Color(255, 160, 0));
        botonAlta3.setText("Editar");
        botonAlta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAlta3ActionPerformed(evt);
            }
        });
        jPanel3.add(botonAlta3);
        botonAlta3.setBounds(150, 560, 120, 40);

        buttonGroup1.add(jRadioID);
        jRadioID.setText("Buscar Por ID");
        jPanel3.add(jRadioID);
        jRadioID.setBounds(230, 30, 190, 30);

        buttonGroup1.add(jRadioNombre);
        jRadioNombre.setSelected(true);
        jRadioNombre.setText("Buscar Por Nombre");
        jRadioNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 100, 0)));
        jPanel3.add(jRadioNombre);
        jRadioNombre.setBounds(20, 30, 190, 30);

        botonAlta4.setBackground(new java.awt.Color(255, 160, 0));
        botonAlta4.setText("Nuevo Cliente");
        botonAlta4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAlta4ActionPerformed(evt);
            }
        });
        jPanel3.add(botonAlta4);
        botonAlta4.setBounds(20, 560, 120, 40);

        comboAsesores.setEditable(true);
        jPanel3.add(comboAsesores);
        comboAsesores.setBounds(180, 230, 220, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Nombre y Apellido : ");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(30, 270, 140, 30);
        jPanel3.add(jSeparator1);
        jSeparator1.setBounds(20, 540, 380, 10);
        jPanel3.add(jSeparator2);
        jSeparator2.setBounds(20, 220, 400, 10);

        add(jPanel3);
        jPanel3.setBounds(10, 10, 440, 620);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 100, 0)), "INMUEBLES QUE ALQUILA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft YaHei UI", 1, 16), new java.awt.Color(255, 100, 0))); // NOI18N
        jPanel4.setLayout(null);

        tablaInmuebleAlquila.setBackground(new java.awt.Color(255, 200, 100));
        tablaInmuebleAlquila.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tablaInmuebleAlquila.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Direccion", "Zona", "Precio", "Tipo de Inmueble", "Operacion", "Estado", "Habitaciones"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaInmuebleAlquila.setAutoscrolls(false);
        jScrollPane2.setViewportView(tablaInmuebleAlquila);

        jPanel4.add(jScrollPane2);
        jScrollPane2.setBounds(10, 30, 770, 210);

        add(jPanel4);
        jPanel4.setBounds(460, 10, 790, 270);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 100, 0)), "INMUEBLES DEL PROPIETARIO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft YaHei UI", 1, 16), new java.awt.Color(255, 100, 0))); // NOI18N
        jPanel5.setLayout(null);

        jButton8.setText("Hacer Contrato administracion");
        jPanel5.add(jButton8);
        jButton8.setBounds(510, 280, 260, 40);

        botonAlta6.setBackground(new java.awt.Color(255, 160, 0));
        botonAlta6.setText("Ingresar nuevo inmueble");
        botonAlta6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAlta6ActionPerformed(evt);
            }
        });
        jPanel5.add(botonAlta6);
        botonAlta6.setBounds(20, 280, 170, 40);

        botonAlta7.setBackground(new java.awt.Color(255, 255, 255));
        botonAlta7.setText("Eliminar Imueble");
        jPanel5.add(botonAlta7);
        botonAlta7.setBounds(200, 280, 180, 40);

        tablaInmuebleDueño.setBackground(new java.awt.Color(255, 200, 100));
        tablaInmuebleDueño.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tablaInmuebleDueño.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Direccion", "Zona", "Precio", "Tipo de Inmueble", "Operacion", "Estado", "Habitaciones"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaInmuebleDueño.setAutoscrolls(false);
        jScrollPane1.setViewportView(tablaInmuebleDueño);

        jPanel5.add(jScrollPane1);
        jScrollPane1.setBounds(10, 30, 770, 210);

        add(jPanel5);
        jPanel5.setBounds(460, 290, 790, 340);
    }// </editor-fold>//GEN-END:initComponents

    private void tablaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesMouseClicked
        clienteSelec = mapC.get(this.tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 0));
        this.fieldNombre.setText(clienteSelec.getNombre());
        this.fieldContacto.setText(clienteSelec.getContacto());
        this.fieldDoc.setText(Integer.toString(clienteSelec.getDocumento()));
        this.fieldTel.setText(Long.toString(clienteSelec.getTel())); 
        this.radioDNI.setSelected(true);
        this.radioDNI.setEnabled(false);
        this.radioCUIT.setEnabled(false);
        this.fieldNombre.setEditable(false);
        this.fieldContacto.setEditable(false);
        this.fieldDoc.setEditable(false);
        this.fieldTel.setEditable(false);
        botonAltaC.setEnabled(false); 
        comboAsesores.setSelectedItem(clienteSelec.getAsesorID()+"-"+mapA.get(clienteSelec.getAsesorID()).getNombre());
        comboAsesores.setEnabled(false);
    }//GEN-LAST:event_tablaClientesMouseClicked

    private void jBuscarPorNomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBuscarPorNomKeyReleased
        ClienteController cc = new ClienteController(this);
        if(jRadioNombre.isSelected()){
            cc.llenarTabla(jBuscarPorNom.getText());
        }else{
            
        }
    }//GEN-LAST:event_jBuscarPorNomKeyReleased

    private void botonAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAltaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAltaActionPerformed

    private void botonAlta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAlta3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAlta3ActionPerformed

    private void botonAltaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAltaCActionPerformed
        if (controlCampos().isEmpty()) {
            int tipoDoc;
            int asesorID = mapA.get(this.comboAsesores.getSelectedIndex()).getId();
            if (this.radioDNI.isSelected()) {
                tipoDoc = 0;
            } else {
                tipoDoc = 1;
            }
            Cliente nuevo = new Cliente(0, asesorID, fieldNombre.getText(), Integer.parseInt(this.fieldDoc.getText()), tipoDoc, Long.parseLong(this.fieldTel.getText()), fieldContacto.getText());
            (new ClienteController(this)).altaCliente(nuevo);
        } else {
            JOptionPane.showMessageDialog(null, controlCampos(), "Error en ingreso de datos", 1);
        }
    }//GEN-LAST:event_botonAltaCActionPerformed

    private void botonAlta4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAlta4ActionPerformed
        clienteSelec = null;
        this.fieldNombre.setText("");
        this.fieldContacto.setText("");
        this.fieldDoc.setText("");
        this.fieldTel.setText(""); 
        this.radioDNI.setSelected(true);
        this.radioDNI.setEnabled(true);
        this.radioCUIT.setEnabled(true);
        this.fieldNombre.setEditable(true);
        this.fieldContacto.setEditable(true);
        this.fieldDoc.setEditable(true);
        this.fieldTel.setEditable(true);
        botonAltaC.setEnabled(true);
        comboAsesores.setEnabled(true);
    }//GEN-LAST:event_botonAlta4ActionPerformed

    private void botonAlta6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAlta6ActionPerformed
//        if(tablaInmuebleDueño.getSelectedRow()!=-1 ){
            
         //   if(mapI.get(tablaInmuebleDueño.getValueAt(tablaInmuebleDueño.getSelectedRow(), 0)).getEstado() == 1){
                jDialog1.setSize(1450, 800);
                jDialog1.setTitle("Ingresar Inmueble"); 
                jDialog1.setBounds(10, 10, 600, 730);
                jDialog1.setModal(true); 
          //      int clienteID = mapI.get(tablaInmuebleDueño.getValueAt(tablaInmuebleDueño.getSelectedRow(), 0)).getDuenoID();
            //    int inmuebleID = mapI.get(tablaInmuebleDueño.getValueAt(tablaInmuebleDueño.getSelectedRow(), 0)).getId();
       //         ABMInmueble ai = new ABMInmueble(clienteID);
                ABMInmueble ai = new ABMInmueble();
                jDialog1.add(ai);
                jDialog1.setVisible(true);
      //      }
            
     //   }
     //   else{
     //       JOptionPane.showMessageDialog(null, "Debe seleccionar un inmueble", "Error", JOptionPane.ERROR_MESSAGE);
      //      return;
       // }
    }//GEN-LAST:event_botonAlta6ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAlta;
    private javax.swing.JButton botonAlta3;
    private javax.swing.JButton botonAlta4;
    private javax.swing.JButton botonAlta6;
    private javax.swing.JButton botonAlta7;
    private javax.swing.JButton botonAltaC;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboAsesores;
    private javax.swing.JTextField fieldContacto;
    private javax.swing.JTextField fieldDoc;
    private javax.swing.JTextField fieldNombre;
    private javax.swing.JTextField fieldTel;
    private javax.swing.JTextField jBuscarPorNom;
    private javax.swing.JButton jButton8;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioID;
    private javax.swing.JRadioButton jRadioNombre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton radioCUIT;
    private javax.swing.JRadioButton radioDNI;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTable tablaInmuebleAlquila;
    private javax.swing.JTable tablaInmuebleDueño;
    // End of variables declaration//GEN-END:variables

    @Override
    public void cargarClientes(ArrayList a) {
        //To change body of generated methods, choose Tools | Templates.
    }
     
    @Override
    public void llenarTabla(ArrayList<Cliente> listaC) { 
        int fila = 0; 
        mapC= new HashMap<>(); 
        tabla = (DefaultTableModel)tablaClientes.getModel();
        tabla.setNumRows(0);
        for(Cliente cl : listaC){
            tabla.addRow(new Object [3]);
            tablaClientes.setValueAt(cl.getId(), fila, 0);
            tablaClientes.setValueAt(cl.getNombre(), fila, 1);
            tablaClientes.setValueAt(cl.getDocumento(), fila, 2);
            mapC.put(cl.getId(),cl);
            fila++;
        }
    }

    @Override
    public void llenarAsesores(ArrayList<Asesor> listaA){ 
        mapA=new HashMap<>();
        for(Asesor cl : listaA){
            mapA.put(cl.getId(), cl);
            this.comboAsesores.addItem(cl.getId()+"-"+cl.getNombre()); 
        }
    }
    @Override 
    public void respuestaAltaCliente(boolean exito){
        if(exito){
            JOptionPane.showMessageDialog(null,"El cliente se ha ingresado con exito.");
            // limpiarCampos();
        }else{
            JOptionPane.showMessageDialog(null, "El no ha sido dado de alta.","Ha ocurrido un error", JOptionPane.ERROR_MESSAGE);
        }
    }
}