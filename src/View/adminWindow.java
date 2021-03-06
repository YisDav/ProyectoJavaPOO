package src.View;

import javax.management.RuntimeErrorException;
import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

import java.awt.event.*;

import src.*;


public class adminWindow extends JFrame{
 
    public adminWindow(){
 
        setIconImage(new ImageIcon(getClass().getResource("/Images/Ejp.png")).getImage());
        setResizable(false);
        setTitle("Ventana administrador");
        jTabbedPaneProdMes = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaProductAdmin = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNameProdAdmin = new javax.swing.JTextField();
        txtTypeProdAdmin = new javax.swing.JTextField();
        txtPriceProdAdmin = new javax.swing.JTextField();
        txtStockProdAdmin = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnAddProdAdmin = new javax.swing.JButton();
        btnModProdAdmin = new javax.swing.JButton();
        btnDelProdAdmin = new javax.swing.JButton();
        btnInicio2 = new javax.swing.JButton();
        txtDescProdAdmin = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txtPropWaiAdmin = new javax.swing.JTextField();
        btnModWaiAdmin = new javax.swing.JButton();
        lblID = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblName = new javax.swing.JLabel();
        btnDelWaiAdmin = new javax.swing.JButton();
        lblDateNac = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        txtIdWaiAdmin = new javax.swing.JTextField();
        txtNameWaiAdmin = new javax.swing.JTextField();
        btnAddWaiAdmin = new javax.swing.JButton();
        txtYearNacWaiAdmin = new javax.swing.JTextField();
        lblPropina = new javax.swing.JLabel();
        lblSalary = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        txtMonthNacWaiAdmin = new javax.swing.JTextField();
        txtDayNacWaiAdmin = new javax.swing.JTextField();
        lblDateIng = new javax.swing.JLabel();
        txtUserWaiAdmin = new javax.swing.JTextField();
        txtSalaryWaiAdmin = new javax.swing.JTextField();
        txtPassWaiAdmin = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaWaiterAdmin = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtYearIngWaiAdmin = new javax.swing.JTextField();
        txtMonthIngWaiAdmin = new javax.swing.JTextField();
        txtDayIngWaiAdmin = new javax.swing.JTextField();
        btnInicio1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TablaProductAdmin.setModel(new javax.swing.table.DefaultTableModel(
            Product.to2DObjectAllProductList(),
            new String [] {
                "ID", "Nombre", "Tipo", "Descripcion", "Precio", "Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TablaProductAdmin);
        if (TablaProductAdmin.getColumnModel().getColumnCount() > 0) {
            TablaProductAdmin.getColumnModel().getColumn(0).setResizable(false);
            TablaProductAdmin.getColumnModel().getColumn(1).setResizable(false);
            TablaProductAdmin.getColumnModel().getColumn(2).setResizable(false);
            TablaProductAdmin.getColumnModel().getColumn(3).setResizable(false);
            TablaProductAdmin.getColumnModel().getColumn(4).setResizable(false);
            TablaProductAdmin.getColumnModel().getColumn(5).setResizable(false);
        }
        TablaProductAdmin.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);

        jLabel1.setText("Nombre");

        jLabel2.setText("Tipo");

        jLabel3.setText("Descripcion");

        jLabel4.setText("Precio");

        jLabel5.setText("Stock");

        btnAddProdAdmin.setBackground(new java.awt.Color(204, 255, 204));
        btnAddProdAdmin.setText("Agregar");
        btnAddProdAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProdAdminActionPerformed(evt);
            }
        });

