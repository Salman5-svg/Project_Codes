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
public class ProductList extends javax.swing.JFrame {

    /**
     * Creates new form ProductList
     */
    public ProductList() {
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
            pst=con.prepareStatement("SELECT * FROM product_table");
              ResultSet result=pst.executeQuery();
              
              ResultSetMetaData data = result.getMetaData();
              
              x=data.getColumnCount();
              
              def=(DefaultTableModel)OutputDesignTable.getModel();
              def.setRowCount(0);
              
              while(result.next()){
        
                Vector v1 = new Vector();
                
                for(i=1; i<=x; i++){
                  
                  v1.add(result.getString("SL"));
                  v1.add(result.getString("ProductCode"));
                  v1.add(result.getString("ProductName"));
                  v1.add(result.getString("Quantity"));
                  v1.add(result.getString("Price"));
                  v1.add(result.getString("TotalOrdered"));
                  
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        productnametext = new javax.swing.JTextField();
        productcodetext = new javax.swing.JTextField();
        quantitytext = new javax.swing.JTextField();
        pricetext = new javax.swing.JTextField();
        totalorderedtext = new javax.swing.JTextField();
        ProductEDITButton = new javax.swing.JButton();
        ProductDELETEButton = new javax.swing.JButton();
        ProductCANCELButton = new javax.swing.JButton();
        ProductADDButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        OutputDesignTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("Product_List");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Product Code: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Product Name: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Price: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Quantity:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Total Ordered:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pricetext, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(quantitytext, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(productnametext, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(productcodetext, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(totalorderedtext))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(productcodetext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(productnametext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(quantitytext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pricetext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(totalorderedtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        ProductEDITButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ProductEDITButton.setText("Edit");
        ProductEDITButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductEDITButtonActionPerformed(evt);
            }
        });

        ProductDELETEButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ProductDELETEButton.setText("Delete");
        ProductDELETEButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductDELETEButtonActionPerformed(evt);
            }
        });

        ProductCANCELButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ProductCANCELButton.setText("Cancel");
        ProductCANCELButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductCANCELButtonActionPerformed(evt);
            }
        });

        ProductADDButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ProductADDButton.setText("Add");
        ProductADDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductADDButtonActionPerformed(evt);
            }
        });

        OutputDesignTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial_No", "Product_Code", "Product_Name", "Quantity", "Price", "Total_Ordered"
            }
        ));
        OutputDesignTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OutputDesignTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(OutputDesignTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ProductADDButton)
                        .addGap(18, 18, 18)
                        .addComponent(ProductEDITButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ProductDELETEButton)
                        .addGap(18, 18, 18)
                        .addComponent(ProductCANCELButton))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProductEDITButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProductDELETEButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProductCANCELButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProductADDButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ProductADDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductADDButtonActionPerformed
       
        try {
            
            String productcode = productcodetext.getText();
            String productname = productnametext.getText();
            String quantity = quantitytext.getText();
            String price = pricetext.getText();
            String totalordered = totalorderedtext.getText();

            
            pst=con.prepareStatement("INSERT INTO product_table(ProductCode,ProductName,Quantity,Price,TotalOrdered)VALUES(?,?,?,?,?)");
            
            pst.setString(1,productcode);
            pst.setString(2,productname);
            pst.setString(3,quantity);
            pst.setString(4,price);
            pst.setString(5,totalordered);
              
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(this,"Product Added");
            
            productcodetext.setText("");
            productnametext.setText("");
            quantitytext.setText("");
            pricetext.setText("");
            totalorderedtext.setText("");

            productcodetext.requestFocus();
            
           DesignTableConnect();

               
        } catch (SQLException ex) {
            Logger.getLogger(Seller.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_ProductADDButtonActionPerformed

    private void ProductEDITButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductEDITButtonActionPerformed
        
        
         def = (DefaultTableModel)OutputDesignTable.getModel();
        
        int sel = OutputDesignTable.getSelectedRow();
        
        int SL = Integer.parseInt(def.getValueAt(sel,0).toString());
        
         String productcode = productcodetext.getText();
         String productname = productnametext.getText();
         String quantity = quantitytext.getText();
         String price = pricetext.getText();
         String totalordered = totalorderedtext.getText();

            
        try {
            
            pst=con.prepareStatement("UPDATE product_table SET ProductCode=?, ProductName=?,Quantity=?,Price=?, TotalOrdered=? WHERE SL=?");
            
            pst.setString(1,productcode);
            pst.setString(2,productname);
            pst.setString(3,quantity);
            pst.setString(4,price);
            pst.setString(5,totalordered);
            pst.setInt(6,SL);
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(this,"Product Information Updated");
            
            productcodetext.setText("");
            productnametext.setText("");
            quantitytext.setText("");
            pricetext.setText("");
            totalorderedtext.setText("");
             
            productcodetext.requestFocus();
            
            DesignTableConnect();
            
            ProductADDButton.setEnabled(true);

            
            
        } catch (SQLException ex) {
            Logger.getLogger(Seller.class.getName()).log(Level.SEVERE, null, ex);
        }
            
           
        
        
    }//GEN-LAST:event_ProductEDITButtonActionPerformed

    private void OutputDesignTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OutputDesignTableMouseClicked

        def = (DefaultTableModel)OutputDesignTable.getModel();
        
        int sel = OutputDesignTable.getSelectedRow();
        
        int id = Integer.parseInt(def.getValueAt(sel,0).toString());
        
        productcodetext.setText(def.getValueAt(sel,1).toString());
        productnametext.setText(def.getValueAt(sel,2).toString());
        quantitytext.setText(def.getValueAt(sel,3).toString());
        pricetext.setText(def.getValueAt(sel,4).toString());
        totalorderedtext.setText(def.getValueAt(sel,5).toString());

        ProductADDButton.setEnabled(false);
        
        
    }//GEN-LAST:event_OutputDesignTableMouseClicked

    private void ProductDELETEButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductDELETEButtonActionPerformed
        
        def = (DefaultTableModel)OutputDesignTable.getModel();
        
        int sel = OutputDesignTable.getSelectedRow();
        
        int SL = Integer.parseInt(def.getValueAt(sel,0).toString());
        
        
        
      

            
        try {
            
            pst=con.prepareStatement("DELETE FROM product_table WHERE SL=?");
            
           
            pst.setInt(1,SL);
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(this,"Product Information Removed");
            
            productcodetext.setText("");
            productnametext.setText("");
            quantitytext.setText("");
            pricetext.setText("");
            totalorderedtext.setText("");
            
            productcodetext.requestFocus();
            
            DesignTableConnect();
            
            ProductADDButton.setEnabled(true);

            
            
        } catch (SQLException ex) {
            Logger.getLogger(Seller.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
        
        
        
        
    }//GEN-LAST:event_ProductDELETEButtonActionPerformed

    private void ProductCANCELButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductCANCELButtonActionPerformed
        
          productcodetext.setText("");
          productnametext.setText("");
          quantitytext.setText("");
          pricetext.setText("");
          totalorderedtext.setText("");
            
          productcodetext.requestFocus();
            
          DesignTableConnect();
            
          ProductADDButton.setEnabled(true);    
           
        
        
        
        
    }//GEN-LAST:event_ProductCANCELButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ProductList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable OutputDesignTable;
    private javax.swing.JButton ProductADDButton;
    private javax.swing.JButton ProductCANCELButton;
    private javax.swing.JButton ProductDELETEButton;
    private javax.swing.JButton ProductEDITButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pricetext;
    private javax.swing.JTextField productcodetext;
    private javax.swing.JTextField productnametext;
    private javax.swing.JTextField quantitytext;
    private javax.swing.JTextField totalorderedtext;
    // End of variables declaration//GEN-END:variables
}
