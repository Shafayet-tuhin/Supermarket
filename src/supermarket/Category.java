/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

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
 * @author ASUS
 */
public class Category extends javax.swing.JFrame {

    /**
     * Creates new form Category
     */
    public Category() {
        try {
            initComponents();
            SelectCategory();
        } catch (SQLException ex) {
            Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        catid = new javax.swing.JLabel();
        Catid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Discription = new javax.swing.JTextField();
        edit = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        add = new javax.swing.JButton();
        clr = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Catagorytbl = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        cross = new javax.swing.JButton();
        Products = new javax.swing.JButton();
        Seller = new javax.swing.JButton();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.setForeground(new java.awt.Color(255, 153, 51));

        catid.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        catid.setForeground(new java.awt.Color(255, 153, 0));
        catid.setText("CATID");

        Catid.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Catid.setForeground(new java.awt.Color(255, 153, 0));
        Catid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatidActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("MANAGE CATAGORIES");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("NAME");

        Name.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Name.setForeground(new java.awt.Color(255, 153, 0));
        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setText("DESCRIPTION");

        Discription.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Discription.setForeground(new java.awt.Color(255, 153, 0));
        Discription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiscriptionActionPerformed(evt);
            }
        });

        edit.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        edit.setForeground(new java.awt.Color(255, 153, 0));
        edit.setText("Edit");
        edit.setBorder(null);
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 153, 0));
        delete.setText("Delete");
        delete.setBorder(null);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        add.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        add.setForeground(new java.awt.Color(255, 153, 0));
        add.setText("Add");
        add.setBorder(null);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        clr.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        clr.setForeground(new java.awt.Color(255, 153, 0));
        clr.setText("Clear");
        clr.setBorder(null);
        clr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clrActionPerformed(evt);
            }
        });

        Catagorytbl.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        Catagorytbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "DESCRIPTION"
            }
        ));
        Catagorytbl.setIntercellSpacing(new java.awt.Dimension(0, 0));
        Catagorytbl.setRowHeight(25);
        Catagorytbl.setSelectionBackground(new java.awt.Color(255, 153, 51));
        jScrollPane1.setViewportView(Catagorytbl);

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 0));
        jLabel7.setText("PRODUCTS LIST");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(26, 26, 26)
                                .addComponent(Discription, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(catid, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Catid, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(clr, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(327, 327, 327)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(catid)
                        .addComponent(Catid, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Discription, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clr, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cross.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        cross.setForeground(new java.awt.Color(255, 153, 51));
        cross.setText("X");
        cross.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crossActionPerformed(evt);
            }
        });

        Products.setForeground(new java.awt.Color(255, 153, 0));
        Products.setText("Products");
        Products.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductsActionPerformed(evt);
            }
        });

        Seller.setForeground(new java.awt.Color(255, 153, 0));
        Seller.setText("Seller");
        Seller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellerActionPerformed(evt);
            }
        });

        logout.setForeground(new java.awt.Color(255, 153, 0));
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
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
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cross, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Products)
                                    .addComponent(Seller))
                                .addGap(0, 1, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(logout)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(cross, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(Products)
                        .addGap(58, 58, 58)
                        .addComponent(Seller)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logout)
                        .addGap(56, 56, 56))))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    public void SelectCategory() throws SQLException {
        try {
            int c;
            Class.forName("com.mysql.cj.jdbc.Driver");  
            con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/market","root","root");
            pst=con.prepareStatement("select * from catagorytbl");
            ResultSet rs = pst.executeQuery();
            ResultSetMetaData rad = rs.getMetaData();
            c = rad.getColumnCount();
            DefaultTableModel DF = (DefaultTableModel)Catagorytbl.getModel();
            DF.setRowCount(0);        
            while(rs.next())
            {
                Vector v2 = new Vector();
                for(int i = 1; i<=c; i++)
                {
                    v2.add(rs.getString("Catid"));
                    v2.add(rs.getString("Name"));
                    v2.add(rs.getString("Discription"));
                }
                DF.addRow(v2);     
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
        }
     } 
    private void CatidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CatidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CatidActionPerformed

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void DiscriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiscriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DiscriptionActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
         DefaultTableModel D1 = (DefaultTableModel)Catagorytbl.getModel();
          int selectIndex=Catagorytbl.getSelectedRow();
            String id=(D1.getValueAt(selectIndex,0).toString());
            int Id = Integer.valueOf(Catid.getText());
            String name=Name.getText();
            String  discription=Discription.getText();
          
            
           int dial_res=JOptionPane.showConfirmDialog(null,"Do you want to Edit the selected data?","Warning",JOptionPane.YES_NO_OPTION);
           if(dial_res==JOptionPane.YES_OPTION){
                 try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/market","root","root");
                pst = con.prepareStatement("update catagorytbl set Name=?,Discription=? where Catid=?");
              
               // pst.setInt(1,Id);
                pst.setString(1,name);
                pst.setString(2,discription);
                pst.setString(3,id);
                 int k=pst.executeUpdate();
                              if(k==1){
                                        JOptionPane.showMessageDialog(null,"Data Updated");
                                      //  SelId.setText("");
                                        Name.setText("");
                                        Discription.setText("");
                                        Catid.requestFocus();
                                        SelectCategory();
                                }
                              else {
                                        JOptionPane.showMessageDialog(this,"Not Updated");
                              }
                
           }   catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Seller.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
          
    }//GEN-LAST:event_editActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
         DefaultTableModel D1 = (DefaultTableModel)Catagorytbl.getModel();
        int selectIndex=Catagorytbl.getSelectedRow();
        int id=Integer.parseInt(D1.getValueAt(selectIndex,0).toString());
        
           int dial_res=JOptionPane.showConfirmDialog(null,"Do you want to delete the selected data?","Warning",JOptionPane.YES_NO_OPTION);
           if(dial_res==JOptionPane.YES_OPTION){
                 try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/market","root","root");
                pst = con.prepareStatement("delete from catagorytbl where Catid=?");
                pst.setInt(1,id);
                 int k=pst.executeUpdate();
                              if(k==1){
                                        JOptionPane.showMessageDialog(null,"Data deleted");
                                        Name.setText("");
                                        Discription.setText("");
                                        Catid.requestFocus();
                                        SelectCategory();
                                }
                              else {
                                        JOptionPane.showMessageDialog(this,"Not deleted");
                              }
                
           }   catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Seller.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
        
    }//GEN-LAST:event_deleteActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
                try {
            // TODO add your handling code here:
            int id = Integer.valueOf(Catid.getText());
            String name=Name.getText();
            String Discrip=Discription.getText();
     
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/market","root","root");
            pst = con.prepareStatement("insert into catagorytbl(Catid,Name,Discription) values(?,?,?)");
            pst.setInt(1,id);
            pst.setString(2,name);
            pst.setString(3,Discrip);
            int k=pst.executeUpdate();
            if(k==1){
                JOptionPane.showMessageDialog(null,"Table updated");
                 Catid.setText("");
                 Name.setText("");
                 Discription.setText("");                  
                 SelectCategory();
            }
            else {
                JOptionPane.showMessageDialog(this,"Table Not Updated");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }//GEN-LAST:event_addActionPerformed

    private void clrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clrActionPerformed
        // TODO add your handling code here:
                Catid.setText("");
                 Name.setText("");
                 Discription.setText(""); 
        
    }//GEN-LAST:event_clrActionPerformed

    private void crossActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crossActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_crossActionPerformed

    private void ProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductsActionPerformed
        // TODO add your handling code here:
          new Products().setVisible(true);
           this.dispose();
        
    }//GEN-LAST:event_ProductsActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
          new Login().setVisible(true);
          this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void SellerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellerActionPerformed
        try {
            // TODO add your handling code here:
            new Seller().setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_SellerActionPerformed

   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Category().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Catagorytbl;
    private javax.swing.JTextField Catid;
    private javax.swing.JTextField Discription;
    private javax.swing.JTextField Name;
    private javax.swing.JButton Products;
    private javax.swing.JButton Seller;
    private javax.swing.JButton add;
    private javax.swing.JLabel catid;
    private javax.swing.JButton clr;
    private javax.swing.JButton cross;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout;
    // End of variables declaration//GEN-END:variables
}