        btnModProdAdmin.setBackground(new java.awt.Color(255, 255, 204));
        btnModProdAdmin.setText("Modificar");
        btnModProdAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModProdAdminActionPerformed(evt);
            }
        });

        btnDelProdAdmin.setBackground(new java.awt.Color(255, 204, 204));
        btnDelProdAdmin.setText("Eliminar");
        btnDelProdAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelProdAdminActionPerformed(evt);
            }
        });

        btnInicio2.setBackground(new java.awt.Color(153, 153, 153));
        btnInicio2.setText("Atr??s");
        btnInicio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicio2ActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("1. Plato - 2. Bebida - 3. Postre");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36))
                            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNameProdAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addComponent(txtStockProdAdmin)
                            .addComponent(txtPriceProdAdmin)
                            .addComponent(txtDescProdAdmin)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTypeProdAdmin, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(btnAddProdAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnModProdAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelProdAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnInicio2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNameProdAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTypeProdAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtDescProdAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPriceProdAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtStockProdAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(btnAddProdAdmin)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModProdAdmin)
                    .addComponent(btnDelProdAdmin))
                .addGap(26, 26, 26)
                .addComponent(btnInicio2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        jTabbedPaneProdMes.addTab("Productos", jPanel1);

        btnModWaiAdmin.setBackground(new java.awt.Color(255, 255, 204));
        btnModWaiAdmin.setText("Modificar");
        btnModWaiAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModWaiAdminActionPerformed(evt);
            }
        });

        lblID.setText("Identificacion");

        lblName.setText("Nombre");

        btnDelWaiAdmin.setBackground(new java.awt.Color(255, 204, 204));
        btnDelWaiAdmin.setText("Eliminar");
        btnDelWaiAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelProdAdmin1ActionPerformed(evt);
            }
        });

        lblDateNac.setText("Fecha de nacimiento");

        lblUser.setText("Usuario");

        btnAddWaiAdmin.setBackground(new java.awt.Color(204, 255, 204));
        btnAddWaiAdmin.setText("Agregar");
        btnAddWaiAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddWaiAdminActionPerformed(evt);
            }
        });

        lblPropina.setText("Propina");

        lblSalary.setText("Salario");

        lblPass.setText("Contrase??a");

        jLabel9.setText("/");

        jLabel15.setText("/");

        tablaWaiterAdmin.setModel(new javax.swing.table.DefaultTableModel(
            Waiter.to2DObjectAllWaiterList(),
            new String [] {
                "ID", "Nombre", "Nacimiento", "Ingreso", "Salario", "Propina", "Usuario", "Contrase??a"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false, true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tablaWaiterAdmin);
        if (tablaWaiterAdmin.getColumnModel().getColumnCount() > 0) {
            tablaWaiterAdmin.getColumnModel().getColumn(0).setResizable(false);
            tablaWaiterAdmin.getColumnModel().getColumn(1).setResizable(false);
            tablaWaiterAdmin.getColumnModel().getColumn(2).setResizable(false);
            tablaWaiterAdmin.getColumnModel().getColumn(3).setResizable(false);
            tablaWaiterAdmin.getColumnModel().getColumn(4).setResizable(false);
            tablaWaiterAdmin.getColumnModel().getColumn(5).setResizable(false);
            tablaWaiterAdmin.getColumnModel().getColumn(6).setResizable(false);
            tablaWaiterAdmin.getColumnModel().getColumn(7).setResizable(false);
        }
        tablaWaiterAdmin.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);

        jLabel10.setText("/");

        jLabel18.setText("/");

        btnInicio1.setBackground(new java.awt.Color(153, 153, 153));
        btnInicio1.setText("Atr??s");
        btnInicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicio1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(lblDateIng))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtDayIngWaiAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMonthIngWaiAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtYearIngWaiAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtDayNacWaiAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMonthNacWaiAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtYearNacWaiAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblName)
                                    .addComponent(lblPass)
                                    .addComponent(lblUser)
                                    .addComponent(lblPropina))
                                .addGap(27, 27, 27))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDateNac)
                            .addComponent(txtUserWaiAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(txtPropWaiAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(txtSalaryWaiAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(txtPassWaiAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(txtNameWaiAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(txtIdWaiAdmin)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnModWaiAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelWaiAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                            .addComponent(btnAddWaiAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnInicio1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdWaiAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName)
                            .addComponent(txtNameWaiAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblDateNac)
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtYearNacWaiAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMonthNacWaiAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDayNacWaiAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addComponent(lblDateIng)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtYearIngWaiAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMonthIngWaiAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDayIngWaiAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPropina)
                            .addComponent(txtPropWaiAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSalary)
                            .addComponent(txtSalaryWaiAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUser)
                            .addComponent(txtUserWaiAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPass)
                            .addComponent(txtPassWaiAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAddWaiAdmin)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDelWaiAdmin)
                            .addComponent(btnModWaiAdmin))
                        .addGap(18, 18, 18)
                        .addComponent(btnInicio1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPaneProdMes.addTab("Meseros", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneProdMes)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneProdMes)
                .addContainerGap())
        );

        //add effects to botons

        btnAddProdAdmin.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent me) {
             // Acci??n a realizar cuando se pasa el mouse sobre el bot??n
             btnAddProdAdmin.setBackground(Color.green);
      
            }public void mouseExited(MouseEvent me) {
             // Acci??n a realizar cuando se el mouse ya no se encuentra sobre el bot??n
      
             btnAddProdAdmin.setBackground(new java.awt.Color(204, 255, 204));
            }
          });


        btnModProdAdmin.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent me) {
             // Acci??n a realizar cuando se pasa el mouse sobre el bot??n
             btnModProdAdmin.setBackground(Color.orange);
      
            }public void mouseExited(MouseEvent me) {
             // Acci??n a realizar cuando se el mouse ya no se encuentra sobre el bot??n
      
             btnModProdAdmin.setBackground(new java.awt.Color(255, 255, 204));
            }
          });


        btnDelProdAdmin.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent me) {
             // Acci??n a realizar cuando se pasa el mouse sobre el bot??n
            btnDelProdAdmin.setBackground(Color.red);
      
            }public void mouseExited(MouseEvent me) {
             // Acci??n a realizar cuando se el mouse ya no se encuentra sobre el bot??n
      
            btnDelProdAdmin.setBackground(new java.awt.Color(255, 204, 204));
            }
          });

          btnAddWaiAdmin.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent me) {
             // Acci??n a realizar cuando se pasa el mouse sobre el bot??n
             btnAddWaiAdmin.setBackground(Color.green);
      
            }public void mouseExited(MouseEvent me) {
             // Acci??n a realizar cuando se el mouse ya no se encuentra sobre el bot??n
      
             btnAddWaiAdmin.setBackground(new java.awt.Color(204, 255, 204));
            }
          });


        btnModWaiAdmin.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent me) {
             // Acci??n a realizar cuando se pasa el mouse sobre el bot??n
             btnModWaiAdmin.setBackground(Color.orange);
      
            }public void mouseExited(MouseEvent me) {
             // Acci??n a realizar cuando se el mouse ya no se encuentra sobre el bot??n
      
             btnModWaiAdmin.setBackground(new java.awt.Color(255, 255, 204));
            }
          });


        btnDelWaiAdmin.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent me) {
             // Acci??n a realizar cuando se pasa el mouse sobre el bot??n
            btnDelWaiAdmin.setBackground(Color.red);
      
            }public void mouseExited(MouseEvent me) {
             // Acci??n a realizar cuando se el mouse ya no se encuentra sobre el bot??n
      
            btnDelWaiAdmin.setBackground(new java.awt.Color(255, 204, 204));
            }
          });

          

        pack();
    }// </editor-fold>                                                 

    private void btnInicio1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        setVisible(false);
		iniWindow initWindow = new iniWindow();
		initWindow.setVisible(true);
    }                                          

    private void btnAddProdAdminActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // Agregar producto desde el panel administrativo
        String 
            nombre = txtNameProdAdmin.getText(), 
            tipo = txtTypeProdAdmin.getText(), 
            descripcion = txtDescProdAdmin.getText(), 
            precio = txtPriceProdAdmin.getText(), 
            stock = txtStockProdAdmin.getText();

        Boolean success; Product createdProduct = null;
        try {
            Admin admin = loggedAdmin;

            int 
                int_tipo = Integer.parseInt(tipo),
                int_stock = Integer.parseInt(stock);
            double double_precio = Double.parseDouble(precio);
                
            if(int_tipo < 1 || int_tipo > 3 || double_precio < 0) {
                throw new RuntimeException("Error"); // Error ocasionado intencionalmente
            }
            
            createdProduct = admin.createProduct(nombre, int_tipo, descripcion, double_precio, Integer.parseInt(stock));
            success = true;
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error, por favor comprueba los campos");
            success = false;
        }

        if(success) {
            JOptionPane.showMessageDialog(this, "Muy bien, se ha creado el producto "+createdProduct.name+" con ID: "+createdProduct.getID());
            this.reloadWindow();
        }
    }                                               

    private void btnModProdAdminActionPerformed(java.awt.event.ActionEvent evt) {                                                
        int 
            row = TablaProductAdmin.getSelectedRow(),
            ID = Integer.parseInt(String.valueOf(TablaProductAdmin.getValueAt(row, 0)));
        
        Product product = Product.getProductElementByID(ID);

        String  descripcion = "";
        int precio = 0, stock = 0;
        boolean success = true;
        success = true;
        
        try {
            // nombre = String.valueOf(TablaProductAdmin.getValueAt(row, 0));                           //NOT ALLOWED TO EDIT
            // tipo = Integer.parseInt(String.valueOf(TablaProductAdmin.getValueAt(row, 1)));           //NOT ALLOWED TO EDIT
            
            descripcion = String.valueOf(TablaProductAdmin.getValueAt(row, 3));
            precio = (int) Double.parseDouble(String.valueOf(TablaProductAdmin.getValueAt(row, 4)));
            stock = Integer.parseInt(String.valueOf(TablaProductAdmin.getValueAt(row, 5)));

            this.loggedAdmin.changeDesc(product, descripcion);
            this.loggedAdmin.changePrice(product, precio);
            this.loggedAdmin.changeStock(product, stock);
            
            success = true;
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error, por favor comprueba los campos de la tabla");
            success = false;
        }
        if(success) {
            String response = String.format("Muy bien, ha modificado el producto %s (ID: %d)", product.name, product.getID());
            JOptionPane.showMessageDialog(this, response);
            this.reloadWindow();
        }
    }                                               

    private void btnDelProdAdminActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // Elminar producto desde el panel administrativo
        int 
            row = TablaProductAdmin.getSelectedRow(),
            ID = Integer.parseInt(String.valueOf(TablaProductAdmin.getValueAt(row, 0)));
        
        Product product = Product.getProductElementByID(ID);
        product.softDelete();

        String response = String.format("Muy bien, el producto %s (%d) fue eliminado", product.name, product.getID());
        JOptionPane.showMessageDialog(this, response);
        this.reloadWindow();
        
    }                                               

    private void btnInicio2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        setVisible(false);
		iniWindow initWindow = new iniWindow();
		initWindow.setVisible(true);
    }                                          


    private void btnAddWaiAdminActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // Agregar producto desde el panel administrativo
        String 
            identificacion = txtIdWaiAdmin.getText(), 
            nombre = txtNameWaiAdmin.getText(), 
            fecha_nacimiento_dia = txtDayNacWaiAdmin.getText(), 
            fecha_nacimiento_mes = txtMonthNacWaiAdmin.getText(), 
            fecha_nacimiento_anio = txtYearNacWaiAdmin.getText(), 
            fecha_ingreso_dia = txtDayIngWaiAdmin.getText(), 
            fecha_ingreso_mes = txtMonthIngWaiAdmin.getText(), 
            fecha_ingreso_anio = txtYearIngWaiAdmin.getText(), 
            propina = txtPropWaiAdmin.getText(),
            salario = txtSalaryWaiAdmin.getText(), 
            usuario = txtUserWaiAdmin.getText(), 
            contrasenia = txtPassWaiAdmin.getText();

        Boolean success; Waiter created = null;
        
        try {
            int 
                int_id = Integer.parseInt(identificacion),
                int_fn_dia = Integer.parseInt(fecha_nacimiento_dia),
                int_fn_mes = Integer.parseInt(fecha_nacimiento_mes),
                int_fn_anio = Integer.parseInt(fecha_nacimiento_anio),
                int_ingr_dia = Integer.parseInt(fecha_ingreso_dia),
                int_ingr_mes = Integer.parseInt(fecha_ingreso_mes),
                int_ingr_anio = Integer.parseInt(fecha_ingreso_anio),
                int_propia = Integer.parseInt(propina),
                int_salario = Integer.parseInt(salario);

            Admin admin = loggedAdmin;
            Date_ex birth = new Date_ex(int_fn_anio, int_fn_mes, int_fn_dia);
            Date_ex join = new Date_ex(int_ingr_anio, int_ingr_mes, int_ingr_dia);

            created = admin.createWaiter(nombre, int_id, birth, join, int_salario, usuario, contrasenia);                
            
            success = true;
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error, por favor comprueba los campos");
            success = false;
        }

        if(success) {
            String response = String.format("Se ha creado al empleado %s (ID: %d) con salario %f", created.fullName, created.getID(), created.getSalary());
            JOptionPane.showMessageDialog(this, response);
            this.reloadWindow();
        }
    }                                              

    private void btnModWaiAdminActionPerformed(java.awt.event.ActionEvent evt) {
        // Modificar waiter
        int 
            row = tablaWaiterAdmin.getSelectedRow(),
            ID = Integer.parseInt(String.valueOf(tablaWaiterAdmin.getValueAt(row, 0)));        
            
        Waiter waiter = Waiter.getWaiterElementByID(ID);
        boolean success; String nombre = ""; double salario = 0;
        try {
            nombre = String.valueOf(tablaWaiterAdmin.getValueAt(row, 1));
            salario = Double.parseDouble(String.valueOf(tablaWaiterAdmin.getValueAt(row, 4)));
            this.loggedAdmin.changeNameWaiter(waiter, nombre);
            this.loggedAdmin.changeSalaryWaiter(waiter, salario);
            success = true;
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error, por favor comprueba los campos de la tabla");
            success = false;
        }
        if(success) {
            String response = String.format("Muy bien, ha modificado el empleado %s (ID: %d)", waiter.fullName, waiter.getID());
            JOptionPane.showMessageDialog(this, response);
            this.reloadWindow();
        }
    }                                              

    private void btnDelProdAdmin1ActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // Eliminar Empleado
        int 
            row = tablaWaiterAdmin.getSelectedRow(),
            ID = Integer.parseInt(String.valueOf(tablaWaiterAdmin.getValueAt(row, 0)));        
            
        Waiter waiter = Waiter.getWaiterElementByID(ID);
        waiter.softDelete();
        String response = String.format("Muy bien, ha eliminado el empleado %s (ID: %d)", waiter.fullName, waiter.getID());
        JOptionPane.showMessageDialog(this, response);
        this.reloadWindow();
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
            java.util.logging.Logger.getLogger(adminWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private JTable TablaProductAdmin;
    private JButton btnAddProdAdmin;
    private JButton btnAddWaiAdmin;
    private JButton btnDelProdAdmin;
    private JButton btnDelWaiAdmin;
    private JButton btnInicio1;
    private JButton btnInicio2;
    private JButton btnModProdAdmin;
    private JButton btnModWaiAdmin;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel15;
    private JLabel jLabel18;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane5;
    private JSeparator jSeparator1;
    private JSeparator jSeparator2;
    private JTabbedPane jTabbedPaneProdMes;
    private JLabel lblDateIng;
    private JLabel lblDateNac;
    private JLabel lblID;
    private JLabel lblName;
    private JLabel lblPass;
    private JLabel lblPropina;
    private JLabel lblSalary;
    private JLabel lblUser;
    private JTable tablaWaiterAdmin;
    private JTextField txtDayIngWaiAdmin;
    private JTextField txtDayNacWaiAdmin;
    private JTextField txtDescProdAdmin;
    private JTextField txtIdWaiAdmin;
    private JTextField txtMonthIngWaiAdmin;
    private JTextField txtMonthNacWaiAdmin;
    private JTextField txtNameProdAdmin;
    private JTextField txtNameWaiAdmin;
    private JTextField txtPassWaiAdmin;
    private JTextField txtPriceProdAdmin;
    private JTextField txtPropWaiAdmin;
    private JTextField txtSalaryWaiAdmin;
    private JTextField txtStockProdAdmin;
    private JTextField txtTypeProdAdmin;
    private JTextField txtUserWaiAdmin;
    private JTextField txtYearIngWaiAdmin;
    private JTextField txtYearNacWaiAdmin;
    private JLabel jLabel6;
    private Admin loggedAdmin;
    // End of variables declaration                 
    
    public static adminWindow showWindow (Admin loggedAdmin) {
        adminWindow admW = new adminWindow();
        admW.setLogged(loggedAdmin);
        admW.setVisible(true);
        return admW;
    }

    public void reloadWindow () {
        this.setVisible(false);
        adminWindow.showWindow(this.loggedAdmin);
    }

    public void setLogged(Admin adminLogged) {
        this.loggedAdmin = adminLogged;
        this.setTitle("Administrador "+this.loggedAdmin.fullName);
    }               
}
