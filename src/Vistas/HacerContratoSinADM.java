/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controllers.HacerContratoController;
import Modelo.Asesor;
import Modelo.Cliente;
import Modelo.Contrato;
import java.awt.Window;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Lucho
 */
public class HacerContratoSinADM extends javax.swing.JPanel implements HacerContratoView {

    private int duenioID;
    private int asesorID;
    private int inmuebleID;
    private HashMap<Integer, Asesor> mapA = null;

    /**
     * Creates new form HacerContratoSinADM
     */
    public HacerContratoSinADM(int duenioID, int inmuebleID) {
        this.duenioID = duenioID;
        this.inmuebleID = inmuebleID;
        initComponents();
        Cliente aux = (new HacerContratoController(this)).buscarCliente(duenioID);
        Asesor aux2 = (new HacerContratoController(this)).buscarAsesor(aux.getAsesorID());
        (new HacerContratoController(this)).llenarComboBox();

        this.asesorID = aux2.getId();
        this.labelNombre.setText(aux.getNombre());
        this.labelContacto.setText(aux.getContacto());
        this.labelDni.setText(Integer.toString(aux.getDocumento()));
        this.labelTel.setText(Long.toString(aux.getTel()));
        this.labelIdAse.setText(Integer.toString(aux2.getId()));
        this.labelNombreAse.setText(aux2.getNombre());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     *
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelDni = new javax.swing.JLabel();
        labelTel = new javax.swing.JLabel();
        labelContacto = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        pagadoLabel = new javax.swing.JLabel();
        restanteLabel = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        comCap = new javax.swing.JLabel();
        comOfi = new javax.swing.JLabel();
        comAseC = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel45 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        comisionField = new javax.swing.JTextField();
        depositoField = new javax.swing.JTextField();
        seniaField = new javax.swing.JTextField();
        precioInicialField = new javax.swing.JTextField();
        comboAsesores = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        labelNombreAse = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        labelIdAse = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(231, 60, 0)), "Datos del Dueño: ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13))); // NOI18N
        jPanel1.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Nombre y Apellido :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 40, 110, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Documento :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 70, 90, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Telefono :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(20, 100, 90, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Contacto :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(20, 130, 90, 20);

        labelNombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelNombre.setText("Francisco");
        jPanel1.add(labelNombre);
        labelNombre.setBounds(200, 40, 210, 20);

        labelDni.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelDni.setText("40823458");
        jPanel1.add(labelDni);
        labelDni.setBounds(200, 70, 210, 20);

        labelTel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelTel.setText("2664842481");
        jPanel1.add(labelTel);
        labelTel.setBounds(200, 100, 210, 20);

        labelContacto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelContacto.setText("rosasfran.97@gmail");
        jPanel1.add(labelContacto);
        labelContacto.setBounds(200, 130, 210, 20);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(231, 60, 0)), "Cargar Datos de la Operción :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft JhengHei UI", 0, 14))); // NOI18N
        jPanel2.setLayout(null);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel30.setText("Total :");
        jPanel2.add(jLabel30);
        jLabel30.setBounds(30, 150, 73, 14);

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel31.setText("Pagado :");
        jPanel2.add(jLabel31);
        jLabel31.setBounds(30, 190, 73, 14);

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel32.setText("Restante :");
        jPanel2.add(jLabel32);
        jLabel32.setBounds(30, 230, 73, 14);

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("$");
        jPanel2.add(jLabel33);
        jLabel33.setBounds(110, 140, 18, 30);

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("$");
        jPanel2.add(jLabel34);
        jLabel34.setBounds(110, 180, 18, 30);

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("$");
        jPanel2.add(jLabel35);
        jLabel35.setBounds(110, 220, 18, 30);

        totalLabel.setText("0.0");
        jPanel2.add(totalLabel);
        totalLabel.setBounds(130, 150, 190, 18);

        pagadoLabel.setText("0.0");
        jPanel2.add(pagadoLabel);
        pagadoLabel.setBounds(130, 190, 190, 18);

        restanteLabel.setText("0.0");
        jPanel2.add(restanteLabel);
        restanteLabel.setBounds(130, 230, 190, 18);

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel39.setText("Montos :");
        jPanel2.add(jLabel39);
        jLabel39.setBounds(30, 100, 100, 20);

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel40.setText("Captador Cliente :");
        jPanel2.add(jLabel40);
        jLabel40.setBounds(320, 180, 120, 20);

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel41.setText("Captador Inmueble :");
        jPanel2.add(jLabel41);
        jLabel41.setBounds(320, 230, 140, 14);

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("$");
        jPanel2.add(jLabel43);
        jLabel43.setBounds(460, 220, 18, 30);

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("$");
        jPanel2.add(jLabel44);
        jLabel44.setBounds(460, 180, 18, 20);

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("$");
        jPanel2.add(jLabel47);
        jLabel47.setBounds(460, 130, 18, 40);

        jButton2.setText("Guardar Datos ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(360, 260, 130, 30);

        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        jPanel2.add(botonSalir);
        botonSalir.setBounds(510, 260, 79, 30);

        comCap.setText("0.0");
        jPanel2.add(comCap);
        comCap.setBounds(480, 230, 150, 18);

        comOfi.setText("0.0");
        jPanel2.add(comOfi);
        comOfi.setBounds(480, 140, 150, 18);

        comAseC.setText("0.0");
        jPanel2.add(comAseC);
        comAseC.setBounds(480, 180, 150, 18);

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel42.setText("Oficina :");
        jPanel2.add(jLabel42);
        jLabel42.setBounds(320, 140, 70, 20);
        jPanel2.add(jSeparator3);
        jSeparator3.setBounds(20, 130, 620, 10);

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel45.setText("Comisiones:");
        jPanel2.add(jLabel45);
        jLabel45.setBounds(340, 100, 100, 20);

        jLabel2.setText("Comision");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(340, 30, 60, 18);

        jLabel12.setText("Seña");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(130, 30, 33, 18);

        jLabel13.setText("Precio Inicial");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(30, 30, 86, 18);

        jLabel16.setText("Deposito");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(240, 30, 63, 18);

        comisionField.setText("0");
        comisionField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                comisionFieldFocusLost(evt);
            }
        });
        comisionField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                comisionFieldKeyTyped(evt);
            }
        });
        jPanel2.add(comisionField);
        comisionField.setBounds(340, 60, 90, 28);

        depositoField.setText("0");
        depositoField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                depositoFieldFocusLost(evt);
            }
        });
        depositoField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                depositoFieldKeyTyped(evt);
            }
        });
        jPanel2.add(depositoField);
        depositoField.setBounds(240, 60, 90, 28);

        seniaField.setText("0");
        seniaField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                seniaFieldFocusLost(evt);
            }
        });
        seniaField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                seniaFieldKeyTyped(evt);
            }
        });
        jPanel2.add(seniaField);
        seniaField.setBounds(130, 60, 90, 28);

        precioInicialField.setText("0");
        precioInicialField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                precioInicialFieldFocusLost(evt);
            }
        });
        precioInicialField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precioInicialFieldKeyTyped(evt);
            }
        });
        jPanel2.add(precioInicialField);
        precioInicialField.setBounds(30, 60, 90, 28);

        comboAsesores.setEditable(true);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("Asesor que capto la propiedad :");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setText("Asesor que capto Cliente  : ");

        labelNombreAse.setText("jLabel2");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("Id:");

        labelIdAse.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(223, 223, 223)
                                .addComponent(comboAsesores, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(labelNombreAse)
                                .addGap(46, 46, 46)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(labelIdAse)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNombreAse, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelIdAse, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel27))
                            .addComponent(comboAsesores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        float precioInicial;
        try {
            precioInicial = Float.parseFloat(this.precioInicialField.getText());
            if (precioInicial == 0) {
                JOptionPane.showMessageDialog(null, "El precio inicial no puede ser 0", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El precio inical es invalido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        float senia;
        try {
            senia = Float.parseFloat(this.seniaField.getText());
            if (senia == 0) {
                JOptionPane.showMessageDialog(null, "La seña no puede ser 0", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "La seña ingresada es invalida", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        float deposito;
        try {
            deposito = Float.parseFloat(this.depositoField.getText());
            if (deposito == 0) {
                JOptionPane.showMessageDialog(null, "El deposito no puede ser 0", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El deposito ingresado es invalido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        float comision;
        try {
            comision = Float.parseFloat(this.comisionField.getText());
            if (comision == 0) {
                JOptionPane.showMessageDialog(null, "La comision no puede ser 0", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "La comision ingresada es invalida", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (senia > comision + deposito + precioInicial) {
            JOptionPane.showMessageDialog(null, "La comision es mayor que el monto total ingresado", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int asesorIDCliente = mapA.get(this.comboAsesores.getSelectedIndex()).getId();

        Contrato aux2 = new Contrato(0, new Date(), comision, "", -1, this.inmuebleID, this.duenioID, asesorIDCliente, 1, false, 0, 0, new Date(), 0, new Date());
        (new HacerContratoController(this)).alta2(aux2);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        Window w = SwingUtilities.getWindowAncestor(this);
        w.dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void comisionFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comisionFieldFocusLost
        try {
            this.llenarLabels();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "La comision es invalida", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_comisionFieldFocusLost

    private void comisionFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comisionFieldKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != '.') {
            evt.consume();
        }
    }//GEN-LAST:event_comisionFieldKeyTyped

    private void depositoFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_depositoFieldFocusLost
        try {
            this.llenarLabels();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "El deposito es invalido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_depositoFieldFocusLost

    private void depositoFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_depositoFieldKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != '.') {
            evt.consume();
        }
    }//GEN-LAST:event_depositoFieldKeyTyped

    private void seniaFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_seniaFieldFocusLost
        try {
            this.llenarLabels();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "La seña es invalida", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_seniaFieldFocusLost

    private void seniaFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_seniaFieldKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != '.') {
            evt.consume();
        }
    }//GEN-LAST:event_seniaFieldKeyTyped

    private void precioInicialFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_precioInicialFieldFocusLost
        try {
            this.llenarLabels();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "El precio inicial es invalido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_precioInicialFieldFocusLost

    private void precioInicialFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioInicialFieldKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != '.') {
            evt.consume();
        }
    }//GEN-LAST:event_precioInicialFieldKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel comAseC;
    private javax.swing.JLabel comCap;
    private javax.swing.JLabel comOfi;
    private javax.swing.JComboBox<String> comboAsesores;
    private javax.swing.JTextField comisionField;
    private javax.swing.JTextField depositoField;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel labelContacto;
    private javax.swing.JLabel labelDni;
    private javax.swing.JLabel labelIdAse;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelNombreAse;
    private javax.swing.JLabel labelTel;
    private javax.swing.JLabel pagadoLabel;
    private javax.swing.JTextField precioInicialField;
    private javax.swing.JLabel restanteLabel;
    private javax.swing.JTextField seniaField;
    private javax.swing.JLabel totalLabel;
    // End of variables declaration//GEN-END:variables

    private void llenarLabels() {
        float precI = Float.parseFloat(this.precioInicialField.getText());
        float deposito = Float.parseFloat(this.depositoField.getText());
        float senia = Float.parseFloat(this.seniaField.getText());
        float comision = Float.parseFloat(this.comisionField.getText());
        float total = precI + deposito + comision;
        float restante = total - senia;
        this.totalLabel.setText(total + "");
        this.pagadoLabel.setText(senia + "");
        this.restanteLabel.setText("" + restante);
        this.comOfi.setText("" + comision / 2);
        this.comCap.setText("" + comision / 4);
        this.comAseC.setText("" + comision / 4);
    }

    @Override
    public void llenarTablaClientes(ArrayList<Cliente> listaI) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void llenarCliente(Cliente inm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void nuevoCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void nuevoContratoAlquiler() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void llenarAsesores(ArrayList<Asesor> listaA) {
        int cont = 0;
        mapA = new HashMap<>();
        for (Asesor cl : listaA) {
            mapA.put(cont, cl);
            this.comboAsesores.addItem(cl.getId() + "-" + cl.getNombre());
            cont++;
        }
    }

    /**
     * 0 se dio de alta -- 1 error en alta -- 2 error en alta pagos
     *
     * @param alta
     */
    @Override
    public void respuestaAlta(int alta) {
        switch (alta) {
            case 0:
                (new HacerContratoController(this)).setReservado(this.inmuebleID);
                JOptionPane.showMessageDialog(null, "El contrato se guardo con exito");
                Window w = SwingUtilities.getWindowAncestor(this);
                w.dispose();
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "No se ha podido dar de alta.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "No se han podido dar de alta los pagos correspondientes al contrato.");
                break;
        }
    }

}
