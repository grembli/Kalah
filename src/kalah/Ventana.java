/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalah;

/**
 *
 * @author Jose
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    String turno="0";
    int tur=0;
    int[] JUG1 = new int[7];
    int[] JUG2 = new int[7];
    public Ventana() {
        initComponents();
        
        asignarfichas();
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupo1 = new javax.swing.ButtonGroup();
        Grupo2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        ALMACEN2 = new javax.swing.JButton();
        ALMACEN1 = new javax.swing.JButton();
        CASA13 = new javax.swing.JButton();
        CASA11 = new javax.swing.JButton();
        CASA12 = new javax.swing.JButton();
        CASA16 = new javax.swing.JButton();
        CASA14 = new javax.swing.JButton();
        CASA15 = new javax.swing.JButton();
        CASA23 = new javax.swing.JButton();
        CASA21 = new javax.swing.JButton();
        CASA22 = new javax.swing.JButton();
        CASA26 = new javax.swing.JButton();
        CASA24 = new javax.swing.JButton();
        CASA25 = new javax.swing.JButton();
        Turnos = new javax.swing.JTextField();
        TurnoTerminado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ALMACEN2.setBackground(new java.awt.Color(255, 51, 51));
        ALMACEN2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        ALMACEN1.setBackground(new java.awt.Color(51, 0, 255));
        ALMACEN1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ALMACEN1.setForeground(new java.awt.Color(255, 51, 51));

        CASA13.setBackground(new java.awt.Color(51, 51, 255));
        CASA13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Grupo1.add(CASA13);

        CASA11.setBackground(new java.awt.Color(51, 51, 255));
        CASA11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Grupo1.add(CASA11);
        CASA11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CASA11ActionPerformed(evt);
            }
        });

        CASA12.setBackground(new java.awt.Color(51, 51, 255));
        CASA12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Grupo1.add(CASA12);
        CASA12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CASA12ActionPerformed(evt);
            }
        });

        CASA16.setBackground(new java.awt.Color(51, 51, 255));
        CASA16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Grupo1.add(CASA16);

        CASA14.setBackground(new java.awt.Color(51, 51, 255));
        CASA14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Grupo1.add(CASA14);

        CASA15.setBackground(new java.awt.Color(51, 51, 255));
        CASA15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Grupo1.add(CASA15);

        CASA23.setBackground(new java.awt.Color(255, 153, 153));
        CASA23.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Grupo2.add(CASA23);

        CASA21.setBackground(new java.awt.Color(255, 153, 153));
        CASA21.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Grupo2.add(CASA21);

        CASA22.setBackground(new java.awt.Color(255, 153, 153));
        CASA22.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Grupo2.add(CASA22);

        CASA26.setBackground(new java.awt.Color(255, 153, 153));
        CASA26.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Grupo2.add(CASA26);

        CASA24.setBackground(new java.awt.Color(255, 153, 153));
        CASA24.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Grupo2.add(CASA24);

        CASA25.setBackground(new java.awt.Color(255, 153, 153));
        CASA25.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Grupo2.add(CASA25);

        Turnos.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Turnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TurnosActionPerformed(evt);
            }
        });

        TurnoTerminado.setText("Turno Terminado");
        TurnoTerminado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TurnoTerminadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ALMACEN2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Turnos, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(163, 163, 163)
                        .addComponent(ALMACEN1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(CASA21, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CASA22, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CASA23, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(CASA24, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CASA25, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CASA26, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(CASA11, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(CASA12, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CASA13, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(CASA14, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CASA15, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CASA16, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TurnoTerminado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CASA26, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CASA23, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CASA22, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CASA25, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CASA24, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CASA21, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ALMACEN2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ALMACEN1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Turnos, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CASA15, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CASA16, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CASA14, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CASA13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CASA12, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CASA11, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(TurnoTerminado)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TurnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TurnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TurnosActionPerformed

    private void TurnoTerminadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TurnoTerminadoActionPerformed
        tur=Integer.parseInt(turno);
        tur=tur+1;
        turno = String.valueOf(tur);
        Turnos.setText(turno);
    }//GEN-LAST:event_TurnoTerminadoActionPerformed

    private void CASA11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CASA11ActionPerformed
        CASA11.setText("0");
        
        for(int i=1;i<(JUG1[0]+1);i++){
            JUG1[i]=JUG1[i]+1;
            
        }
        JUG1[0]=0;
        CASA12.setText(String.valueOf(JUG1[1]));
        CASA13.setText(String.valueOf(JUG1[2]));
        CASA14.setText(String.valueOf(JUG1[3]));
        CASA15.setText(String.valueOf(JUG1[4]));
        CASA16.setText(String.valueOf(JUG1[5]));
    }//GEN-LAST:event_CASA11ActionPerformed

    private void CASA12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CASA12ActionPerformed
        CASA12.setText("0");
        
        for(int i=0;i<(JUG1[1]);i++){
            JUG1[i]=JUG1[i]+1;
            
        }
        JUG1[1]=0;
        CASA13.setText(String.valueOf(JUG1[2]));
        CASA14.setText(String.valueOf(JUG1[3]));
        CASA15.setText(String.valueOf(JUG1[4]));
        CASA16.setText(String.valueOf(JUG1[5]));
        
    }//GEN-LAST:event_CASA12ActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ALMACEN1;
    private javax.swing.JButton ALMACEN2;
    private javax.swing.JButton CASA11;
    private javax.swing.JButton CASA12;
    private javax.swing.JButton CASA13;
    private javax.swing.JButton CASA14;
    private javax.swing.JButton CASA15;
    private javax.swing.JButton CASA16;
    private javax.swing.JButton CASA21;
    private javax.swing.JButton CASA22;
    private javax.swing.JButton CASA23;
    private javax.swing.JButton CASA24;
    private javax.swing.JButton CASA25;
    private javax.swing.JButton CASA26;
    private javax.swing.ButtonGroup Grupo1;
    private javax.swing.ButtonGroup Grupo2;
    private javax.swing.JButton TurnoTerminado;
    private javax.swing.JTextField Turnos;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void asignarfichas() {
        CASA11.setText("3");
        CASA12.setText("3");
        CASA13.setText("3");
        CASA14.setText("3");
        CASA15.setText("3");
        CASA16.setText("3");
        
        for(int i=0;i<JUG1.length;i++){
            JUG1[i]=3;
        }
        
        CASA21.setText("3");
        CASA22.setText("3");
        CASA23.setText("3");
        CASA24.setText("3");
        CASA25.setText("3");
        CASA26.setText("3");
        
        for(int i=0;i<JUG2.length;i++){
            JUG2[i]=3;
        }
    }

}
