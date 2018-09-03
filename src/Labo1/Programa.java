/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labo1;

import javax.swing.JOptionPane;

/**
 *
 * @author Steve S
 */
public class Programa extends javax.swing.JFrame {
    
    
    /**
     * Creates new form Cuotas
     */
    public Programa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        monto = new javax.swing.JTextField();
        tiempo = new javax.swing.JTextField();
        interes = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAleman = new javax.swing.JButton();
        javax.swing.JButton btnFrances = new javax.swing.JButton();
        Americano = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        monto.setToolTipText("");

        tiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiempoActionPerformed(evt);
            }
        });

        interes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interesActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("MONTO");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("AÑOS");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("INTERES ANUAL");

        btnAleman.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        btnAleman.setText("Método Alemán");
        btnAleman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlemanActionPerformed(evt);
            }
        });

        btnFrances.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        btnFrances.setText("Método Francés");
        btnFrances.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrancesActionPerformed(evt);
            }
        });

        Americano.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        Americano.setText("Método Americano");
        Americano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmericanoActionPerformed(evt);
            }
        });

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No de Cuota", "Saldo Deuda", "Pago Intereses", "Pago Capital", "Cuota"
            }
        ));
        jScrollPane1.setViewportView(Tabla);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("CALCULO DE AMORTIZACIONES");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Limpiar Pantalla");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 947, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(interes))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))
                                        .addGap(64, 64, 64)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(monto, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(189, 189, 189)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(105, 105, 105)
                                        .addComponent(btnAleman)
                                        .addGap(41, 41, 41)
                                        .addComponent(btnFrances)
                                        .addGap(44, 44, 44)
                                        .addComponent(Americano))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(433, 433, 433)
                        .addComponent(jButton1)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(monto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(interes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAleman)
                    .addComponent(btnFrances)
                    .addComponent(Americano))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton1)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private double  Monto;
    private double  tasa;
    private int     anios;
    private double  calculoCuota;
    private  String[][] resultado;
    
    private void obtenerDatos(){
        
          try
            {
                 this.Monto   = Double.parseDouble(monto.getText());
                 this.tasa    = Double.parseDouble(interes.getText());
                 this.anios   = Integer.parseInt(tiempo.getText());
            }
            catch (Exception e) 
            {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
            
    }
    private void llenarTabla(){
            Tabla.setModel(new javax.swing.table.DefaultTableModel(
            resultado,
            new String [] {
                "No de Cuota", "Saldo Deuda", "Pago Intereses", "Pago Capital", "Cuota"
            }
        ));
    }
    private void cacularMetodoFances(){
        obtenerDatos();
        CalcFrances nuevoCalculoFances = new CalcFrances();
        nuevoCalculoFances.setMontoPrestamo(this.Monto);
        nuevoCalculoFances.setNumeroAnios(this.anios);
        nuevoCalculoFances.setTasaInteres(this.tasa);
        
        nuevoCalculoFances.setSaldoCuenta(nuevoCalculoFances.getMontoPrestamo());    
        
        calculoCuota= nuevoCalculoFances.calculoCuotas(this.anios);
        resultado=new String[nuevoCalculoFances.getNumeroCuotas()][5];
        double pagoInteres;
        double pagoCapital;
 
        /*llena la columna de pago a capital*/
        for(int i=0;i<nuevoCalculoFances.getNumeroCuotas();i++){
            pagoInteres = nuevoCalculoFances.PagoInteres();
            pagoCapital = nuevoCalculoFances.calculoPagoCapital();
            
            resultado[i][0]=String.valueOf(i+1);
            resultado[i][1]=String.valueOf(nuevoCalculoFances.getSaldoCuenta());
            resultado[i][2]=String.valueOf(pagoInteres);
            resultado[i][3]=String.valueOf(pagoCapital);
            resultado[i][4]=String.valueOf(calculoCuota);

            nuevoCalculoFances.setSaldoCuenta(nuevoCalculoFances.getSaldoCuenta() - pagoCapital);
        }
         llenarTabla();
    }
    private void calcularAmericano(){
        obtenerDatos();
        CalcAmericano nuevoCalculo = new CalcAmericano();
        nuevoCalculo.setMontoPrestamo(this.Monto);
        nuevoCalculo.setNumeroAnios(this.anios);
        nuevoCalculo.setTasaInteres(this.tasa);
        
        resultado=new String[nuevoCalculo.getNumeroCuotas()][5]; 
        double pagoCapital;
        double interes;
        for(int i=0;i<nuevoCalculo.getNumeroCuotas();i++){
            resultado[i][0]=String.valueOf(i+1);
            resultado[i][1] = String.valueOf(nuevoCalculo.getMontoPrestamo());
            interes = nuevoCalculo.PagoInteres();
            resultado[i][2]=String.valueOf(interes);
            if(i+1 == nuevoCalculo.getNumeroCuotas()){
                 pagoCapital = nuevoCalculo.getMontoPrestamo();
                 resultado[i][3]=String.valueOf(pagoCapital);
                   
            }else{
                  pagoCapital = 0.00;
                  resultado[i][3]=String.valueOf(pagoCapital);
            }
            resultado[i][4]=String.valueOf(pagoCapital + interes);
           
        }
         llenarTabla();
    }
    private void btnFrancesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrancesActionPerformed
        cacularMetodoFances();
    }//GEN-LAST:event_btnFrancesActionPerformed

    private void tiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tiempoActionPerformed

    private void btnAlemanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlemanActionPerformed
        obtenerDatos();
        anios=anios*12;
        CalcAleman calculo=new CalcAleman();
        calculo.setMontoPrestamo(Monto);
        calculo.setTasaInteres(tasa);
        calculo.setNumeroAnios(anios);

        resultado=new String[anios][5];
        calculoCuota=calculo.calculoCuotas(calculo.numeroAnios);
        for(int i=0;i<anios;i++){
            resultado[i][0]=String.valueOf(i+1);
            resultado[i][3]=String.valueOf(calculoCuota);
        }

        for(int i=0; i<anios ;i++){
            resultado[i][1]=String.valueOf(calculo.montoPrestamo);
            resultado[i][2]=String.valueOf(calculo.PagoInteres());
            resultado[i][4]=String.valueOf(calculo.PagoInteres()+calculoCuota);
            calculo.montoPrestamo=calculo.montoPrestamo-calculoCuota;
        }
        llenarTabla();
    }//GEN-LAST:event_btnAlemanActionPerformed

    private void AmericanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmericanoActionPerformed
        calcularAmericano();
    }//GEN-LAST:event_AmericanoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

      this.Monto = 0;   
      monto.setText("");
      this.tasa    = 0;
      this.interes.setText("");
      this.anios   = 0; 
      this.tiempo.setText("");
      
      
      Tabla.setModel(new javax.swing.table.DefaultTableModel(
            null,
            new String [] {
                "No de Cuota", "Saldo Deuda", "Pago Intereses", "Pago Capital", "Cuota"
            }
        ));
      
      
      
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void interesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_interesActionPerformed

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
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Programa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Americano;
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnAleman;
    private javax.swing.JTextField interes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField monto;
    private javax.swing.JTextField tiempo;
    // End of variables declaration//GEN-END:variables
}
