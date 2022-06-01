package View;

import javax.swing.*;
import java.awt.*;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.JFrame;
import java.awt.event.*;

// Importar paquetes necesarios
 
public class loginWindow extends JFrame{

	public loginWindow() {

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
		setTitle("Inicio de sesión");
		imgUserLogin = new javax.swing.JButton();
        imgPassUser = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtUserLogin = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtPassLogin = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);

        imgUserLogin.setBackground(new java.awt.Color(242, 242, 242));
        imgUserLogin.setForeground(new java.awt.Color(242, 242, 242));
        imgUserLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/User2.png"))); // NOI18N
        imgUserLogin.setBorder(null);
        imgUserLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imgUserLoginActionPerformed(evt);
            }
        });

        imgPassUser.setBackground(new java.awt.Color(242, 242, 242));
        imgPassUser.setForeground(new java.awt.Color(242, 242, 242));
        imgPassUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pass.gif"))); // NOI18N
        imgPassUser.setBorder(null);
        imgPassUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imgPassUserActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(204, 255, 204));
        btnLogin.setText("Ingregar");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(255, 204, 204));
        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        txtUserLogin.setBackground(new java.awt.Color(255, 255, 204));
        txtUserLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserLoginActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¡Ingresa tus credenciales!");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("¿No tienes credenciales? ¡Disfruta de nuestro menú!");

        txtPassLogin.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imgPassUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imgUserLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUserLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                            .addComponent(txtPassLogin)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addGap(0, 40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUserLogin)
                    .addComponent(imgUserLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imgPassUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPassLogin))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

		btnLogin.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent me) {
             // Acción a realizar cuando se pasa el mouse sobre el botón
			 btnLogin.setBackground(Color.green);
      
            }public void mouseExited(MouseEvent me) {
             // Acción a realizar cuando se el mouse ya no se encuentra sobre el botón
      
			 btnLogin.setBackground(new java.awt.Color(204, 255, 204));
            }
          });

		btnCancel.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent me) {
             // Acción a realizar cuando se pasa el mouse sobre el botón
			btnCancel.setBackground(Color.red);
      
            }public void mouseExited(MouseEvent me) {
             // Acción a realizar cuando se el mouse ya no se encuentra sobre el botón
      
			btnCancel.setBackground(new java.awt.Color(255, 204, 204));
            }
          });

        pack();
    }// </editor-fold>                        

    private void txtUserLoginActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void imgUserLoginActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void imgPassUserActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
		//------------------------ADMIN O MESERO-----------------------------------------------------
		setVisible(false);
		adminWindow adminWindow = new adminWindow();
		adminWindow.setVisible(true);
    }                                        

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {                                          
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
            java.util.logging.Logger.getLogger(loginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton imgPassUser;
    private javax.swing.JButton imgUserLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField txtPassLogin;
    private javax.swing.JTextField txtUserLogin;
    // End of variables declaration                   
}





/*
		btnLogin.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent me) {
			 // Acción a realizar cuando se pasa el mouse sobre el botón
			 	btnLogin.setBackground(Color.WHITE);
	  
			}public void mouseExited(MouseEvent me) {
			 // Acción a realizar cuando se el mouse ya no se encuentra sobre el botón
	  
			 	btnLogin.setBackground(Color.GREEN);
			}
		  });

		
		btnCancel.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent me) {
			 // Acción a realizar cuando se pasa el mouse sobre el botón
			 	btnCancel.setBackground(Color.WHITE);
	  
			}public void mouseExited(MouseEvent me) {
			 // Acción a realizar cuando se el mouse ya no se encuentra sobre el botón
	  
			 	btnCancel.setBackground(Color.RED);
			}
		  });


		//ACCIONES A REALIZAR AL PULSAR BOTONES

		btnLogin.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				btnLogin.setBackground(Color.green);
			  	System.out.println("ACCION REALIZADA");

			  	//CIERRA Y ABRE LA PROXIMA VENTANA
			  	credWindow.setVisible(false);
			  	String Message = "SE ABRE LA VENTANA DE ADMIN O MESERO";
        		JOptionPane.showMessageDialog(null, Message);
			}
		});


		btnCancel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				btnCancel.setBackground(Color.red);
			  	System.out.println("ACCION REALIZADA");

			  	//CIERRA Y ABRE LA PROXIMA VENTANA
			  	credWindow.setVisible(false);
			  	initWindow initWindow = new initWindow();
			  	initWindow.setVisible(true);
			}
		});
*/