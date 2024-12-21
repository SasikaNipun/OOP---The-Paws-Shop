
package View;

import Controller.manageCashierDetails_Ctrl_;
import Controller.manageProductDetails_Ctrl_;
import Controller.manage_Ctrl_;
import Controller.searchProduct_Ctrl_;
import javax.swing.JPanel;

public class mainFunctioPage extends javax.swing.JFrame {
    
    manageProductDetails_Ctrl_ T1 = new manageProductDetails_Ctrl_();
    manageCashierDetails_Ctrl_ T2 = new manageCashierDetails_Ctrl_();
    
    searchProduct_Ctrl_ SP1 = new searchProduct_Ctrl_();
    
    public mainFunctioPage() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        manageProductPage_M_ = new javax.swing.JPanel();
        leftSideLogo5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        cmdViewAllProduct_1 = new javax.swing.JButton();
        cmdAddNewProduct_1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtProductID_MPP_M_ = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtProductName_MPP_M_ = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtProductCategory_MPP_M_ = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        cmdADD_ManageProductPage_M_ = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMngProductPage_M_ = new javax.swing.JTable();
        txtSearch_MPP_M_ = new javax.swing.JTextField();
        cmdSearch_MPP_M = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtProductPrice_MPP_M_ = new javax.swing.JTextField();
        cmdClear_ManageProductPage_M_ = new javax.swing.JButton();
        manageCashierPage_M_ = new javax.swing.JPanel();
        leftSideLogo4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        cmdViewAllProduct_ = new javax.swing.JButton();
        cmdAddNewProduct_ = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtFirstName_ = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNIC_ = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtLastName_ = new javax.swing.JTextField();
        cmdViewAllCashier_MngCashierPage_ = new javax.swing.JButton();
        cmdADD_MngCashierPage_ = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMngCashierPage_M_ = new javax.swing.JTable();
        txtSearch_MngCashierPage_ = new javax.swing.JTextField();
        cmdSearch_MngCashierPage_ = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        combboxGender_ = new javax.swing.JComboBox<>();
        txtDOB_ = new javax.swing.JTextField();
        txtUsername_ = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtPassword_ = new javax.swing.JTextField();
        cmdClear_MngCashierPage_ = new javax.swing.JButton();
        manageProductPage_C_ = new javax.swing.JPanel();
        leftSideLogo6 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        cmdLogOut_MPP_C_ = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel26 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(102, 255, 255));
        jPanel3.setLayout(new java.awt.CardLayout());

        manageProductPage_M_.setBackground(new java.awt.Color(51, 255, 153));

        leftSideLogo5.setBackground(new java.awt.Color(255, 102, 102));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/User.png"))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Welcome");

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        cmdViewAllProduct_1.setBackground(new java.awt.Color(0, 0, 0));
        cmdViewAllProduct_1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        cmdViewAllProduct_1.setForeground(new java.awt.Color(255, 255, 255));
        cmdViewAllProduct_1.setText("Manage Product");
        cmdViewAllProduct_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdViewAllProduct_1ActionPerformed(evt);
            }
        });

        cmdAddNewProduct_1.setBackground(new java.awt.Color(0, 0, 0));
        cmdAddNewProduct_1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        cmdAddNewProduct_1.setForeground(new java.awt.Color(255, 255, 255));
        cmdAddNewProduct_1.setText("Manage Cashier");
        cmdAddNewProduct_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAddNewProduct_1ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Log Out");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftSideLogo5Layout = new javax.swing.GroupLayout(leftSideLogo5);
        leftSideLogo5.setLayout(leftSideLogo5Layout);
        leftSideLogo5Layout.setHorizontalGroup(
            leftSideLogo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftSideLogo5Layout.createSequentialGroup()
                .addGroup(leftSideLogo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftSideLogo5Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel15))
                    .addGroup(leftSideLogo5Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(leftSideLogo5Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(cmdViewAllProduct_1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(leftSideLogo5Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(cmdAddNewProduct_1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftSideLogo5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftSideLogo5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        leftSideLogo5Layout.setVerticalGroup(
            leftSideLogo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftSideLogo5Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel15)
                .addGap(6, 6, 6)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(cmdViewAllProduct_1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmdAddNewProduct_1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.CardLayout());

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Manage Product Page");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        txtProductID_MPP_M_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductID_MPP_M_ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Product ID");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Product Name");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Product Category");

        jButton6.setBackground(new java.awt.Color(102, 102, 102));
        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("View All Product");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        cmdADD_ManageProductPage_M_.setBackground(new java.awt.Color(102, 102, 102));
        cmdADD_ManageProductPage_M_.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cmdADD_ManageProductPage_M_.setForeground(new java.awt.Color(255, 255, 255));
        cmdADD_ManageProductPage_M_.setText("ADD");
        cmdADD_ManageProductPage_M_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdADD_ManageProductPage_M_ActionPerformed(evt);
            }
        });

        tblMngProductPage_M_.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product ID", "Product Name", "Product Category", "Product Price"
            }
        ));
        jScrollPane2.setViewportView(tblMngProductPage_M_);

        txtSearch_MPP_M_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearch_MPP_M_ActionPerformed(evt);
            }
        });

        cmdSearch_MPP_M.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cmdSearch_MPP_M.setText("Search");
        cmdSearch_MPP_M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSearch_MPP_MActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Product Price");

        cmdClear_ManageProductPage_M_.setBackground(new java.awt.Color(102, 102, 102));
        cmdClear_ManageProductPage_M_.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cmdClear_ManageProductPage_M_.setForeground(new java.awt.Color(255, 255, 255));
        cmdClear_ManageProductPage_M_.setText("Clear");
        cmdClear_ManageProductPage_M_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdClear_ManageProductPage_M_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtSearch_MPP_M_, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdSearch_MPP_M, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(txtProductCategory_MPP_M_, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txtProductName_MPP_M_, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtProductID_MPP_M_, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmdADD_ManageProductPage_M_, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(txtProductPrice_MPP_M_, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmdClear_ManageProductPage_M_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(87, 87, 87))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtProductID_MPP_M_)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtProductName_MPP_M_)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtProductCategory_MPP_M_)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdClear_ManageProductPage_M_, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProductPrice_MPP_M_, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdADD_ManageProductPage_M_, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch_MPP_M_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdSearch_MPP_M, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel5, "card2");

        javax.swing.GroupLayout manageProductPage_M_Layout = new javax.swing.GroupLayout(manageProductPage_M_);
        manageProductPage_M_.setLayout(manageProductPage_M_Layout);
        manageProductPage_M_Layout.setHorizontalGroup(
            manageProductPage_M_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageProductPage_M_Layout.createSequentialGroup()
                .addComponent(leftSideLogo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        manageProductPage_M_Layout.setVerticalGroup(
            manageProductPage_M_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leftSideLogo5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageProductPage_M_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(manageProductPage_M_, "card2");

        manageCashierPage_M_.setBackground(new java.awt.Color(51, 255, 153));

        leftSideLogo4.setBackground(new java.awt.Color(255, 102, 102));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/User.png"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Welcome");

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        cmdViewAllProduct_.setBackground(new java.awt.Color(0, 0, 0));
        cmdViewAllProduct_.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        cmdViewAllProduct_.setForeground(new java.awt.Color(255, 255, 255));
        cmdViewAllProduct_.setText("Manage Product");
        cmdViewAllProduct_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdViewAllProduct_ActionPerformed(evt);
            }
        });

        cmdAddNewProduct_.setBackground(new java.awt.Color(0, 0, 0));
        cmdAddNewProduct_.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        cmdAddNewProduct_.setForeground(new java.awt.Color(255, 255, 255));
        cmdAddNewProduct_.setText("Manage Cashier");
        cmdAddNewProduct_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAddNewProduct_ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Log Out");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftSideLogo4Layout = new javax.swing.GroupLayout(leftSideLogo4);
        leftSideLogo4.setLayout(leftSideLogo4Layout);
        leftSideLogo4Layout.setHorizontalGroup(
            leftSideLogo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftSideLogo4Layout.createSequentialGroup()
                .addGroup(leftSideLogo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftSideLogo4Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel13))
                    .addGroup(leftSideLogo4Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(leftSideLogo4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(cmdViewAllProduct_, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(leftSideLogo4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(cmdAddNewProduct_, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftSideLogo4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftSideLogo4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        leftSideLogo4Layout.setVerticalGroup(
            leftSideLogo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftSideLogo4Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel13)
                .addGap(6, 6, 6)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(cmdViewAllProduct_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmdAddNewProduct_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.CardLayout());

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Cashier Page");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        txtFirstName_.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtFirstName_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstName_ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("First Name");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("NIC");

        txtNIC_.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Date Of Birth");

        txtLastName_.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        cmdViewAllCashier_MngCashierPage_.setBackground(new java.awt.Color(102, 102, 102));
        cmdViewAllCashier_MngCashierPage_.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cmdViewAllCashier_MngCashierPage_.setForeground(new java.awt.Color(255, 255, 255));
        cmdViewAllCashier_MngCashierPage_.setText("View All Cashier");
        cmdViewAllCashier_MngCashierPage_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdViewAllCashier_MngCashierPage_ActionPerformed(evt);
            }
        });

        cmdADD_MngCashierPage_.setBackground(new java.awt.Color(102, 102, 102));
        cmdADD_MngCashierPage_.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cmdADD_MngCashierPage_.setForeground(new java.awt.Color(255, 255, 255));
        cmdADD_MngCashierPage_.setText("ADD");
        cmdADD_MngCashierPage_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdADD_MngCashierPage_ActionPerformed(evt);
            }
        });

        tblMngCashierPage_M_.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "NIC", "DOB", "Gender"
            }
        ));
        jScrollPane1.setViewportView(tblMngCashierPage_M_);

        txtSearch_MngCashierPage_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearch_MngCashierPage_ActionPerformed(evt);
            }
        });

        cmdSearch_MngCashierPage_.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cmdSearch_MngCashierPage_.setText("Search");
        cmdSearch_MngCashierPage_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSearch_MngCashierPage_ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Gender");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Last Name");

        combboxGender_.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        combboxGender_.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Male", "Female" }));

        txtDOB_.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        txtUsername_.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Username");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Password");

        txtPassword_.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        cmdClear_MngCashierPage_.setBackground(new java.awt.Color(102, 102, 102));
        cmdClear_MngCashierPage_.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cmdClear_MngCashierPage_.setForeground(new java.awt.Color(255, 255, 255));
        cmdClear_MngCashierPage_.setText("Clear");
        cmdClear_MngCashierPage_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdClear_MngCashierPage_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 914, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(txtSearch_MngCashierPage_, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdSearch_MngCashierPage_, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 914, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cmdViewAllCashier_MngCashierPage_, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(148, 148, 148)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtFirstName_, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel18))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtNIC_, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(combboxGender_, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtUsername_, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(169, 169, 169)
                                    .addComponent(jLabel19)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtPassword_, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtLastName_, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtDOB_, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(224, 224, 224)
                                    .addComponent(cmdADD_MngCashierPage_, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cmdClear_MngCashierPage_, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLastName_, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFirstName_, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNIC_, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDOB_, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combboxGender_, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdADD_MngCashierPage_, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername_, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdClear_MngCashierPage_, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdViewAllCashier_MngCashierPage_, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword_, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdSearch_MngCashierPage_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch_MngCashierPage_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel4, "card2");

        javax.swing.GroupLayout manageCashierPage_M_Layout = new javax.swing.GroupLayout(manageCashierPage_M_);
        manageCashierPage_M_.setLayout(manageCashierPage_M_Layout);
        manageCashierPage_M_Layout.setHorizontalGroup(
            manageCashierPage_M_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageCashierPage_M_Layout.createSequentialGroup()
                .addComponent(leftSideLogo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        manageCashierPage_M_Layout.setVerticalGroup(
            manageCashierPage_M_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leftSideLogo4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageCashierPage_M_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(manageCashierPage_M_, "card2");

        manageProductPage_C_.setBackground(new java.awt.Color(51, 255, 153));

        leftSideLogo6.setBackground(new java.awt.Color(255, 102, 102));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/User.png"))); // NOI18N

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Welcome");

        cmdLogOut_MPP_C_.setBackground(new java.awt.Color(0, 0, 0));
        cmdLogOut_MPP_C_.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cmdLogOut_MPP_C_.setForeground(new java.awt.Color(255, 255, 255));
        cmdLogOut_MPP_C_.setText("Log Out");
        cmdLogOut_MPP_C_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLogOut_MPP_C_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftSideLogo6Layout = new javax.swing.GroupLayout(leftSideLogo6);
        leftSideLogo6.setLayout(leftSideLogo6Layout);
        leftSideLogo6Layout.setHorizontalGroup(
            leftSideLogo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftSideLogo6Layout.createSequentialGroup()
                .addGroup(leftSideLogo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(leftSideLogo6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cmdLogOut_MPP_C_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, leftSideLogo6Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(leftSideLogo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 75, Short.MAX_VALUE)))
                .addContainerGap())
        );
        leftSideLogo6Layout.setVerticalGroup(
            leftSideLogo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftSideLogo6Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel20)
                .addGap(6, 6, 6)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmdLogOut_MPP_C_, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.CardLayout());

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Manage Product Page");
        jLabel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Product ID");

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Product Name");

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Product Category");

        jButton10.setBackground(new java.awt.Color(102, 102, 102));
        jButton10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("View All Product");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(102, 102, 102));
        jButton11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("ADD");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product ID", "Product Name", "Product Category", "Product Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Search by Category");

        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton12.setText("Search");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Product Price");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addContainerGap())
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jButton10)
                        .addGap(87, 87, 87))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField13)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField14)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField15)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField17)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.add(jPanel10, "card2");

        javax.swing.GroupLayout manageProductPage_C_Layout = new javax.swing.GroupLayout(manageProductPage_C_);
        manageProductPage_C_.setLayout(manageProductPage_C_Layout);
        manageProductPage_C_Layout.setHorizontalGroup(
            manageProductPage_C_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageProductPage_C_Layout.createSequentialGroup()
                .addComponent(leftSideLogo6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        manageProductPage_C_Layout.setVerticalGroup(
            manageProductPage_C_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leftSideLogo6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageProductPage_C_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(manageProductPage_C_, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdViewAllProduct_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdViewAllProduct_ActionPerformed
        manageCashierPage_M_.setVisible(false);
        manageProductPage_M_.setVisible(true);
    }//GEN-LAST:event_cmdViewAllProduct_ActionPerformed

    private void cmdAddNewProduct_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAddNewProduct_ActionPerformed
        manageCashierPage_M_.setVisible(true);
        manageProductPage_M_.setVisible(false);
    }//GEN-LAST:event_cmdAddNewProduct_ActionPerformed

    private void txtFirstName_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstName_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstName_ActionPerformed

    private void cmdViewAllCashier_MngCashierPage_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdViewAllCashier_MngCashierPage_ActionPerformed
        T2.manageTable_(tblMngCashierPage_M_);
        
    }//GEN-LAST:event_cmdViewAllCashier_MngCashierPage_ActionPerformed

    private void cmdADD_MngCashierPage_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdADD_MngCashierPage_ActionPerformed
        String FirstName = txtFirstName_.getText();
        String LastName = txtLastName_.getText();
        String NIC = txtNIC_.getText();
        String DOB = txtDOB_.getText();
        String Gender = (String) combboxGender_.getSelectedItem();
        String Username = txtUsername_.getText();
        String Password = txtPassword_.getText();
        
        manage_Ctrl_ mngProduct = new manage_Ctrl_();
           mngProduct.manage(FirstName, LastName, NIC, DOB, Gender, Username, Password);
           
        T2.manageTable_(tblMngCashierPage_M_);
    }//GEN-LAST:event_cmdADD_MngCashierPage_ActionPerformed

    private void txtSearch_MngCashierPage_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearch_MngCashierPage_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearch_MngCashierPage_ActionPerformed

    private void cmdSearch_MngCashierPage_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSearch_MngCashierPage_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdSearch_MngCashierPage_ActionPerformed

    private void cmdViewAllProduct_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdViewAllProduct_1ActionPerformed
        manageCashierPage_M_.setVisible(false);
        manageProductPage_M_.setVisible(true);
    }//GEN-LAST:event_cmdViewAllProduct_1ActionPerformed

    private void cmdAddNewProduct_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAddNewProduct_1ActionPerformed
        manageCashierPage_M_.setVisible(true);
        manageProductPage_M_.setVisible(false);
    }//GEN-LAST:event_cmdAddNewProduct_1ActionPerformed

    private void txtProductID_MPP_M_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductID_MPP_M_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductID_MPP_M_ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        T1.manageTable_(tblMngProductPage_M_);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void cmdADD_ManageProductPage_M_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdADD_ManageProductPage_M_ActionPerformed
        String ProductID = txtProductID_MPP_M_.getText();
        String ProductName = txtProductName_MPP_M_.getText();
        String ProductCategory = txtProductCategory_MPP_M_.getText();
        String ProductPrice = txtProductPrice_MPP_M_.getText();
        
        manage_Ctrl_ mngProduct = new manage_Ctrl_();
           mngProduct.manage(ProductID, ProductName, ProductCategory, ProductPrice);
           
        T1.manageTable_(tblMngProductPage_M_);

    }//GEN-LAST:event_cmdADD_ManageProductPage_M_ActionPerformed

    private void txtSearch_MPP_M_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearch_MPP_M_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearch_MPP_M_ActionPerformed

    private void cmdSearch_MPP_MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSearch_MPP_MActionPerformed
        String SearchProduct1 = this.txtSearch_MPP_M_.getText();
        this.SP1.searchProduct(SearchProduct1, this.tblMngProductPage_M_);
        
    }//GEN-LAST:event_cmdSearch_MPP_MActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void cmdClear_ManageProductPage_M_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdClear_ManageProductPage_M_ActionPerformed
        txtProductID_MPP_M_.setText("");
        txtProductName_MPP_M_.setText("");
        txtProductCategory_MPP_M_.setText("");
        txtProductPrice_MPP_M_.setText("");
        
    }//GEN-LAST:event_cmdClear_ManageProductPage_M_ActionPerformed

    private void cmdClear_MngCashierPage_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdClear_MngCashierPage_ActionPerformed
        txtFirstName_.setText("");
        txtLastName_.setText("");
        txtNIC_.setText("");
        txtDOB_.setText("");
        combboxGender_.setSelectedIndex(0);
        txtUsername_.setText("");
        txtPassword_.setText("");
    }//GEN-LAST:event_cmdClear_MngCashierPage_ActionPerformed

    private void cmdLogOut_MPP_C_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLogOut_MPP_C_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdLogOut_MPP_C_ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        mainLoginPage M2 = new mainLoginPage();
        M2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        mainLoginPage M3 = new mainLoginPage();
        M3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed
    public JPanel getmanageProductPage_C_(){
        return manageProductPage_C_;
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
            java.util.logging.Logger.getLogger(mainFunctioPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFunctioPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFunctioPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFunctioPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFunctioPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdADD_ManageProductPage_M_;
    private javax.swing.JButton cmdADD_MngCashierPage_;
    private javax.swing.JButton cmdAddNewProduct_;
    private javax.swing.JButton cmdAddNewProduct_1;
    private javax.swing.JButton cmdClear_ManageProductPage_M_;
    private javax.swing.JButton cmdClear_MngCashierPage_;
    private javax.swing.JButton cmdLogOut_MPP_C_;
    private javax.swing.JButton cmdSearch_MPP_M;
    private javax.swing.JButton cmdSearch_MngCashierPage_;
    private javax.swing.JButton cmdViewAllCashier_MngCashierPage_;
    private javax.swing.JButton cmdViewAllProduct_;
    private javax.swing.JButton cmdViewAllProduct_1;
    private javax.swing.JComboBox<String> combboxGender_;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JPanel leftSideLogo4;
    private javax.swing.JPanel leftSideLogo5;
    private javax.swing.JPanel leftSideLogo6;
    private javax.swing.JPanel manageCashierPage_M_;
    private javax.swing.JPanel manageProductPage_C_;
    private javax.swing.JPanel manageProductPage_M_;
    private javax.swing.JTable tblMngCashierPage_M_;
    private javax.swing.JTable tblMngProductPage_M_;
    private javax.swing.JTextField txtDOB_;
    private javax.swing.JTextField txtFirstName_;
    private javax.swing.JTextField txtLastName_;
    private javax.swing.JTextField txtNIC_;
    private javax.swing.JTextField txtPassword_;
    private javax.swing.JTextField txtProductCategory_MPP_M_;
    private javax.swing.JTextField txtProductID_MPP_M_;
    private javax.swing.JTextField txtProductName_MPP_M_;
    private javax.swing.JTextField txtProductPrice_MPP_M_;
    private javax.swing.JTextField txtSearch_MPP_M_;
    private javax.swing.JTextField txtSearch_MngCashierPage_;
    private javax.swing.JTextField txtUsername_;
    // End of variables declaration//GEN-END:variables
}
