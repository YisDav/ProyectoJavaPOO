package src.View;

import javax.swing.*;
import java.awt.*;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.JFrame;
import java.awt.event.*;

import src.Product;


public class clientWindow extends JFrame {

  public clientWindow() {

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

    setIconImage(new ImageIcon(getClass().getResource("/Images/Ejp.png")).getImage());
    setResizable(false);
    setTitle("Cliente " + iniWindow.nameInput);
    lblMenu = new javax.swing.JLabel();
    imgBebida = new javax.swing.JButton();
    imgPlato = new javax.swing.JButton();
    jScrollPane3 = new javax.swing.JScrollPane();
    tablaBebidas = new javax.swing.JTable();
    imgPostre = new javax.swing.JButton();
    jScrollPane5 = new javax.swing.JScrollPane();
    tablaPlatos = new javax.swing.JTable();
    jScrollPane6 = new javax.swing.JScrollPane();
    tablaPostres = new javax.swing.JTable();
    jSeparator1 = new javax.swing.JSeparator();
    lblWelcomeClient = new javax.swing.JLabel();
    lblAddresClient = new javax.swing.JLabel();
    lblTelefonoClient = new javax.swing.JLabel();
    txtAddresClient = new javax.swing.JTextField();
    txtTelefonClient = new javax.swing.JTextField();
    checkAddresClient = new javax.swing.JRadioButton();
    jSeparator2 = new javax.swing.JSeparator();
    jSeparator3 = new javax.swing.JSeparator();
    btnInicio = new javax.swing.JButton();
    btnFacturarClient = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    lblMenu.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
    lblMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lblMenu.setText("El menú que le gusta a tus antojos");
    lblMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    lblMenu.setName(""); // NOI18N
    lblMenu.setVerifyInputWhenFocusTarget(false);

    imgBebida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Bebida.gif"))); // NOI18N

    imgPlato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Plato.gif"))); // NOI18N

    tablaBebidas.setModel(new javax.swing.table.DefaultTableModel(
        Product.to2DObjectProductList(0),
        new String [] {
            "Bebidas", "Descripcion", "Precio", "Cantidad"
        }
    ) {
        Class[] types = new Class [] {
            java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
        };
        boolean[] canEdit = new boolean [] {
            true, false, false, true
        };

        public Class getColumnClass(int columnIndex) {
            return types [columnIndex];
        }

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    jScrollPane3.setViewportView(tablaBebidas);
    if (tablaBebidas.getColumnModel().getColumnCount() > 0) {
        tablaBebidas.getColumnModel().getColumn(0).setResizable(false);
        tablaBebidas.getColumnModel().getColumn(2).setResizable(false);
        tablaBebidas.getColumnModel().getColumn(3).setResizable(false);
    }

    imgPostre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Postre.gif"))); // NOI18N

    tablaPlatos.setModel(new javax.swing.table.DefaultTableModel(
        Product.to2DObjectProductList(2),
        new String [] {
            "Plato", "Descripcion", "Precio", "Cantidad"
        }
    ) {
        Class[] types = new Class [] {
            java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
        };
        boolean[] canEdit = new boolean [] {
            true, false, false, true
        };

        public Class getColumnClass(int columnIndex) {
            return types [columnIndex];
        }

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    jScrollPane5.setViewportView(tablaPlatos);
    if (tablaPlatos.getColumnModel().getColumnCount() > 0) {
        tablaPlatos.getColumnModel().getColumn(0).setResizable(false);
        tablaPlatos.getColumnModel().getColumn(2).setResizable(false);
        tablaPlatos.getColumnModel().getColumn(3).setResizable(false);
    }

    tablaPostres.setModel(new javax.swing.table.DefaultTableModel(
        Product.to2DObjectProductList(1),
        new String [] {
            "Postre", "Descripcion", "Precio", "Cantidad"
        }
    ) {
        Class[] types = new Class [] {
            java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
        };
        boolean[] canEdit = new boolean [] {
            true, false, false, true
        };

        public Class getColumnClass(int columnIndex) {
            return types [columnIndex];
        }

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    jScrollPane6.setViewportView(tablaPostres);
    if (tablaPostres.getColumnModel().getColumnCount() > 0) {
        tablaPostres.getColumnModel().getColumn(0).setResizable(false);
        tablaPostres.getColumnModel().getColumn(2).setResizable(false);
        tablaPostres.getColumnModel().getColumn(3).setResizable(false);
    }

    jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

    lblWelcomeClient.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
    lblWelcomeClient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lblWelcomeClient.setText("¡Bienvenido "+iniWindow.nameInput+"!");
    lblWelcomeClient.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    lblWelcomeClient.setName(""); // NOI18N
    lblWelcomeClient.setVerifyInputWhenFocusTarget(false);

    lblAddresClient.setText("Direccion");

    lblTelefonoClient.setText("Telefono");

    txtAddresClient.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtAddresClientActionPerformed(evt);
        }
    });

    txtTelefonClient.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtTelefonClientActionPerformed(evt);
        }
    });

    checkAddresClient.setText("Domicilio");
    checkAddresClient.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            checkAddresClientActionPerformed(evt);
        }
    });

    btnInicio.setBackground(new java.awt.Color(153, 153, 153));
    btnInicio.setText("Atrás");
    btnInicio.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnInicioActionPerformed(evt);
        }
    });

    btnFacturarClient.setText("¡Facturame!");
    btnFacturarClient.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnFacturarClientActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblWelcomeClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(checkAddresClient, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(33, 33, 33)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblTelefonoClient, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblAddresClient))
                                    .addGap(27, 27, 27)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtTelefonClient, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                        .addComponent(txtAddresClient)))
                                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGap(18, 18, 18))
                .addGroup(layout.createSequentialGroup()
                    .addGap(96, 96, 96)
                    .addComponent(btnFacturarClient, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)))
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(imgPostre, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(imgBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(imgPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(16, 16, 16))))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(lblWelcomeClient, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtAddresClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblAddresClient))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblTelefonoClient)
                                .addComponent(txtTelefonClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(checkAddresClient)))
                    .addGap(24, 24, 24)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFacturarClient)
                    .addGap(35, 35, 35)
                    .addComponent(btnInicio))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(lblMenu)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(215, 215, 215)
                            .addComponent(imgBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(imgPostre, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(imgPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGap(19, 19, 19))
    );

    lblMenu.getAccessibleContext().setAccessibleDescription("");

    pack();
}// </editor-fold>                        

