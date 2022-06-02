package src.View;

import javax.swing.*;
import java.awt.*;
import javax.swing.UIManager.LookAndFeelInfo;

import src.Product;

import javax.swing.JFrame;
import java.awt.event.*;
import java.util.ArrayList;


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
        jPanel1 = new javax.swing.JPanel();
        tituloFact = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        numPlatosFact = new javax.swing.JLabel();
        numBebidasFact = new javax.swing.JLabel();
        numPostresFact = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pricePlatosFact = new javax.swing.JLabel();
        priceBebidasFact = new javax.swing.JLabel();
        pricePostresFact = new javax.swing.JLabel();
        priceTotalFact = new javax.swing.JLabel();
        totalFact = new javax.swing.JLabel();
        priceDomicilioFact = new javax.swing.JLabel();
        domicilioFact = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        btnClearClient = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();

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

        btnFacturarClient.setBackground(new java.awt.Color(153, 204, 255));
        btnFacturarClient.setText("¡Facturame!");
        btnFacturarClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturarClientActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tituloFact.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        tituloFact.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloFact.setText("Factura");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("¿Que?");

        numPlatosFact.setText("Platos");

        numBebidasFact.setText("Bebidas");

        numPostresFact.setText("Postres");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Precio");

        pricePlatosFact.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pricePlatosFact.setText("0.0");

        priceBebidasFact.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        priceBebidasFact.setText("0.0");

        pricePostresFact.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pricePostresFact.setText("0.0");

        priceTotalFact.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        priceTotalFact.setText("0.0");

        totalFact.setText("Subtotal");

        priceDomicilioFact.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        priceDomicilioFact.setText("0.0");

        domicilioFact.setText("Domicilio");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator4)
                    .addComponent(tituloFact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(60, Short.MAX_VALUE)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(domicilioFact, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(numPlatosFact, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(numBebidasFact, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(numPostresFact, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(totalFact, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pricePlatosFact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(priceBebidasFact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pricePostresFact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(priceTotalFact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(priceDomicilioFact, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))))))
                .addGap(59, 59, 59))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(tituloFact)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numPlatosFact)
                    .addComponent(pricePlatosFact))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(priceBebidasFact)
                    .addComponent(numBebidasFact))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numPostresFact)
                    .addComponent(pricePostresFact))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(domicilioFact)
                    .addComponent(priceDomicilioFact))
                .addGap(18, 18, 18)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalFact)
                    .addComponent(priceTotalFact))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        btnClearClient.setText("Limpiar todo");
        btnClearClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearClientActionPerformed(evt);
            }
        });

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblWelcomeClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(checkAddresClient, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblTelefonoClient, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblAddresClient))
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtTelefonClient, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                            .addComponent(txtAddresClient)))
                                    .addComponent(btnClearClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(btnFacturarClient, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblWelcomeClient, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtAddresClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblAddresClient))
                                        .addGap(13, 13, 13)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblTelefonoClient)
                                            .addComponent(txtTelefonClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(btnClearClient))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addComponent(checkAddresClient)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInicio)
                            .addComponent(btnFacturarClient))
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMenu)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(215, 215, 215)
                                        .addComponent(imgBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(imgPostre, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(imgPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        lblMenu.getAccessibleContext().setAccessibleDescription("");

        btnFacturarClient.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent me) {
             // Acción a realizar cuando se pasa el mouse sobre el botón
             btnFacturarClient.setBackground(Color.blue);
      
            }public void mouseExited(MouseEvent me) {
             // Acción a realizar cuando se el mouse ya no se encuentra sobre el botón
      
             btnFacturarClient.setBackground(new java.awt.Color(153, 204, 255));
            }
          });

          txtAddresClient.setEnabled(false);
          txtTelefonClient.setEnabled(false);
        pack();
    }// </editor-fold>                        


    
    private void checkAddresClientActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:

        if(checkAddresClient.isSelected()){
            txtAddresClient.setEnabled(true);
            txtTelefonClient.setEnabled(true);
            priceDomicilioFact.setText("5000.0");
          }else{
            txtAddresClient.setEnabled(false);
            txtTelefonClient.setEnabled(false);
            priceDomicilioFact.setText("0");
          }
        
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
		iniWindow initWindow = new iniWindow();
		initWindow.setVisible(true);
    }                                         

    private void btnFacturarClientActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // Facturar al clientev
        /*ArrayList<String> nombresPlatos = new ArrayList<String>();
        ArrayList<Double> preciosPlatos = new ArrayList<Double>();
        ArrayList<Integer> cantidaPlatos = new ArrayList<Integer>();*/
        double precioTotalPlatos = 0;
        String responsePlato = "";
        int numPlts = 0;
        double precioTotalBebidas = 0;
        String responseBebida = "";
        int numBebid = 0;
        double precioTotalPostres = 0;
        String responsePostre = "";
        int numPostr = 0;
        double totalFact = 0;

        //DATOS PARA PLATOS--------------

        for(int pl = 0; pl < Product.getList(2).size(); pl++)
        {
            String nombrePlato = String.valueOf(tablaPlatos.getValueAt(pl, 0));
            double precioPlato = Double.parseDouble(String.valueOf(tablaPlatos.getValueAt(pl, 2)));
            int cantidadPlatos = Integer.parseInt(String.valueOf(tablaPlatos.getValueAt(pl, 3)));

            if(cantidadPlatos > 0) {
                /*nombresPlatos.add(nombrePlato);
                preciosPlatos.add(precioPlato);
                cantidaPlatos.add(cantidadPlatos);*/
                precioTotalPlatos = precioTotalPlatos+(precioPlato*cantidadPlatos);
                numPlts += cantidadPlatos;
                responsePlato = String.format("%s %s (Q: %d): $%f\n", responsePlato, nombrePlato, cantidadPlatos, precioPlato);

            }
        }
        numPlatosFact.setText(numPlts+" plato(s)");
        pricePlatosFact.setText(new Double(precioTotalPlatos).toString());
        
        
        //DATOS PARA BEBIDAS-----------------

        for(int bd = 0; bd < Product.getList(0).size(); bd++)
        {
            String nombreBebida = String.valueOf(tablaBebidas.getValueAt(bd, 0));
            double precioBebida = Double.parseDouble(String.valueOf(tablaBebidas.getValueAt(bd, 2)));
            int cantidadBebidas = Integer.parseInt(String.valueOf(tablaBebidas.getValueAt(bd, 3)));

            if(cantidadBebidas > 0) {
                /*nombresPlatos.add(nombrePlato);
                preciosPlatos.add(precioPlato);
                cantidaPlatos.add(cantidadPlatos);*/
                System.out.println("C: "+cantidadBebidas);
                System.out.println("P: "+precioBebida);
                precioTotalBebidas = precioTotalBebidas+(precioBebida*cantidadBebidas);
                System.out.println("PT: "+precioTotalBebidas);
                numBebid += cantidadBebidas;
                responseBebida = String.format("%s %s (Q: %d): $%f\n", responseBebida, nombreBebida, cantidadBebidas, precioBebida);

            }
        }
        numBebidasFact.setText(numBebid+" bebida(s)");
        priceBebidasFact.setText(new Double(precioTotalBebidas).toString());
        
        //DATOS PARA POSTRES---------------

        for(int pt = 0; pt < Product.getList(1).size(); pt++)
        {
            String nombrePostre = String.valueOf(tablaPostres.getValueAt(pt, 0));
            double precioPostre = Double.parseDouble(String.valueOf(tablaPostres.getValueAt(pt, 2)));
            int cantidadPostres = Integer.parseInt(String.valueOf(tablaPostres.getValueAt(pt, 3)));

            if(cantidadPostres > 0) {
                /*nombresPlatos.add(nombrePlato);
                preciosPlatos.add(precioPlato);
                cantidaPlatos.add(cantidadPlatos);*/
                precioTotalPostres = precioTotalPostres+(precioPostre*cantidadPostres);
                numPostr += cantidadPostres;
                responsePostre = String.format("%s %s (Q: %d): $%f\n", responsePostre, nombrePostre, cantidadPostres, precioPostre);

            }
        }

        numPostresFact.setText(numPostr+" postre(s)");
        pricePostresFact.setText(new Double(precioTotalPostres).toString());

        //TOTAL DE LA FACTURA-------------------

        totalFact = (precioTotalPlatos+precioTotalBebidas+precioTotalPostres+Double.parseDouble(priceDomicilioFact.getText()));
        priceTotalFact.setText(new Double(totalFact).toString());

        System.out.println(responsePlato);
        System.out.println(responseBebida);
        System.out.println(responsePostre);
        
    }                                                 

    private void btnClearClientActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        txtAddresClient.setText(null);
        txtTelefonClient.setText(null);

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
    private javax.swing.JButton btnClearClient;
    private javax.swing.JButton btnFacturarClient;
    private javax.swing.JButton btnInicio;
    private javax.swing.JRadioButton checkAddresClient;
    private javax.swing.JLabel domicilioFact;
    private javax.swing.JButton imgBebida;
    private javax.swing.JButton imgPlato;
    private javax.swing.JButton imgPostre;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lblAddresClient;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblTelefonoClient;
    private javax.swing.JLabel lblWelcomeClient;
    private javax.swing.JLabel numBebidasFact;
    private javax.swing.JLabel numPlatosFact;
    private javax.swing.JLabel numPostresFact;
    private javax.swing.JLabel priceBebidasFact;
    private javax.swing.JLabel priceDomicilioFact;
    private javax.swing.JLabel pricePlatosFact;
    private javax.swing.JLabel pricePostresFact;
    private javax.swing.JLabel priceTotalFact;
    private javax.swing.JTable tablaBebidas;
    private javax.swing.JTable tablaPlatos;
    private javax.swing.JTable tablaPostres;
    private javax.swing.JLabel tituloFact;
    private javax.swing.JLabel totalFact;
    private javax.swing.JTextField txtAddresClient;
    private javax.swing.JTextField txtTelefonClient;
    double domicilio = 5000;
    // End of variables declaration                   
}