/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stock;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Niloy
 */
public class Seller extends javax.swing.JFrame {

    /**
     * Creates new form Seller
     */
    public Seller() {
        initComponents();
        Connect();
        DesignTableConnect();
    }
    
    
    Connection con;
    PreparedStatement pst;
    DefaultTableModel def;
    
    
    //Connector function
    public void Connect(){                      
        
        try {
     
        Class.forName("com.mysql.jdbc.Driver");
        
        con = DriverManager.getConnection("jdbc:mysql://localhost/stock_management_sys","root","");
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Seller.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Seller.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    }
    
    
    
    
    
    public void DesignTableConnect(){
            
        int x,i;
    
        try {
            pst=con.prepareStatement("SELECT * FROM seller_information");
              ResultSet result=pst.executeQuery();
              
              ResultSetMetaData data = result.getMetaData();
              
              x=data.getColumnCount();
              
              def=(DefaultTableModel)OutputDesignTable.getModel();
              def.setRowCount(0);
              
              while(result.next()){
        
                Vector v1 = new Vector();
                
                for(i=1; i<=x; i++){
                  
                  v1.add(result.getString("id"));
                  v1.add(result.getString("name"));
                  v1.add(result.getString("mobile"));
                  v1.add(result.getString("email"));
                  v1.add(result.getString("address"));
                  
              }
                
                def.addRow(v1);
        
        }

            
        } catch (SQLException ex) {
            Logger.getLogger(Seller.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sellertxt = new javax.swing.JTextField();
        mobiletxt = new javax.swing.JTextField();
        emailtxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        addresstxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        OutputDesignTable = new javax.swing.JTable();
        SellerADDButton = new javax.swing.JButton();
        SellerEDITButton = new javax.swing.JButton();
        SellerREMOVEButton = new javax.swing.JButton();
        SellerCANCELButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Seller_Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Mobile_Number");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Email");

        sellertxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellertxtActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Address");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(93, 93, 93)
                        .addComponent(addresstxt, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mobiletxt)
                            .addComponent(emailtxt)
                            .addComponent(sellertxt))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(sellertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(mobiletxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(addresstxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Seller_Information");

        OutputDesignTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SellerID", "SellerName", "MobileNumber", "Email", "Address"
            }
        ));
        OutputDesignTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OutputDesignTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(OutputDesignTable);

        SellerADDButton.setText("Add");
        SellerADDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellerADDButtonActionPerformed(evt);
            }
        });

        SellerEDITButton.setText("Edit");
        SellerEDITButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellerEDITButtonActionPerformed(evt);
            }
        });

        SellerREMOVEButton.setText("Remove");
        SellerREMOVEButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellerREMOVEButtonActionPerformed(evt);
            }
        });

        SellerCANCELButton.setText("Cancel");
        SellerCANCELButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellerCANCELButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(SellerADDButton)
                        .addGap(14, 14, 14)
                        .addComponent(SellerEDITButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SellerREMOVEButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SellerCANCELButton)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SellerCANCELButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SellerREMOVEButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SellerEDITButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SellerADDButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SellerADDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellerADDButtonActionPerformed
       
        try {
            
            String sellerName = sellertxt.getText();
            String mobileNumber = mobiletxt.getText();
            String emailAds = emailtxt.getText();
            String address = addresstxt.getText();

            
            pst=con.prepareStatement("INSERT INTO seller_information(name,mobile,email,address)VALUES(?,?,?,?)");
            
            pst.setString(1,sellerName);
            pst.setString(2,mobileNumber);
            pst.setString(3,emailAds);
            pst.setString(4,address);
              
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(this,"Seller Added");
            
            sellertxt.setText("");
            mobiletxt.setText("");
            emailtxt.setText("");
            addresstxt.setText("");
            
            sellertxt.requestFocus();
            
            DesignTableConnect();

               
        } catch (SQLException ex) {
            Logger.getLogger(Seller.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_SellerADDButtonActionPerformed

    private void OutputDesignTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OutputDesignTableMouseClicked
        
        
        def = (DefaultTableModel)OutputDesignTable.getModel();
        
        int sel = OutputDesignTable.getSelectedRow();
        
        int id = Integer.parseInt(def.getValueAt(sel,0).toString());
        
        sellertxt.setText(def.getValueAt(sel,1).toString());
        mobiletxt.setText(def.getValueAt(sel,2).toString());
        emailtxt.setText(def.getValueAt(sel,3).toString());
        addresstxt.setText(def.getValueAt(sel,4).toString());
        
        SellerADDButton.setEnabled(false);
        
    }//GEN-LAST:event_OutputDesignTableMouseClicked

    private void SellerEDITButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellerEDITButtonActionPerformed
       
         def = (DefaultTableModel)OutputDesignTable.getModel();
        
        int sel = OutputDesignTable.getSelectedRow();
        
        int id = Integer.parseInt(def.getValueAt(sel,0).toString());
        
         String sellerName = sellertxt.getText();
         String mobileNumber = mobiletxt.getText();
         String emailAds = emailtxt.getText();
         String address = addresstxt.getText();

            
        try {
            
            pst=con.prepareStatement("UPDATE seller_information SET name=?,mobile=?,email=?,address=? WHERE id=?");
            
            pst.setString(1,sellerName);
            pst.setString(2,mobileNumber);
            pst.setString(3,emailAds);
            pst.setString(4,address);
            pst.setInt(5,id);
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(this,"Seller Information Updated");
            
            sellertxt.setText("");
            mobiletxt.setText("");
            emailtxt.setText("");
            addresstxt.setText("");
            
            sellertxt.requestFocus();
            
            DesignTableConnect();
            
            SellerADDButton.setEnabled(true);

            
            
        } catch (SQLException ex) {
            Logger.getLogger(Seller.class.getName()).log(Level.SEVERE, null, ex);
        }
            
           
        
        
    }//GEN-LAST:event_SellerEDITButtonActionPerformed

    private void SellerREMOVEButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellerREMOVEButtonActionPerformed
        
        
        
         def = (DefaultTableModel)OutputDesignTable.getModel();
        
        int sel = OutputDesignTable.getSelectedRow();
        
        int id = Integer.parseInt(def.getValueAt(sel,0).toString());
        
        
        
      

            
        try {
            
            pst=con.prepareStatement("DELETE FROM seller_information WHERE id=?");
            
           
            pst.setInt(1,id);
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(this,"Seller Information Removed");
            
            sellertxt.setText("");
            mobiletxt.setText("");
            emailtxt.setText("");
            addresstxt.setText("");
            
            sellertxt.requestFocus();
            
            DesignTableConnect();
            
            SellerADDButton.setEnabled(true);

            
            
        } catch (SQLException ex) {
            Logger.getLogger(Seller.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
        
    }//GEN-LAST:event_SellerREMOVEButtonActionPerformed

    private void SellerCANCELButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellerCANCELButtonActionPerformed
      
     
            sellertxt.setText("");
            mobiletxt.setText("");
            emailtxt.setText("");
            addresstxt.setText("");
            
            sellertxt.requestFocus();
            
            DesignTableConnect();
            
            SellerADDButton.setEnabled(true);    
           
    }//GEN-LAST:event_SellerCANCELButtonActionPerformed

    private void sellertxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellertxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellertxtActionPerformed

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
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Seller().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable OutputDesignTable;
    private javax.swing.JButton SellerADDButton;
    private javax.swing.JButton SellerCANCELButton;
    private javax.swing.JButton SellerEDITButton;
    private javax.swing.JButton SellerREMOVEButton;
    private javax.swing.JTextField addresstxt;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mobiletxt;
    private javax.swing.JTextField sellertxt;
    // End of variables declaration//GEN-END:variables
}