private void checkAddresClientActionPerformed(java.awt.event.ActionEvent evt) {                                                  
    // TODO add your handling code here:
}                                                 

private void txtAddresClientActionPerformed(java.awt.event.ActionEvent evt) {                                                
    // TODO add your handling code here:
}                                               

private void txtTelefonClientActionPerformed(java.awt.event.ActionEvent evt) {                                                 
    // TODO add your handling code here:
}                                                

private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {                                          
    // TODO add your handling code here:
    setVisible(false);
	iniWindow iniWindow = new iniWindow();
	iniWindow.setVisible(true);
}                                         

private void btnFacturarClientActionPerformed(java.awt.event.ActionEvent evt) {                                                  
    // TODO add your handling code here:
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
        java.util.logging.Logger.getLogger(clientWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(clientWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(clientWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(clientWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new clientWindow().setVisible(true);
        }
    });
}

// Variables declaration - do not modify                     
private javax.swing.JButton btnFacturarClient;
private javax.swing.JButton btnInicio;
private javax.swing.JRadioButton checkAddresClient;
private javax.swing.JButton imgBebida;
private javax.swing.JButton imgPlato;
private javax.swing.JButton imgPostre;
private javax.swing.JScrollPane jScrollPane3;
private javax.swing.JScrollPane jScrollPane5;
private javax.swing.JScrollPane jScrollPane6;
private javax.swing.JSeparator jSeparator1;
private javax.swing.JSeparator jSeparator2;
private javax.swing.JSeparator jSeparator3;
private javax.swing.JLabel lblAddresClient;
private javax.swing.JLabel lblMenu;
private javax.swing.JLabel lblTelefonoClient;
private javax.swing.JLabel lblWelcomeClient;
private javax.swing.JTable tablaBebidas;
private javax.swing.JTable tablaPlatos;
private javax.swing.JTable tablaPostres;
private javax.swing.JTextField txtAddresClient;
private javax.swing.JTextField txtTelefonClient;
// End of variables declaration                   
}
