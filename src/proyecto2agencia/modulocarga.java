/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2agencia;

/**
 *
 * @author Juan RigobertoZuñiga
 */
import clases.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
public class modulocarga extends javax.swing.JFrame {
    //String cli="cliente";
    public static ListaSimple clientela;
    public static ListaSimple aerobuses;
    public static ListaSimple asientos;
    public static ListaSimple hoteles;
    public static ListaSimple habitaciones;
    public static ListaSimple cruceros;
    public static ListaSimple camatores;
    public static ListaSimple rentadeautos;
    public static ListaSimple destinos;
    public static ListaSimple lugarest;
    public static ListaSimple entidades;
    public static ListaSimple paquetes;
    public static ListaSimple reservaciones;
    
    /**
     * Creates new form modulocarga
     */
    public modulocarga() {
        
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Modulo de ingreso");

        jLabel2.setText("ingrese direccion del archivo a cargar");

        jLabel3.setText("Aerolineas y Buses :");

        jLabel4.setText("Asientos : ");

        jLabel5.setText("Hoteles y Resorts :");

        jLabel6.setText("Habitacion :");

        jLabel7.setText("Cruceros : ");

        jLabel8.setText("Camarot : ");

        jLabel9.setText("Renta de Autos : ");

        jLabel10.setText("Destinos Turisticos : ");

        jLabel11.setText("Lugares de E&E : ");

        jLabel12.setText("Clinetes : ");

        jLabel13.setText("Entidad Financiera : ");

        jLabel14.setText("Paquetes : ");

        jLabel15.setText("Reservaciones : ");

        jButton1.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jButton1.setText("Cargar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jButton3.setText("Cargar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jButton4.setText("Cargar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jButton5.setText("Cargar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jButton6.setText("Cargar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jButton7.setText("Cargar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jButton8.setText("Cargar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jButton9.setText("Cargar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jButton10.setText("Cargar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jButton11.setText("Cargar");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jButton12.setText("Cargar");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jButton13.setText("Cargar");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jButton14.setText("Cargar");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel7)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel9)))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 26, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addGap(65, 65, 65)
                                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jButton1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton14)
                    .addComponent(jLabel15))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //aca aerolineas y buses
        try {
            String client="aerolinea";
            File archivo=abrirarchivo();
            aerobuses=new ListaSimple(client);
            llenarlista(archivo, aerobuses);
            int tama=aerobuses.getSize();
            System.out.println(tama);
            jButton1.setEnabled(false);
            //cliente cli;
            //cli=(cliente)lista1.inicio.dato;
           
        } catch (IOException ex) {
            Logger.getLogger(modulocarga.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // aca asientos
        try {
            String client="asiento";
            File archivo=abrirarchivo();
            asientos=new ListaSimple(client);
            llenarlista(archivo, asientos);
            int tama=asientos.getSize();
            System.out.println(tama);
            //cliente cli;
            //cli=(cliente)lista1.inicio.dato;
            jButton3.setEnabled(false);
        } catch (IOException ex) {
            Logger.getLogger(modulocarga.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            String client="hotele";
            File archivo=abrirarchivo();
            hoteles=new ListaSimple(client);
            llenarlista(archivo, hoteles);
            int tama=hoteles.getSize();
            System.out.println(tama);
            //cliente cli;
            //cli=(cliente)lista1.inicio.dato;
            jButton4.setEnabled(false);
        } catch (IOException ex) {
            Logger.getLogger(modulocarga.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // aca habitaciones
        try {
            String client="habitacion";
            File archivo=abrirarchivo();
            habitaciones=new ListaSimple(client);
            llenarlista(archivo, habitaciones);
            int tama=habitaciones.getSize();
            System.out.println(tama);
            //cliente cli;
            //cli=(cliente)lista1.inicio.dato;
            jButton5.setEnabled(false);
        } catch (IOException ex) {
            Logger.getLogger(modulocarga.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // aca cruceros
        try {
            String client="crucero";
            File archivo=abrirarchivo();
            cruceros=new ListaSimple(client);
            llenarlista(archivo, cruceros);
            int tama=cruceros.getSize();
            System.out.println(tama);
            //cliente cli;
            //cli=(cliente)lista1.inicio.dato;
            jButton6.setEnabled(false);
        } catch (IOException ex) {
            Logger.getLogger(modulocarga.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        //aca camarotes
        try {
            String client="camarot";
            File archivo=abrirarchivo();
            camatores=new ListaSimple(client);
            llenarlista(archivo, camatores);
            int tama=camatores.getSize();
            System.out.println(tama);
            //cliente cli;
            //cli=(cliente)lista1.inicio.dato;
            jButton7.setEnabled(false);
        } catch (IOException ex) {
            Logger.getLogger(modulocarga.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // aca la renta de autos
        try {
            String client="rentautos";
            File archivo=abrirarchivo();
            rentadeautos=new ListaSimple(client);
            llenarlista(archivo, rentadeautos);
            int tama=rentadeautos.getSize();
            System.out.println(tama);
            //cliente cli;
            //cli=(cliente)lista1.inicio.dato;
            jButton8.setEnabled(false);
        } catch (IOException ex) {
            Logger.getLogger(modulocarga.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // aca destinos turisticos
        try {
            String client="destino";
            File archivo=abrirarchivo();
            destinos=new ListaSimple(client);
            llenarlista(archivo, destinos);
            int tama=destinos.getSize();
            System.out.println(tama);
            //cliente cli;
            //cli=(cliente)lista1.inicio.dato;
            jButton9.setEnabled(false);
        } catch (IOException ex) {
            Logger.getLogger(modulocarga.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        //aca lugares 
        try {
            String client="lugares";
            File archivo=abrirarchivo();
            lugarest=new ListaSimple(client);
            llenarlista(archivo, lugarest);
            int tama=lugarest.getSize();
            System.out.println(tama);
            //cliente cli;
            //cli=(cliente)lista1.inicio.dato;
            jButton10.setEnabled(false);
        } catch (IOException ex) {
            Logger.getLogger(modulocarga.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        try {
            String client="cliente";
            File archivo=abrirarchivo();
            clientela=new ListaSimple(client);
            llenarlista(archivo, clientela);
            int tama=clientela.getSize();
            System.out.println(tama);
            //cliente cli;
            //cli=(cliente)lista1.inicio.dato;
            jButton11.setEnabled(false);
        } catch (IOException ex) {
            Logger.getLogger(modulocarga.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // aqui entidad 
        try {
            String client="entidad";
            File archivo=abrirarchivo();
            entidades=new ListaSimple(client);
            llenarlista(archivo, entidades);
            int tama=entidades.getSize();
            System.out.println(tama);
            //cliente cli;
            //cli=(cliente)lista1.inicio.dato;
            jButton12.setEnabled(false);
        } catch (IOException ex) {
            Logger.getLogger(modulocarga.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // aqui paquetes
        try {
            String client="paquete";
            File archivo=abrirarchivo();
            paquetes=new ListaSimple(client);
            llenarlista(archivo, paquetes);
            int tama=paquetes.getSize();
            System.out.println(tama);
            //cliente cli;
            //cli=(cliente)lista1.inicio.dato;
            jButton13.setEnabled(false);
        } catch (IOException ex) {
            Logger.getLogger(modulocarga.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        //ACA RESERVACIONES
        try {
            String client="reservacion";
            File archivo=abrirarchivo();
            reservaciones=new ListaSimple(client);
            llenarlista(archivo, reservaciones);
            int tama=reservaciones.getSize();
            System.out.println(tama);
            //cliente cli;
            //cli=(cliente)lista1.inicio.dato;
            jButton14.setEnabled(false);
        } catch (IOException ex) {
            Logger.getLogger(modulocarga.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Inicio init=new Inicio(Login.admin);
        init.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(modulocarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modulocarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modulocarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modulocarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modulocarga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    public File abrirarchivo(){
        //Prepara la ventana para elegir el archivo a cargar
        JFileChooser mFileChooser = new JFileChooser();
        //Limita los archivos que se pueden cargar a CSV
        FileNameExtensionFilter ExtensionFilter = new FileNameExtensionFilter("CSV","csv");
        //Evita que el usuario eliga 'All Files'
        mFileChooser.setAcceptAllFileFilterUsed(false);
        //Aplica el filtro para archivos CSV
        mFileChooser.setFileFilter(ExtensionFilter);
        //Declara la variable en donde se guardará la decisión del usuario
        int resultFileC = mFileChooser.showDialog(null, "Aceptar");
        //Si el usuario ACEPTA se devuelve un Archivo.CSV
        if (resultFileC==JFileChooser.APPROVE_OPTION){
            //Retorna el archivo con la ruta completa según sea el SO
            mFileChooser.getSelectedFile().getAbsolutePath();
            //System.out.print("en OpenFile()" + "\n");
            return mFileChooser.getSelectedFile();
        } else {
            //Sale del programa
            System.exit(0);
        }
        //Si no existe archivo válido no retorna nada
        return null;
    }
    public void llenarlista(File file, ListaSimple lista) throws FileNotFoundException, IOException{
        //Variable en donde se almacena la línea leída
        String texto;
        //Verifica si el archivo es válido 
        if(file != null){
            BufferedReader fileBuffer = new BufferedReader(new FileReader(file));
            while((texto = fileBuffer.readLine())!=null){
                lista.agregarAlFinal(obtener(texto,lista.getId()));
            }
            fileBuffer.close();
        }
    }
    public Object obtener(String linea, String nombre){
        String[] atributos = linea.split(",");
        //Segun sea la lista, se llenará con los datos que contiene la linea del archivo '.csv' cargado
        switch(nombre){
            case "aerolinea":
                aerolineaybus transporte = new aerolineaybus(atributos[0],
                    atributos[1],
                    atributos[2],
                    atributos[3],
                    atributos[4]);
                return (Object) transporte;
            case "asiento":
                asiento asient = new asiento(atributos[0],
                    atributos[1],
                    atributos[2],
                    atributos[3],
                    atributos[4]);
                return (Object) asient;
            case "hotele":
                hoteles hotel = new hoteles(atributos[0],
                    atributos[1],
                    atributos[2],
                    atributos[3]);
                return (Object) hotel;
            case "habitacion":
                habitacion habita = new habitacion(atributos[0],
                    atributos[1],
                    atributos[2],
                    atributos[3],
                    atributos[4],
                    atributos[5]);
                return (Object) habita;
            case "crucero":
                crucero cruce = new crucero(atributos[0],
                    atributos[1],
                    atributos[2],
                    atributos[3],
                    atributos[4],
                    atributos[5],
                    atributos[6]);
                return (Object) cruce;
            case "camarot":
                camarote camarot = new camarote(atributos[0],
                    atributos[1],
                    atributos[2],
                    atributos[3]);
                return (Object) camarot;
            case "rentautos":
                rentautos renta = new rentautos(atributos[0],
                    atributos[1],
                    atributos[2],
                    atributos[3],
                    atributos[4],
                    atributos[5],
                    atributos[6],
                    atributos[7],
                    atributos[8]);
                return (Object) renta;
            case "destino":
                destino dest = new destino(atributos[0],
                    atributos[1],
                    atributos[2],
                    atributos[3],
                    atributos[4],
                    atributos[5],
                    atributos[6]);
                return (Object) dest;
            case "lugares":
                lugares lugar = new lugares(atributos[0],
                    atributos[1],
                    atributos[2],
                    atributos[3],
                    atributos[4],
                    atributos[5],
                    atributos[6],
                    atributos[7],
                    atributos[8],
                    atributos[9],
                    atributos[10]);
                return (Object) lugar;
            case "cliente":
                cliente clientes = new cliente(atributos[0],
                    atributos[1],
                    atributos[2],
                    atributos[3],
                    atributos[4],
                    atributos[5],
                    atributos[6],
                    atributos[7],
                    atributos[8],
                    atributos[9]);
                return (Object) clientes;
            case "entidad":
                entidad entidadfina = new entidad(atributos[0],
                    atributos[1],
                    atributos[2],
                    atributos[3],
                    atributos[4],
                    atributos[5]);
                return (Object) entidadfina;
            case "paquete":
                paquete paqu = new paquete(atributos[0],
                    atributos[1],
                    atributos[2],
                    atributos[3],
                    atributos[4],
                    atributos[5],
                    atributos[6],
                    atributos[7],
                    atributos[8],
                    atributos[9],
                    atributos[10]);
                return (Object) paqu;  
            case "reservacion":
                reservacion reservaciones = new reservacion(atributos[0],
                    atributos[1],
                    atributos[2],
                    atributos[3],
                    atributos[4],
                    atributos[5],
                    atributos[6],
                    atributos[7]);
                return (Object) reservaciones;                
        }       
        return null;
    }  
}
