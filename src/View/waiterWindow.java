package src.View;

import javax.swing.*;
import java.awt.*;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.JFrame;
import java.awt.event.*;


public class waiterWindow extends JFrame {
    
    public waiterWindow(){

    // ---------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------

    try {
        for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
        } catch (Exception e) {
            // If Nimbus is not available, you can set the GUI to another look and feel.
        }

        // ---------------------------------------------------------------------------------------
        //----------------------------------------------------------------------------------------
  
        setIconImage(new ImageIcon(getClass().getResource("/Images/Ejp.png")).getImage());
        setResizable(false);
        
        
        btnInicio = new javax.swing.JButton();
        welcomeWaiter = new javax.swing.JLabel();
        welcomeWaiter2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIdWaiter = new javax.swing.JLabel();
        txtNameWaiter = new javax.swing.JLabel();
        txtNacDateWaiter = new javax.swing.JLabel();
        txtSalaryWaiter = new javax.swing.JLabel();
        txtPropWaiter = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtIngDateWaiter = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtUserWaiter = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mi informacion");
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        btnInicio.setBackground(new java.awt.Color(255, 204, 204));
        btnInicio.setText("Atrás");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        welcomeWaiter.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        welcomeWaiter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeWaiter.setText("¡Nos alegra cada dia que ");

        welcomeWaiter2.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        welcomeWaiter2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeWaiter2.setText("haces parte de esta familia!");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Corbel Light", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¿Que?");

        jLabel2.setFont(new java.awt.Font("Corbel Light", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Mi informacion");

        jLabel3.setFont(new java.awt.Font("Corbel Light", 3, 14)); // NOI18N
        jLabel3.setText("Identificacion");

        jLabel4.setFont(new java.awt.Font("Corbel Light", 3, 14)); // NOI18N
        jLabel4.setText("Nombre");

        jLabel5.setFont(new java.awt.Font("Corbel Light", 3, 14)); // NOI18N
        jLabel5.setText("Fecha de nacimiento");

        txtIdWaiter.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N
        txtIdWaiter.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtIdWaiter.setText("jLabel2");

        txtNameWaiter.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N
        txtNameWaiter.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtNameWaiter.setText("jLabel2");

        txtNacDateWaiter.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N
        txtNacDateWaiter.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtNacDateWaiter.setText("jLabel2");

        txtSalaryWaiter.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N
        txtSalaryWaiter.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtSalaryWaiter.setText("jLabel2");

        txtPropWaiter.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N
        txtPropWaiter.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtPropWaiter.setText("jLabel2");

        jLabel11.setFont(new java.awt.Font("Corbel Light", 3, 14)); // NOI18N
        jLabel11.setText("Fecha de ingreso");

        jLabel12.setFont(new java.awt.Font("Corbel Light", 3, 14)); // NOI18N
        jLabel12.setText("Salario");

        jLabel13.setFont(new java.awt.Font("Corbel Light", 3, 14)); // NOI18N
        jLabel13.setText("Propina actual");

        txtIngDateWaiter.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N
        txtIngDateWaiter.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtIngDateWaiter.setText("jLabel2");

        jLabel16.setFont(new java.awt.Font("Corbel Light", 3, 14)); // NOI18N
        jLabel16.setText("Usuario");

        txtUserWaiter.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N
        txtUserWaiter.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtUserWaiter.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(22, 22, 22))
                            .addComponent(jLabel5))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPropWaiter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUserWaiter, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 12, Short.MAX_VALUE)
                                .addComponent(txtNacDateWaiter, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtIdWaiter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNameWaiter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtIngDateWaiter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSalaryWaiter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIdWaiter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNameWaiter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNacDateWaiter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtIngDateWaiter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtSalaryWaiter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtPropWaiter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtUserWaiter))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(welcomeWaiter2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(welcomeWaiter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(welcomeWaiter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(welcomeWaiter2)
                .addGap(38, 38, 38)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnInicio)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        btnInicio.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent me) {
             // Acción a realizar cuando se pasa el mouse sobre el botón
            btnInicio.setBackground(Color.red);
      
            }public void mouseExited(MouseEvent me) {
             // Acción a realizar cuando se el mouse ya no se encuentra sobre el botón
      
            btnInicio.setBackground(new java.awt.Color(255, 204, 204));
            }
          });

        

        pack();
    }// </editor-fold>                        

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        setVisible(false);
		iniWindow initWindow = new iniWindow();
		initWindow.setVisible(true);
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
            java.util.logging.Logger.getLogger(waiterWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(waiterWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(waiterWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(waiterWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new waiterWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel txtIdWaiter;
    private javax.swing.JLabel txtIngDateWaiter;
    private javax.swing.JLabel txtNacDateWaiter;
    private javax.swing.JLabel txtNameWaiter;
    private javax.swing.JLabel txtPropWaiter;
    private javax.swing.JLabel txtSalaryWaiter;
    private javax.swing.JLabel txtUserWaiter;
    private javax.swing.JLabel welcomeWaiter;
    private javax.swing.JLabel welcomeWaiter2;
    // End of variables declaration                   
}
