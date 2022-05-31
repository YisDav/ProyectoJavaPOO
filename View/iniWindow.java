import javax.swing.*;
import java.awt.*;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.JFrame;
import java.awt.event.*;



public class iniWindow extends JFrame {

  public iniWindow() {

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
  
      //------------[FRAME]-----------------
  
    setTitle("EanTaste, tu restaurante");
    setIconImage(new ImageIcon(getClass().getResource("/Images/Ejp.png")).getImage());
    setResizable(false);
    btnEmploy = new javax.swing.JButton();
        btnClient = new javax.swing.JButton();
        btnLogo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnEmploy.setBackground(new java.awt.Color(255, 255, 204));
        btnEmploy.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        btnEmploy.setText("Soy trabajador");
        btnEmploy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployActionPerformed(evt);
            }
        });

        btnClient.setBackground(new java.awt.Color(204, 255, 204));
        btnClient.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        btnClient.setText("¡Tengo antojos!");
        btnClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientActionPerformed(evt);
            }
        });

        btnLogo.setForeground(new java.awt.Color(153, 255, 204));
        btnLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo.png"))); // NOI18N
        btnLogo.setBorder(null);
        btnLogo.setBorderPainted(false);
        btnLogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoActionPerformed(evt);
            }
        });

        jLabel1.setText("Si perteneces a EanTaste");

        jLabel2.setText("Si quieres cumplir tus antojos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnEmploy, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnClient, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(btnLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClient, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEmploy, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        btnClient.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent me) {
             // Acción a realizar cuando se pasa el mouse sobre el botón
              btnClient.setBackground(Color.green);
      
            }public void mouseExited(MouseEvent me) {
             // Acción a realizar cuando se el mouse ya no se encuentra sobre el botón
      
              btnClient.setBackground(new java.awt.Color(204, 255, 204));
            }
          });

          btnEmploy.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent me) {
             // Acción a realizar cuando se pasa el mouse sobre el botón
             btnEmploy.setBackground(Color.ORANGE);
      
            }public void mouseExited(MouseEvent me) {
             // Acción a realizar cuando se el mouse ya no se encuentra sobre el botón
      
             btnEmploy.setBackground(new java.awt.Color(255, 255, 204));
            }
          });

          btnLogo.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent me) {
             // Acción a realizar cuando se pasa el mouse sobre el botón
                btnLogo.setBackground(Color.white);
            }public void mouseExited(MouseEvent me) {
             // Acción a realizar cuando se el mouse ya no se encuentra sobre el botón
      
             btnLogo.setBackground(null);
            }
          });

        pack();
    }// </editor-fold>                        

    
    private void btnEmployActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        setVisible(false);
        loginWindow credentialWindow = new loginWindow();
        credentialWindow.setVisible(true);
    }                                         

    private void btnClientActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        String Message = "Asi como nos interesa tu dinero, nos interesas tú, ¿como te llamas?";
        nameInput = JOptionPane.showInputDialog(Message);
        //JOptionPane.showMessageDialog(null, "Bienvenido/a "+nameInput);
        setVisible(false);
        clientWindow clientWindow = new clientWindow();
        clientWindow.setVisible(true);
    }                                         

    private void btnLogoActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        setBackground(new Color(255, 243, 243));
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
            java.util.logging.Logger.getLogger(iniWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(iniWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(iniWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(iniWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new iniWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnClient;
    private javax.swing.JButton btnEmploy;
    private javax.swing.JButton btnLogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static String nameInput = "";
    // End of variables declaration                   
}
