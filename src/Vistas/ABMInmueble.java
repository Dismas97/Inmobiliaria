/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controllers.InmuebleController;
import Modelo.Inmueble;

/**
 *
 * @author Lucho
 */
public class ABMInmueble extends javax.swing.JPanel {

    /**
     * Creates new form ABMInmueble
     */
    public ABMInmueble() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaObservacion = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaOtro = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jcBoxPatio = new javax.swing.JCheckBox();
        jcBoxLavadero = new javax.swing.JCheckBox();
        jcBoxCochera = new javax.swing.JCheckBox();
        jcBoxAmoblada = new javax.swing.JCheckBox();
        jcBoxLiving = new javax.swing.JCheckBox();
        jcBoxCocina = new javax.swing.JCheckBox();
        jcBoxComedor = new javax.swing.JCheckBox();
        jcBoxCocinaComedor = new javax.swing.JCheckBox();
        jcBoxCocinaLiving = new javax.swing.JCheckBox();
        jcBoxCocinaLivingComedor = new javax.swing.JCheckBox();
        textPrecio = new javax.swing.JTextField();
        textDireccion = new javax.swing.JTextField();
        textBarrio = new javax.swing.JTextField();
        jcBoxPlantaAlta = new javax.swing.JCheckBox();
        botonGuardar = new javax.swing.JButton();
        spinHabitacion = new javax.swing.JSpinner();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        spinHabitacion1 = new javax.swing.JSpinner();
        spinHabitacion2 = new javax.swing.JSpinner();
        spinHabitacion3 = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 100, 0), 2), "Planilla para GUARDAR un inmueble.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft JhengHei UI", 1, 16), new java.awt.Color(255, 100, 0))); // NOI18N
        setLayout(null);

        jLabel1.setText("Barrio");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 100, 0)));
        add(jLabel1);
        jLabel1.setBounds(310, 30, 250, 50);

        jLabel2.setText("Precio");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 100, 0)));
        add(jLabel2);
        jLabel2.setBounds(20, 90, 250, 50);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Habitaciones");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 100, 0)));
        add(jLabel4);
        jLabel4.setBounds(20, 220, 120, 50);

        jLabel10.setText("Direccion");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 100, 0)));
        add(jLabel10);
        jLabel10.setBounds(20, 30, 250, 50);

        areaObservacion.setColumns(20);
        areaObservacion.setRows(5);
        areaObservacion.setText("Observaciones:\n");
        areaObservacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 100, 0)));
        jScrollPane1.setViewportView(areaObservacion);

        add(jScrollPane1);
        jScrollPane1.setBounds(20, 490, 540, 60);

        areaOtro.setColumns(20);
        areaOtro.setRows(5);
        areaOtro.setText("Otros:");
        areaOtro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 100, 0)));
        jScrollPane2.setViewportView(areaOtro);

        add(jScrollPane2);
        jScrollPane2.setBounds(20, 560, 540, 60);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Metros Cuadrados");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 100, 0)));
        add(jLabel12);
        jLabel12.setBounds(300, 220, 120, 50);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Metros Fondo");
        jLabel13.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 100, 0)));
        add(jLabel13);
        jLabel13.setBounds(440, 220, 120, 50);

        jcBoxPatio.setBackground(new java.awt.Color(255, 175, 95));
        jcBoxPatio.setText("Patio");
        jcBoxPatio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcBoxPatioActionPerformed(evt);
            }
        });
        add(jcBoxPatio);
        jcBoxPatio.setBounds(230, 330, 140, 23);

        jcBoxLavadero.setBackground(new java.awt.Color(255, 175, 95));
        jcBoxLavadero.setText("Lavadero");
        add(jcBoxLavadero);
        jcBoxLavadero.setBounds(230, 300, 140, 23);

        jcBoxCochera.setBackground(new java.awt.Color(255, 175, 95));
        jcBoxCochera.setText("Cochera");
        add(jcBoxCochera);
        jcBoxCochera.setBounds(230, 360, 140, 23);

        jcBoxAmoblada.setBackground(new java.awt.Color(255, 175, 95));
        jcBoxAmoblada.setText("Amoblada");
        jcBoxAmoblada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcBoxAmobladaActionPerformed(evt);
            }
        });
        add(jcBoxAmoblada);
        jcBoxAmoblada.setBounds(230, 390, 140, 23);

        jcBoxLiving.setBackground(new java.awt.Color(255, 175, 95));
        jcBoxLiving.setText("Living");
        jcBoxLiving.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcBoxLivingActionPerformed(evt);
            }
        });
        add(jcBoxLiving);
        jcBoxLiving.setBounds(40, 300, 140, 23);

        jcBoxCocina.setBackground(new java.awt.Color(255, 175, 95));
        jcBoxCocina.setText("Cocina");
        add(jcBoxCocina);
        jcBoxCocina.setBounds(40, 330, 140, 23);

        jcBoxComedor.setBackground(new java.awt.Color(255, 175, 95));
        jcBoxComedor.setText("Comedor");
        jcBoxComedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcBoxComedorActionPerformed(evt);
            }
        });
        add(jcBoxComedor);
        jcBoxComedor.setBounds(40, 360, 140, 23);

        jcBoxCocinaComedor.setBackground(new java.awt.Color(255, 175, 95));
        jcBoxCocinaComedor.setText("Cocina-Comedor");
        add(jcBoxCocinaComedor);
        jcBoxCocinaComedor.setBounds(40, 390, 140, 23);

        jcBoxCocinaLiving.setBackground(new java.awt.Color(255, 175, 95));
        jcBoxCocinaLiving.setText("Cocina-Living");
        add(jcBoxCocinaLiving);
        jcBoxCocinaLiving.setBounds(40, 420, 140, 23);

        jcBoxCocinaLivingComedor.setBackground(new java.awt.Color(255, 175, 95));
        jcBoxCocinaLivingComedor.setText("Cocina-Living-Comedor");
        add(jcBoxCocinaLivingComedor);
        jcBoxCocinaLivingComedor.setBounds(40, 450, 140, 23);

        textPrecio.setText("Precio");
        textPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPrecioActionPerformed(evt);
            }
        });
        add(textPrecio);
        textPrecio.setBounds(20, 110, 250, 30);

        textDireccion.setText("Direccion");
        add(textDireccion);
        textDireccion.setBounds(20, 50, 250, 30);

        textBarrio.setText("Barrio");
        textBarrio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBarrioActionPerformed(evt);
            }
        });
        add(textBarrio);
        textBarrio.setBounds(310, 50, 250, 30);

        jcBoxPlantaAlta.setBackground(new java.awt.Color(255, 175, 95));
        jcBoxPlantaAlta.setText("Planta Alta");
        add(jcBoxPlantaAlta);
        jcBoxPlantaAlta.setBounds(230, 420, 140, 23);

        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
        add(botonGuardar);
        botonGuardar.setBounds(20, 630, 170, 50);

        spinHabitacion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(spinHabitacion);
        spinHabitacion.setBounds(300, 240, 120, 30);

        jCheckBox1.setBackground(new java.awt.Color(255, 175, 95));
        jCheckBox1.setText("Impuesto");
        add(jCheckBox1);
        jCheckBox1.setBounds(420, 420, 100, 23);

        jCheckBox2.setBackground(new java.awt.Color(255, 175, 95));
        jCheckBox2.setText("Expensas");
        add(jCheckBox2);
        jCheckBox2.setBounds(420, 390, 100, 23);

        jCheckBox3.setBackground(new java.awt.Color(255, 175, 95));
        jCheckBox3.setText("Gas");
        add(jCheckBox3);
        jCheckBox3.setBounds(420, 360, 100, 23);

        jCheckBox4.setBackground(new java.awt.Color(255, 175, 95));
        jCheckBox4.setText("Luz");
        add(jCheckBox4);
        jCheckBox4.setBounds(420, 330, 100, 23);

        jCheckBox5.setBackground(new java.awt.Color(255, 175, 95));
        jCheckBox5.setText("Agua");
        add(jCheckBox5);
        jCheckBox5.setBounds(420, 300, 100, 23);

        jRadioButton1.setText("Casa");
        add(jRadioButton1);
        jRadioButton1.setBounds(50, 170, 49, 23);

        jRadioButton2.setText("Departamento");
        add(jRadioButton2);
        jRadioButton2.setBounds(170, 170, 100, 23);

        jRadioButton3.setText("Local");
        add(jRadioButton3);
        jRadioButton3.setBounds(330, 170, 49, 23);

        jRadioButton4.setText("Terreno");
        add(jRadioButton4);
        jRadioButton4.setBounds(460, 170, 93, 23);

        jCheckBox6.setText("Vender");
        add(jCheckBox6);
        jCheckBox6.setBounds(330, 110, 59, 23);

        jCheckBox7.setText("Alquilar");
        add(jCheckBox7);
        jCheckBox7.setBounds(460, 110, 81, 23);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Baños");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 100, 0)));
        add(jLabel3);
        jLabel3.setBounds(160, 220, 120, 50);

        jLabel5.setText("Operacion");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 100, 0)));
        add(jLabel5);
        jLabel5.setBounds(310, 90, 250, 50);

        spinHabitacion1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(spinHabitacion1);
        spinHabitacion1.setBounds(20, 240, 120, 30);

        spinHabitacion2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(spinHabitacion2);
        spinHabitacion2.setBounds(440, 240, 120, 30);

        spinHabitacion3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(spinHabitacion3);
        spinHabitacion3.setBounds(160, 240, 120, 30);

        jLabel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 100, 0)), "Marcar en los cuadrados los valores que incluye.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 100, 0))); // NOI18N
        add(jLabel6);
        jLabel6.setBounds(20, 280, 540, 200);

        jLabel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(231, 60, 0)), "Seleccionar tipo de Inmueble.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(231, 60, 0))); // NOI18N
        add(jLabel7);
        jLabel7.setBounds(20, 150, 540, 50);
    }// </editor-fold>//GEN-END:initComponents

    private void jcBoxPatioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcBoxPatioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcBoxPatioActionPerformed

    private void jcBoxAmobladaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcBoxAmobladaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcBoxAmobladaActionPerformed

    private void jcBoxLivingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcBoxLivingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcBoxLivingActionPerformed

    private void jcBoxComedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcBoxComedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcBoxComedorActionPerformed

    private void textPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPrecioActionPerformed

    private void textBarrioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBarrioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBarrioActionPerformed

    private void modificarInmueble(Inmueble inm){
        inm.setBarrio(textBarrio.getText());
        inm.setCocina(jcBoxCocina.isBorderPaintedFlat());
        inm.setCocinaComedor(jcBoxCocinaComedor.isBorderPaintedFlat());
        inm.setCocinaLiving(jcBoxCocinaLiving.isBorderPaintedFlat());
        inm.setComedor(jcBoxComedor.isBorderPaintedFlat());
        inm.setDireccion(textDireccion.getText());
        //inm.setDuenoID();
        //inm.setEstado(ERROR);
        inm.setGarage(jcBoxCochera.isBorderPaintedFlat());
        inm.setHabitaciones(spinHabitacion.getComponentCount());
        //inm.setId(WIDTH);
        //inm.setImpuestos(jcbImpuesto.get);
        inm.setMetros2(LEFT_ALIGNMENT);
        inm.setObservaciones(TOOL_TIP_TEXT_KEY);
        inm.setPatio(true);
        inm.setOtros(TOOL_TIP_TEXT_KEY);
        inm.setPlantaAlta(true);
        inm.setPrecio(TOP_ALIGNMENT);
        inm.setServicios(SOMEBITS);
        inm.setTipo(WIDTH);
    
    }
    
    
    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        Inmueble inm = new Inmueble(WIDTH, HEIGHT, TOOL_TIP_TEXT_KEY, TOP_ALIGNMENT, WIDTH);
        InmuebleController ic;
        modificarInmueble(inm);
        
    }//GEN-LAST:event_botonGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaObservacion;
    private javax.swing.JTextArea areaOtro;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JCheckBox jcBoxAmoblada;
    private javax.swing.JCheckBox jcBoxCochera;
    private javax.swing.JCheckBox jcBoxCocina;
    private javax.swing.JCheckBox jcBoxCocinaComedor;
    private javax.swing.JCheckBox jcBoxCocinaLiving;
    private javax.swing.JCheckBox jcBoxCocinaLivingComedor;
    private javax.swing.JCheckBox jcBoxComedor;
    private javax.swing.JCheckBox jcBoxLavadero;
    private javax.swing.JCheckBox jcBoxLiving;
    private javax.swing.JCheckBox jcBoxPatio;
    private javax.swing.JCheckBox jcBoxPlantaAlta;
    private javax.swing.JSpinner spinHabitacion;
    private javax.swing.JSpinner spinHabitacion1;
    private javax.swing.JSpinner spinHabitacion2;
    private javax.swing.JSpinner spinHabitacion3;
    private javax.swing.JTextField textBarrio;
    private javax.swing.JTextField textDireccion;
    private javax.swing.JTextField textPrecio;
    // End of variables declaration//GEN-END:variables
}
